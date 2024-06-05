package unidad13.teoriaU13.dristibuciones;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        
        /*bAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				leerDatosFormulario();
			}
		});*/
        
        bAceptar.addActionListener(e -> leerDatosFormulario()); // Una forma mucho más rápida de gestionar los eventos
        
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

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
    
    
    private void leerDatosFormulario() {
    	
    	System.out.println("Se están leyendo los datos del formulario");
    	
    	String name = nombre.getText();
        String surname = apellido.getText();
        String city = ciudad.getText();
        
        
        showDataInConsole(name,surname,city);
        showDataInNewFrame(name, surname, city);
        showDataInJOptionPane(name, surname, city);
        showDataInJList(name,surname,city);
        showDataInJPanel(name,surname,city);
        
    }
    
    
    private void showDataInJPanel(String name, String surname, String city) {
    	panel.setLayout(new FlowLayout());
    	panel.removeAll();
    	panel.add(new JLabel("Nombre: "+name));
    	panel.add(new JLabel("Apellido: "+surname));
    	panel.add(new JLabel("Ciudad: "+city));
    	panel.setSize(300,200);
    	panel.revalidate();
    	panel.repaint();
    	panel.setVisible(true);
	}

	private void showDataInJList(String name, String surname, String city) {
    	 String elemento = name + " " + surname + " " + city;
         modelo.addElement(elemento); //Se agrega el texto con los datos de la persona al JList
         listaNombres.setModel(modelo);
	}


	private void showDataInConsole(String name, String surname, String city) {
		
		    System.out.println("Datos leídos");
	        System.out.println("Nombre:"+name);
	        System.out.println("Apellido:"+surname);
	        System.out.println("Ciudad:"+city);
		
	}

	private void showDataInJOptionPane(String name, String surname, String city) {
		
    	// Process or display the collected data
        JOptionPane.showMessageDialog(this,
                "Nombre: " + name + "\nApellido: " + surname + "\nCiudad: " + city);
		
	}

	private void showDataInNewFrame(String name, String surname, String city) {
        JFrame dataFrame = new JFrame("Datos del Formulario");
        dataFrame.setLayout(new FlowLayout());
        dataFrame.add(new JLabel("Nombre: " + name));
        dataFrame.add(new JLabel("Apellido: " + surname));
        dataFrame.add(new JLabel("Ciudad: " + city));
        dataFrame.setSize(300, 200);
        dataFrame.setLocationRelativeTo(this);
        dataFrame.setVisible(true);
    }
}
