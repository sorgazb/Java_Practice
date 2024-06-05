package unidad13.ejerciciosU13.listarPersonas;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class FlowLayoutDemo extends JFrame {
	
	static Properties configuracion=new Properties();
	
	 private JTextField nombre;
	 private JTextField apellido;
	 private JTextField ciudad;
	 
	 // PARA AÑADIR UN JList
	 private JList listaNombres; // Lista de personas
	 private DefaultListModel modelo; // Objeto que modela la lista
	 private JScrollPane scrollLista; // Barra de desplazamiento vertical
	 
	 private JPanel panel;
	 
	
    public FlowLayoutDemo() {
        super("Ventana con FlowLayout");
        setLayout(new FlowLayout());
        add(new JLabel("Nombre:"));
        nombre =new JTextField(10); 
        add(nombre);
        add(new JLabel("Apellido:"));
        apellido =new JTextField(10); 
        add(apellido);
        add(new JLabel("Ciudad:"));
        ciudad =new JTextField(10); 
        add(ciudad);
        
        Button bAceptar =  new Button("Aceptar"); 
        add(bAceptar);
        
        bAceptar.addActionListener(e -> leerDatosFormulario()); // Una forma mucho más rápida de gestionar los eventos
        
        
        Button bListar =  new Button("Listar"); 
        add(bListar);
        
        bListar.addActionListener(e -> listarPersonas());
        panel=new JPanel();
        add(panel);
        
        /**
         * 
         * PARA AÑADIR UN JList
         */
        // Establece la lista gráfica de personas
        listaNombres = new JList();
        //Establece que se pueda seleccionar solamente un elemento de la lista 
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        modelo = new DefaultListModel();
        // Establece una barra de desplazamiento vertical
        scrollLista = new JScrollPane();
        // Establece la posición de la barra de desplazamiento vertical
        scrollLista.setBounds(20, 190 ,220, 80);
        // Asocia la barra de desplazamiento vertical a la lista de personas
        scrollLista.setViewportView(listaNombres);
        
        add(scrollLista);
        
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        //pack();//hace que se ajuste al tamaño de la ventana
        setVisible(true);
       
    }

    private void listarPersonas() {
    	
        cargarConfiguracion();
		
		String url=configuracion.getProperty("urlBD");
		String usuario=configuracion.getProperty("user");
		String password=configuracion.getProperty("password");
		
		try (Connection con = DriverManager.getConnection(url, usuario, password)) {
			String sql="SELECT * FROM personas";
			PreparedStatement sentencia=con.prepareStatement(sql);
			
			int filasAfectadas=sentencia.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
        new FlowLayoutDemo();

    }
    
    
    private void leerDatosFormulario() {
    	
    	System.out.println("Se están leyendo los datos del formulario");
    	
    	String name = nombre.getText();
        String surname = apellido.getText();
        String city = ciudad.getText();
       
        cargarConfiguracion();
		
		String url=configuracion.getProperty("urlBD");
		String usuario=configuracion.getProperty("user");
		String password=configuracion.getProperty("password");
		
		try (Connection con = DriverManager.getConnection(url, usuario, password)) {
			String sql="INSERT INTO personas(nombre,apellido,ciudad)"
					+"VALUES(?,?,?)";
			PreparedStatement sentencia=con.prepareStatement(sql);
			
			sentencia.setString(1, name);
			sentencia.setString(2, surname);
			sentencia.setString(3, city);
			
			int filasAfectadas=sentencia.executeUpdate();
			System.out.println("Filas insertadas:"+filasAfectadas);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        
        showDataInJList(name,surname,city);
    }
    
	private void showDataInJList(String name, String surname, String city) {
    	 String elemento =name + " " + surname + " " + city;
         modelo.addElement(elemento); //Se agrega el texto con los datos de la persona al JList
         listaNombres.setModel(modelo);
	}
	
	private static void cargarConfiguracion() {
		FileInputStream fis;
		try {
			fis=new FileInputStream("ficheros/sql/properties/conexionBD.properties");
			configuracion.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
