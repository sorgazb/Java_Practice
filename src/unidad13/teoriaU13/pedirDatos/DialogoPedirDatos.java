package unidad13.teoriaU13.pedirDatos;

import javax.swing.JOptionPane;

public class DialogoPedirDatos {

	public static void main(String[] args) {

		String nombre=JOptionPane.showInputDialog("Dame un nombre");
		String apellido=JOptionPane.showInputDialog("Dame un apellido");
		String ciudad=JOptionPane.showInputDialog("Dame una ciudad");
		
		String mensaje=String.format("Bienvenido, %s %s estas en %s",nombre,apellido,ciudad);
		
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
