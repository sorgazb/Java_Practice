package pruebas.evaluacion3.pruebaFinal;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JFrame;


public class ReservasDAO {
	public static final String RUTA_ESCRITURA = "ficheros";
	public static Scanner entrada= new Scanner(System.in);
	private String url;
	private String usuario;
	private String password;
	private Connection jdbcConnection;
	static String [] cabecera;
	static String [] cabeceraPagos;
	
	public ReservasDAO(String url, String usuario, String password) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}
	
	//Metodo el cual ejecuta una sentencia SQL el cual inserta las reservas en la tabla reserva de la base de datos:
	public boolean insertarReserva(Reserva reserva) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="INSERT INTO reservas(documento, fecha, hora, cita, estado_pago, "
				+ "tramite, telefono, email)"
				+ "VALUES (?,?,?,?,?,?,?,?)";

		conectar();
		try {
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, reserva.getDocumento());
			sentenciaPreparada.setString(2, reserva.getFecha());
			sentenciaPreparada.setString(3, ""+reserva.getHora());
			sentenciaPreparada.setString(4, ""+reserva.getNumeroCita());
			sentenciaPreparada.setString(5, reserva.getEstadoPago());
			sentenciaPreparada.setString(6, reserva.getTramite());
			sentenciaPreparada.setString(7, reserva.getTelefono());
			sentenciaPreparada.setString(8, reserva.getEmail());
			
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
			System.out.println("Reserva Registrada.");
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("ERROR. Ese certificado ya existe.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(reserva.getEstadoPago().equals("Pagado")) {
			System.out.println("Datos del pago.");
			insertarPagos(reserva);
			crearCarpetasJustificantesPagos();
			//escribirBinarioJustificantePago(reserva);
			justificanteBinario(reserva);
		}
		
		desconectar();
		
		return filaInsertada;
	}
	
	
	//Metodo el cual ejecuta una sentencia SQL el cual inserta los pagos en la tabla pago de la base de datos:
	public boolean insertarPagos(Reserva reserva) {
		boolean filaInsertada=false;
		
		String sentenciaSQL="INSERT INTO pagos(numero_reserva,metodo_pago,datos_pago)"
				+ "VALUES (?,?,?)";

		conectar();
		try {
			String metodoPago=pedirMetodoPago();
			System.out.println("Introduce los datos bancarios.");
			String datosBancarios=entrada.nextLine();
			PreparedStatement sentenciaPreparada=jdbcConnection.prepareStatement(sentenciaSQL);
			sentenciaPreparada.setString(1, ""+reserva.getNumeroCita());
			sentenciaPreparada.setString(2, metodoPago);
			sentenciaPreparada.setString(3, datosBancarios);
			
			filaInsertada=sentenciaPreparada.executeUpdate() > 0;
			
			sentenciaPreparada.close();
			
			System.out.println("Pago Registrado.");
		
		}catch (SQLIntegrityConstraintViolationException e) {
			System.err.println("ERROR");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return filaInsertada;
	}
	
	//Metodo de conexion con la base de datos:
	private void conectar() {
		try {
			if(jdbcConnection==null || jdbcConnection.isClosed()) {
				jdbcConnection=DriverManager.getConnection(url,usuario,password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Metodo de desconexion con la base de datos:
	private void desconectar() {
		try {
			if(jdbcConnection!=null && !jdbcConnection.isClosed()) {
				jdbcConnection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Metodo el cual el usuario indica el metodo de pago que quiere realizar
	private String pedirMetodoPago() {
		String metodoPago="";
		int opcion=0;
		System.out.println("Introduce el metodo de Pago:");
		System.out.println("1->Tarjeta de Credito.");
		System.out.println("2->IBAN");
		
		do {
			System.out.println("Opcion:");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				metodoPago="Tarjeta";
				opcion=0;
				break;
			case 2:
				metodoPago="IBAN";
				opcion=0;
				break;
			default:
				System.out.println("Opcion no valida.");
				break;
			}
			entrada.nextLine();
		}while(opcion!=0);
		return metodoPago;
	}
	
	private void crearCarpetasJustificantesPagos() {
		File directorio = new File(RUTA_ESCRITURA + "/citasdni/justificantes/pagos");
		if (directorio.exists()) {
		} else {
			directorio.mkdir();
		}
	}

	private void justificanteBinario(Reserva reserva) {
		String numCita=""+reserva.getNumeroCita();
		String fecha=reserva.getFecha();
		String hora=""+reserva.getHora();
		try (DataOutputStream oos= new DataOutputStream(new FileOutputStream(new File(RUTA_ESCRITURA + "/citasdni/justificantes/pagos/"+reserva.getNumeroCita()+".dat")))) {
			
			oos.writeUTF(numCita);
			oos.writeUTF(fecha);
			oos.writeUTF(hora);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarTablaCitas() {
		String titulo="Citas";
		cabecera=new String [] {"ID","Documento","Fecha", "Hora", "Cita", "Estado_Pago","Tramite","Telefono","Email"};
		String [][] datosTabla=recuperarListadoCitas();
		new TablaCitas(datosTabla,cabecera,titulo).setVisible(true);
	}
	
	//Recuperamos toda la informacion de las citas para mostrarlo en una tabla por interfaz gráfica.
	public String[][] recuperarListadoCitas() {
		conectar();
		
		String [][] datos=null;
		
		try {
			RowSetFactory rowSetFactory= RowSetProvider.newFactory();
			
			JdbcRowSet rowSet= rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			
			rowSet.setCommand("SELECT * FROM reservas");
			rowSet.execute();
			
			//Obtener numero de filas que nos devuelve la sentencia:
			int numFilas=0;
			if(rowSet.last()) {
				numFilas=rowSet.getRow();
				rowSet.beforeFirst();//Regresa el cursor a la primera posicion.
			}
			
			datos= new String [numFilas][cabecera.length];
			
			int contadorFilas=0;
			while(rowSet.next()) {
				String [] citas= new String [cabecera.length];
				citas[0]= String.valueOf(rowSet.getInt("id"));
				citas[1]= rowSet.getString("documento");
				citas[2]= rowSet.getString("fecha");
				citas[3]= rowSet.getString("hora");
				citas[4]= rowSet.getString("cita");
				citas[5]= rowSet.getString("estado_pago");
				citas[6]= rowSet.getString("tramite");
				citas[7]= rowSet.getString("telefono");
				citas[8]= rowSet.getString("email");
				
				
				datos[contadorFilas]=citas;
				contadorFilas++;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return datos;

	}
	
	public void mostrarTablaPagos() {
		String titulo="Pagos";
		cabecera=new String [] {"ID","Numero Cita","Metodo Pago", "Datos Pago"};
		String [][] datosTabla=recuperarListadoPago();
		new TablaPagos(datosTabla,cabecera,titulo).setVisible(true);
	}
	
	public String[][] recuperarListadoPago() {
		conectar();
		
		String [][] datos=null;
		
		try {
			RowSetFactory rowSetFactory= RowSetProvider.newFactory();
			
			JdbcRowSet rowSet= rowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(url);
			rowSet.setUsername(usuario);
			rowSet.setPassword(password);
			
			rowSet.setCommand("SELECT * FROM pagos");
			rowSet.execute();
			
			//Obtener numero de filas que nos devuelve la sentencia:
			int numFilas=0;
			if(rowSet.last()) {
				numFilas=rowSet.getRow();
				rowSet.beforeFirst();//Regresa el cursor a la primera posicion.
			}
			
			datos= new String [numFilas][cabecera.length];
			
			int contadorFilas=0;
			while(rowSet.next()) {
				String [] pagos= new String [cabecera.length];
				pagos[0]= String.valueOf(rowSet.getInt("id"));
				pagos[1]= rowSet.getString("numero_reserva");
				pagos[2]= rowSet.getString("metodo_pago");
				pagos[3]= rowSet.getString("datos_pago");
			
				datos[contadorFilas]=pagos;
				contadorFilas++;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		desconectar();
		
		return datos;

	}
	

	
	
}
