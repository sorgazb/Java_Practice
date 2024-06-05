package tareasFinales.ventaEntradas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Tareas para los Alumnos
Calcular Precio:

Completar la lógica en el método calcularPrecio para determinar el precio de la entrada basada en si el usuario es abonado o no y si el tipo de precio es normal o reducido.
Comprar Entrada:

Completar la lógica en el método comprarEntrada para disminuir el número de localidades disponibles y actualizar las localidades restantes, además de mostrar mensajes apropiados al usuario.
Actualizar Localidades:

Completar la lógica en el método actualizarLocalidades para mostrar el número de localidades restantes basadas en la zona seleccionada.
Evaluación
Se evaluará la capacidad de los alumnos para completar la funcionalidad del programa, asegurar que el cálculo de precios y la actualización de localidades se realiza correctamente, y manejar adecuadamente los eventos de la interfaz gráfica.
 */

public class VentaEntradasInicio extends JFrame {
    private JComboBox<String> comboTipoEntrada;
    private JComboBox<String> comboTipoPrecio;
    private JCheckBox checkAbonado;
    private JTextField textPrecio;
    private JTextField textLocalidadesRestantes;
    
    private final int[] localidades = {200, 40, 400, 100};
    private final double[] preciosNormales = {25, 70, 20, 15.5};
    private final double[] preciosAbonados = {17.5, 40, 14, 10};
    private final String[] zonas = {"Principal", "Palco", "Central", "Lateral"};
    
    public VentaEntradasInicio() {
        setTitle("Venta de Entradas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        
        panel.add(new JLabel("Tipo de Entrada:"));
        comboTipoEntrada = new JComboBox<>(zonas);
        panel.add(comboTipoEntrada);
        
        panel.add(new JLabel("Tipo de Precio:"));
        comboTipoPrecio = new JComboBox<>(new String[]{"Normal", "Reducido"});
        panel.add(comboTipoPrecio);
        
        panel.add(new JLabel("Abonado:"));
        checkAbonado = new JCheckBox();
        panel.add(checkAbonado);
        
        panel.add(new JLabel("Precio:"));
        textPrecio = new JTextField();
        textPrecio.setEditable(false);
        panel.add(textPrecio);
        
        panel.add(new JLabel("Localidades Restantes:"));
        textLocalidadesRestantes = new JTextField();
        textLocalidadesRestantes.setEditable(false);
        panel.add(textLocalidadesRestantes);
        
        JButton calcularPrecioButton = new JButton("Calcular Precio");
        calcularPrecioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               calcularPrecio();
            }
        });
        panel.add(calcularPrecioButton);
        
        JButton comprarButton = new JButton("Comprar");
        comprarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	comprarEntrada();
            }
        });
        panel.add(comprarButton);
        
        add(panel);
        
    }
    
    private void calcularPrecio() {
    	double precioTotal=0;
    	String tipoEntrada=(String)comboTipoEntrada.getSelectedItem();
    	double precioEntrada=obtenerPrecioEntrada(tipoEntrada);
    	String tipoPrecio=(String)comboTipoPrecio.getSelectedItem();
    	if(tipoPrecio.equals("Reducido")) {
    		precioTotal=precioEntrada - (precioEntrada*0.2);
    	}else {
    		precioTotal=precioEntrada;
    	}
    	textPrecio.setText(String.valueOf(precioTotal));
    	mostrarEntradasDisponibles(tipoEntrada);
    }
    
    private void mostrarEntradasDisponibles(String tipoEntrada) {
    	int localidadesDisponibles=0;
    	switch (tipoEntrada) {
		case "Principal":
			localidadesDisponibles=localidades[0]-1;
			break;
		case "Palco":
			localidadesDisponibles=localidades[1]-1;
			break;
		case "Central":
			localidadesDisponibles=localidades[2]-1;
			break;
		case "Lateral":
			localidadesDisponibles=localidades[3]-1;
			break;
		default:
			System.out.println("No existe ese tipo de entrada.");
		}
    	textLocalidadesRestantes.setText(String.valueOf(localidadesDisponibles));
    }
    
    private double obtenerPrecioEntrada(String tipoEntrada) {
    	boolean abonado=esAbonado();
    	double precio=0;
    	switch (tipoEntrada) {
		case "Principal":
			if(abonado==true) {
				precio=preciosAbonados[0];
			}else {
				precio=preciosNormales[0];
			}
			break;
		case "Palco":
			if(abonado==true) {
				precio=preciosAbonados[1];
			}else {
				precio=preciosNormales[1];
			}
			break;
		case "Central":
			if(abonado==true) {
				precio=preciosAbonados[2];
			}else {
				precio=preciosNormales[2];
			}
			break;
		case "Lateral":
			if(abonado==true) {
				precio=preciosAbonados[3];
			}else {
				precio=preciosNormales[3];
			}
			break;
		default:
			System.out.println("No existe ese tipo de entrada.");
		}
    	return precio;
    }
    
    private boolean esAbonado() {
    	boolean abonado=false;
    	if(checkAbonado.isSelected()==true) {
    		abonado=true;
    	}
    	return abonado;
    }
    
    private void comprarEntrada() {
       if(entradasDisponibles()==true) {
    	   actualizarLocalidades();
    	   JOptionPane.showMessageDialog(this,"Entrada Adquirida");
    	   mostrarEntradasDisponibles((String)comboTipoEntrada.getSelectedItem());
       }else {
    	   JOptionPane.showMessageDialog(this,"No quedan entradas disponibles en esa zona."); 
       }
    }
    
    private boolean entradasDisponibles() {
    	boolean quedanEntradas=false;
    	String tipoEntrada=(String)comboTipoEntrada.getSelectedItem();
    	switch (tipoEntrada) {
		case "Principal":
			if(localidades[0]>0) {
				quedanEntradas=true;
			}
			break;
		case "Palco":
			if(localidades[1]>0) {
				quedanEntradas=true;
			}
			break;
		case "Central":
			if(localidades[2]>0) {
				quedanEntradas=true;
			}
			break;
		case "Lateral":
			if(localidades[3]>0) {
				quedanEntradas=true;
			}
			break;
		default:
			System.out.println("No existe ese tipo de entrada.");
		}
    	return quedanEntradas;
    }
    
    private void actualizarLocalidades() {
    	String tipoEntrada=(String)comboTipoEntrada.getSelectedItem();
    	switch (tipoEntrada) {
		case "Principal":
			localidades[0]=localidades[0]-1;
			break;
		case "Palco":
			localidades[1]=localidades[1]-1;
			break;
		case "Central":
			localidades[2]=localidades[2]-1;
			break;
		case "Lateral":
			localidades[3]=localidades[3]-1;
			break;
		default:
			System.out.println("No existe ese tipo de entrada.");
		}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentaEntradasInicio().setVisible(true);
            }
        });
    }
}
