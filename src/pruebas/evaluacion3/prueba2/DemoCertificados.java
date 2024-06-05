package pruebas.evaluacion3.prueba2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

import ejerciciosEjemplo.practicasBD.Discografia.Artistas;
import ejerciciosEjemplo.practicasBD.Discografia.Discografia;
import unidad12.ConfiguracionBD;

public class DemoCertificados {
	
	static Properties configuracion= new Properties();
	static String url;
	static String usuario;
	static String password;
	public static List<CertificadoEnergetico> listaFichero= new ArrayList<CertificadoEnergetico>();
	private static Map<String, Empresa> mapaEmpresas= new HashMap<String, Empresa>();


	public static void main(String[] args) {
		cargarConfiguracionBD();
		List<String> listaCertificados= new ArrayList<String>();
		
		try {
			listaCertificados = Files.readAllLines(Paths.get("ficheros/pruebas/certificados/certificadosEnergeticos.txt")
					,StandardCharsets.UTF_8);
		}catch (IOException e) {
			e.printStackTrace();
		}
		int cont=0;
		for(String lineaCertificado:listaCertificados) {
			if(cont>0) {
				String [] datos=lineaCertificado.split(";");
				CertificadoEnergetico certificado=new CertificadoEnergetico(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7]);
				listaFichero.add(certificado);
			}
			cont++;
		}
		compararFicheroBD();
		
		ODB odb = ODBFactory.open("certificados.db");
		aniadirCertificadoBD(odb);
		leerCertificadosBDOO(odb);
		odb.close();
		crearTablaEmpresasBD();
		CertificadosDAO certificadoDAO= new CertificadosDAO(url, usuario, password);
		insertarEmpresasMapa(certificadoDAO.listarTodosLosProductos());
		insertarEmpresasBD();
		mostrarEmpresas();
	}
	
	public static void compararFicheroBD() {
		CertificadosDAO certificadoDAO= new CertificadosDAO(url, usuario, password);
		List<CertificadoEnergetico> certificadosBD=certificadoDAO.listarTodosLosProductos();
		for(CertificadoEnergetico certificadoBD:certificadosBD) {
			for(CertificadoEnergetico certificadoFichero:listaFichero) {
				if(certificadoFichero.getId().equals(certificadoBD.getId())) {
					if(estaCertificadoBD(certificadoFichero, certificadosBD)==true) {
						if(comprobarCamposIguales(certificadoFichero, certificadoBD)==false) {
							actualizarCertificadoBD(certificadoFichero, certificadoBD.getId());
						}
					}
					else {
						insertarCertificadoBD(certificadoFichero);
					}
				}else {
					if(estaCertificadoFichero(certificadoBD)==false) {
						borrarCertificadoBD(certificadoBD);
					}
					else {
						insertarCertificadoBD(certificadoFichero);
					}
				}
			}
		}
	}
	
	private static boolean comprobarCamposIguales(CertificadoEnergetico fichero, CertificadoEnergetico bd) {
		boolean iguales=false;
		if(fichero.getId().equals(bd.getId())) {
			if(fichero.getPropietario().equals(bd.getPropietario())) {
				if(fichero.getDireccion().equals(bd.getDireccion())) {
					if(fichero.getTipoPropiedad().equals(bd.getTipoPropiedad())) {
						if(fichero.getClasificacion().equals(bd.getClasificacion())) {
							if(fichero.getFechaExpedicion().equals(bd.getFechaExpedicion())) {
								if(fichero.getEmpresaCertificadora().equals(bd.getEmpresaCertificadora())) {
									if(fichero.getCodigoTecnico().equals(bd.getCodigoTecnico())) {
										iguales=true;
									}
								}
							}
						}
					}
				}
			}
		}
		return iguales;
		
	}
	
	private static void actualizarCertificadoBD(CertificadoEnergetico certificadoFichero, String id) {
		CertificadosDAO certificadoDAO= new CertificadosDAO(url, usuario, password);
		certificadoDAO.actualizarCertificado(certificadoFichero, id);
		
	}
	
	private static void borrarCertificadoBD(CertificadoEnergetico certificadoFichero) {
		CertificadosDAO certificadoDAO= new CertificadosDAO(url, usuario, password);
		certificadoDAO.borrarCertificado(certificadoFichero);
		
	}
	
	private static void insertarCertificadoBD(CertificadoEnergetico certificadoFichero) {
		CertificadosDAO certificadoDAO= new CertificadosDAO(url, usuario, password);
		certificadoDAO.insertarCertificado(certificadoFichero);
		
	}

	public static boolean estaCertificadoFichero(CertificadoEnergetico certificado) {
		boolean esta=false;
		for(CertificadoEnergetico certificadoFichero:listaFichero) {
			if(certificado.getId().equals(certificadoFichero.getId())) {
				esta=true;
			}
		}
		return esta;
	}
	
	public static boolean estaCertificadoBD(CertificadoEnergetico certificado,List<CertificadoEnergetico> certificadosBD) {
		boolean esta=false;
		for(CertificadoEnergetico certificadoBD:certificadosBD) {
			if(certificado.getId().equals(certificadoBD.getId())) {
				esta=true;
			}
		}
		return esta;
	}
	
	
	public static void cargarConfiguracionBD() {
		FileInputStream fis;
		try {
			fis=new FileInputStream(ConfiguracionBD.ficheroConfiguracioBD);
			configuracion.load(fis);
			url= configuracion.getProperty("urlBD");
			usuario= configuracion.getProperty("user");
			password=configuracion.getProperty("password");
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static void aniadirCertificadoBD(ODB odb) {
		CertificadosDAO certificadoDAO= new CertificadosDAO(url, usuario, password);
		List<CertificadoEnergetico> certificadosBD=certificadoDAO.listarTodosLosProductos();
		for(CertificadoEnergetico certificado:certificadosBD) {
			if(certificado.getTipoPropiedad().equals("Residencial")) {
				odb.store(certificado);
			}
		}
	}
	
	private static void leerCertificadosBDOO(ODB odb) {
        Objects<CertificadoEnergetico> certificados = odb.getObjects(CertificadoEnergetico.class);
        System.out.println("Listado de Certificados Residenciales:");
        while (certificados.hasNext()) {
            CertificadoEnergetico certificado = certificados.next();
            if(certificado.getTipoPropiedad().equals("Residencial")) {
            	System.out.println(certificado);
            } 
        }
	}
	
	private static void insertarEmpresasMapa(List<CertificadoEnergetico> certificadosBD) {
		for(CertificadoEnergetico certificado:certificadosBD) {
			Empresa empresa= new Empresa(certificado.getCodigoTecnico(), certificado.getEmpresaCertificadora());
			if(mapaEmpresas.containsKey(certificado.getCodigoTecnico())) {
				mapaEmpresas.put(certificado.getCodigoTecnico(), empresa);
			}else {
				mapaEmpresas.put(certificado.getCodigoTecnico(), empresa);
			}
		}
	}
	
	private static void insertarEmpresasBD() {
		for(String codigo: mapaEmpresas.keySet()) {
			CertificadosDAO certificadoDAO= new CertificadosDAO(url, usuario, password);
			certificadoDAO.insertarEmpresa(mapaEmpresas.get(codigo));
		}
	}
	
	private static void mostrarEmpresas() {
		for(String codigo: mapaEmpresas.keySet()) {
			System.out.println(mapaEmpresas.get(codigo));
		}
	}
	
	private static void crearTablaEmpresasBD() {
		CertificadosDAO certificadoDAO= new CertificadosDAO(url, usuario, password);
		certificadoDAO.crearTabla();
		
	}

}
