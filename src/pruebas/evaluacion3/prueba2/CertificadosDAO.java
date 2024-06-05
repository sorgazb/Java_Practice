package pruebas.evaluacion3.prueba2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;



public class CertificadosDAO {
	
	private String url;
	private String usuario;
	private String password;
	private Connection jdbcConnection;
	
	public CertificadosDAO(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}
	
	
	public List<CertificadoEnergetico> listarTodosLosProductos(){
		List<CertificadoEnergetico> listaBD= new ArrayList<CertificadoEnergetico>();
		
		try {
			RowSetFactory rowSetFactory= RowSetProvider.newFactory();
			JdbcRowSet rowSet= rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			rowSet.setCommand("SELECT * FROM certificados_energeticos");
			rowSet.execute();
			
			//Obtener numero de filas que nos devuelve la sentencia:
			int numFilas=0;
			if(rowSet.last()) {
				numFilas=rowSet.getRow();
				rowSet.beforeFirst();//Regresa el cursor a la primera posicion.
			}
			
			int contadorFilas=0;
			while(rowSet.next()) {
				CertificadoEnergetico certificado= new CertificadoEnergetico("", "", "", "", "", "", "", "");
				certificado.setId(rowSet.getString("id_certificado"));
				certificado.setPropietario(rowSet.getString("propietario"));
				certificado.setDireccion(rowSet.getString("direccion"));
				certificado.setTipoPropiedad(rowSet.getString("tipo_de_propiedad"));
				certificado.setClasificacion(rowSet.getString("clasificacion_energetica"));
				certificado.setFechaExpedicion(rowSet.getString("fecha_de_expedicion"));
				certificado.setEmpresaCertificadora(rowSet.getString("empresa_certificadora"));
				certificado.setCodigoTecnico(rowSet.getString("codigo_tecnico"));
				listaBD.add(certificado);
				contadorFilas++;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return listaBD;
	}
	
	public boolean actualizarCertificado(CertificadoEnergetico certificado, String id) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="UPDATE certificados_energeticos SET "
				+ "propietario=?,direccion=?,tipo_de_propiedad=?,clasificacion_energetica=?,"
				+ "fecha_de_expedicion=?, empresa_certificadora=?, codigo_tecnico=? WHERE id_certificado='"+id+"'";
		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, certificado.getPropietario());
			sentenciaPreparada.setString(2, certificado.getDireccion());
			sentenciaPreparada.setString(3, certificado.getTipoPropiedad());
			sentenciaPreparada.setString(4, certificado.getClasificacion());
			sentenciaPreparada.setString(5, certificado.getFechaExpedicion());
			sentenciaPreparada.setString(6, certificado.getEmpresaCertificadora());
			sentenciaPreparada.setString(7, certificado.getCodigoTecnico());
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
			
			System.out.println("Certificado Actualizado.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
	}
	
	public boolean insertarCertificado(CertificadoEnergetico certificado) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="INSERT INTO certificados_energeticos(id_certificado, propietario, direccion, "
				+ "tipo_de_propiedad, clasificacion_energetica, fecha_de_expedicion, empresa_certificadora, codigo_tecnico) "
				+ "VALUES (?,?,?,?,?,?,?,?)";

		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, certificado.getId());
			sentenciaPreparada.setString(2, certificado.getPropietario());
			sentenciaPreparada.setString(3, certificado.getDireccion());
			sentenciaPreparada.setString(4, certificado.getTipoPropiedad());
			sentenciaPreparada.setString(5, certificado.getClasificacion());
			sentenciaPreparada.setString(6, certificado.getFechaExpedicion());
			sentenciaPreparada.setString(7, certificado.getEmpresaCertificadora());
			sentenciaPreparada.setString(8, certificado.getCodigoTecnico());
			
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
			System.out.println("Certificado Insertado.");
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("ERROR. Ese certificado ya existe.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
	}
	
	public boolean borrarCertificado(CertificadoEnergetico certificado) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="DELETE FROM certificados_energeticos WHERE id_certificado='"+certificado.getId()+"'";

		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			sentenciaPreparada.close();
			System.out.println("Certificado Borrado.");
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("ERROR. Ese certificado ya existe.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
	}
	

	private void conectar() {
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()) {
				jdbcConnection=DriverManager.getConnection(url,usuario,password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void desconectar() {
		try {
			if(jdbcConnection!=null && !jdbcConnection.isClosed()) {
				jdbcConnection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void crearTabla() {
		conectar();
		try {
			String sqlSentence="CREATE TABLE empresas (codigo VARCHAR(10) PRIMARY KEY, nombre VARCHAR(255));";
			PreparedStatement sentencia=jdbcConnection.prepareStatement(sqlSentence);
			sentencia.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		desconectar();
	}
	
	public boolean insertarEmpresa(Empresa empresa) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="INSERT INTO empresas(codigo, nombre)"
				+ "VALUES (?,?)";

		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, empresa.getCodigo());
			sentenciaPreparada.setString(2, empresa.getNombre());
			
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
			System.out.println("Empresa insertada Insertado.");
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("ERROR. Ese certificado ya existe.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
	}
}
