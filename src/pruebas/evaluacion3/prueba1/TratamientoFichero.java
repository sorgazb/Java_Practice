package pruebas.evaluacion3.prueba1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class TratamientoFichero {
	public static final String RUTA_LECTURA = "ficheros/pruebas/balances.csv";
	public static final String RUTA_ESCRITURA = "ficheros/pruebas";
	public static Map<String, List<Cuenta>> mapaCuentasPais = new HashMap<String, List<Cuenta>>();

	public static void main(String[] args) {
		leerFichero();
		mostrarTodo();
		crearCarpetasPais();
		crearFicheroCuentasPais();
		crearFicheroCuentasPaisDescubierto();
		crearFicheroCuentasPaisJSON();
		crearFicheroCuentasPaisBinario();
		crearFicheroCuentasPaisBinarioNegativo();
		volcarFicheros();
	}

	public static void leerFichero() {
		try {

			File fichero = new File(RUTA_LECTURA);
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);

			int numeroLinea = 0;
			String linea = br.readLine();
			while (linea != null) {
				if (linea != null && numeroLinea > 0) {
					String[] campos = linea.split(",");
					if (campos.length > 2) {
						Cuenta cuenta = crearCuenta(campos);
						guardarCuentaPorPais(cuenta);
					}

				}
				linea = br.readLine();
				numeroLinea++;
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Cuenta crearCuenta(String[] campos) {
		Cuenta cuenta = new Cuenta(campos[0], campos[1], Double.parseDouble(campos[2]));
		return cuenta;
	}

	public static void guardarCuentaPorPais(Cuenta cuenta) {
		List<Cuenta> listaCuentas = new ArrayList<Cuenta>();
		String iban = cuenta.getIBAN();
		String pais = iban.substring(0, 2);
		if (mapaCuentasPais.containsKey(pais)) {
			mapaCuentasPais.get(pais).add(cuenta);
		} else {
			listaCuentas.add(cuenta);
			mapaCuentasPais.put(pais, listaCuentas);
		}
	}

	public static void mostrarTodo() {
		for (String pais : mapaCuentasPais.keySet()) {
			System.out.println("Pais:" + pais);
			for (Cuenta cuenta : mapaCuentasPais.get(pais)) {
				System.out.println(cuenta);
			}
		}
	}

	public static void crearCarpetasPais() {
		for (String pais : mapaCuentasPais.keySet()) {
			File directorio = new File(RUTA_ESCRITURA + "/" + pais);
			if (directorio.exists()) {
				System.err.println("ERROR.El directorio ya existe");
			} else {
				directorio.mkdir();
				// crearFicheroEquipos();
			}
		}
	}

	public static void crearFicheroCuentasPais() {
		for (String pais : mapaCuentasPais.keySet()) {
			for (Cuenta cuenta : mapaCuentasPais.get(pais)) {
				File fichero = new File(RUTA_ESCRITURA + "/" + pais + "/cuentas.txt");
				if (fichero.exists()) {
				} else {
					try {
						if (fichero.createNewFile()) {
							// System.out.printf("Fichero %s creado con éxito.",equipo+".json");
						} else {
							// System.err.println("ERROR. No se ha creado el dichero.");
						}
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				}
			}
		}
	}

	public static void crearFicheroCuentasPaisBinario() {
		for (String pais : mapaCuentasPais.keySet()) {
			for (Cuenta cuenta : mapaCuentasPais.get(pais)) {
				File fichero = new File(RUTA_ESCRITURA + "/" + pais + "/cuentas.dat");
				if (fichero.exists()) {
				} else {
					try {
						if (fichero.createNewFile()) {
							// System.out.printf("Fichero %s creado con éxito.",equipo+".json");
						} else {
							// System.err.println("ERROR. No se ha creado el dichero.");
						}
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				}
			}
		}
	}
	
	public static void crearFicheroCuentasPaisBinarioNegativo() {
		for (String pais : mapaCuentasPais.keySet()) {
			for (Cuenta cuenta : mapaCuentasPais.get(pais)) {
				File fichero = new File(RUTA_ESCRITURA + "/" + pais + "/cuentasEnDescubierto.dat");
				if (fichero.exists()) {
				} else {
					try {
						if (fichero.createNewFile()) {
							// System.out.printf("Fichero %s creado con éxito.",equipo+".json");
						} else {
							// System.err.println("ERROR. No se ha creado el dichero.");
						}
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				}
			}
		}
	}

	public static void crearFicheroCuentasPaisDescubierto() {
		for (String pais : mapaCuentasPais.keySet()) {
			for (Cuenta cuenta : mapaCuentasPais.get(pais)) {
				File fichero = new File(RUTA_ESCRITURA + "/" + pais + "/cuentasEnDescubierto.txt");
				if (fichero.exists()) {
				} else {
					try {
						if (fichero.createNewFile()) {
							// System.out.printf("Fichero %s creado con éxito.",equipo+".json");
						} else {
							// System.err.println("ERROR. No se ha creado el dichero.");
						}
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				}
			}
		}
	}

	public static void crearFicheroCuentasPaisJSON() {
		for (String pais : mapaCuentasPais.keySet()) {
			for (Cuenta cuenta : mapaCuentasPais.get(pais)) {
				File fichero = new File(RUTA_ESCRITURA + "/" + pais + "/cuentasPlus.json");
				if (fichero.exists()) {
				} else {
					try {
						if (fichero.createNewFile()) {
							// System.out.printf("Fichero %s creado con éxito.",equipo+".json");
						} else {
							// System.err.println("ERROR. No se ha creado el dichero.");
						}
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}

				}
			}
		}
	}

	public static void volcarFicheros() {

		try {
			Properties propiedades = new Properties();
			FileInputStream fis = new FileInputStream("ficheros/pruebas/limites.properties");
			propiedades.load(fis);
			String superior = propiedades.getProperty("limSuperior");
			double liminte = Double.parseDouble(superior);
			for (String pais : mapaCuentasPais.keySet()) {
				List<Cuenta> cuentaPositivo = new ArrayList<Cuenta>();
				List<Cuenta> cuentaNegativo = new ArrayList<Cuenta>();
				List<Cuenta> cuentaJson = new ArrayList<Cuenta>();
				List<Cuenta> cuentaPositivoBinario = new ArrayList<Cuenta>();
				List<Cuenta> cuentaNegativoBinario = new ArrayList<Cuenta>();
				for (Cuenta cuentaAux : mapaCuentasPais.get(pais)) {
					if (cuentaAux.getBalance() > 0) {
						if (cuentaPositivo.isEmpty()) {
							cuentaPositivo.add(cuentaAux);
						} else {
							cuentaPositivo.add(cuentaAux);
						}

						if (cuentaAux.getBalance() > liminte) {
							if (cuentaJson.isEmpty()) {
								cuentaJson.add(cuentaAux);
							} else {
								cuentaJson.add(cuentaAux);
							}
						}
						
						if(cuentaPositivoBinario.isEmpty()) {
							cuentaPositivoBinario.add(cuentaAux);
						}else {
							cuentaPositivoBinario.add(cuentaAux);
						}
					} else {
						if (cuentaNegativo.isEmpty()) {
							cuentaNegativo.add(cuentaAux);
						} else {
							cuentaNegativo.add(cuentaAux);
						}
						if(cuentaNegativoBinario.isEmpty()) {
							cuentaNegativoBinario.add(cuentaAux);
						}else {
							cuentaNegativoBinario.add(cuentaAux);
						}
					}
				}
				if (!cuentaPositivo.isEmpty()) {
					escribirTxtCuentasPositivas(cuentaPositivo);
				}
				if (!cuentaNegativo.isEmpty()) {
					escribirTxtCuentasNegativas(cuentaNegativo);
				}
				if (!cuentaJson.isEmpty()) {
					escribirJson(cuentaJson);
				}
				if (!cuentaPositivoBinario.isEmpty()) {
					escribirBinario(cuentaPositivoBinario);
				}
				if (!cuentaNegativoBinario.isEmpty()) {
					escribirBinarioNegativas(cuentaNegativoBinario);
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void escribirTxtCuentasPositivas(List<Cuenta> cuentas) {
		try {
			PrintWriter escritor = new PrintWriter(
					RUTA_ESCRITURA + "/" + cuentas.get(0).getIBAN().substring(0, 2) + "/cuentas.txt");
			Iterator it = cuentas.iterator();
			while (it.hasNext()) {
				Cuenta cuenta = (Cuenta) it.next();
				escritor.println(cuenta.getIdCliente() + "," + cuenta.getIBAN() + "," + cuenta.getBalance());
			}

			escritor.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void escribirTxtCuentasNegativas(List<Cuenta> cuentas) {
		try {
			PrintWriter escritor = new PrintWriter(
					RUTA_ESCRITURA + "/" + cuentas.get(0).getIBAN().substring(0, 2) + "/cuentasEnDescubierto.txt");
			Iterator it = cuentas.iterator();
			while (it.hasNext()) {
				Cuenta cuenta = (Cuenta) it.next();
				escritor.println(cuenta.getIdCliente() + "," + cuenta.getIBAN() + "," + cuenta.getBalance());
			}

			escritor.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void escribirJson(List<Cuenta> cuentas) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String contenidoJson = gson.toJson(cuentas);
		try {
			FileWriter escritor = new FileWriter(
					RUTA_ESCRITURA + "/" + cuentas.get(0).getIBAN().substring(0, 2) + "/cuentasPlus.json");
			escritor.write(contenidoJson);
			escritor.close();
			System.out.println("Escritura completada");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void escribirBinario(List<Cuenta> cuentas) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File(RUTA_ESCRITURA + "/" + cuentas.get(0).getIBAN().substring(0, 2) + "/cuentas.dat")))) {
			for(Cuenta cuenta:cuentas) {
				oos.writeObject(cuenta);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void escribirBinarioNegativas(List<Cuenta> cuentas) {
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File(RUTA_ESCRITURA + "/" + cuentas.get(0).getIBAN().substring(0, 2) + "/cuentasEnDescubierto.dat")))) {
			for(Cuenta cuenta:cuentas) {
				oos.writeObject(cuenta);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
