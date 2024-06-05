package unidad8.teoriaU8.abstractas;

import javax.swing.JOptionPane;

public class DemoVehiculos {

	public static void main(String[] args) {
		
		Velero velero= new Velero();
		Bicicleta bici= new Bicicleta();
		
		JOptionPane.showMessageDialog(null, "\nDescripción vehículo:\n"+
		velero.toString()+"\n"+
				bici.toString());
		
	}

}
