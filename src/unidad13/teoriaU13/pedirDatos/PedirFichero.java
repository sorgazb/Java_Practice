package unidad13.teoriaU13.pedirDatos;

import java.io.File;

import javax.swing.JFileChooser;

public class PedirFichero {

	public static void main(String[] args) {
		JFileChooser elegirFichero= new JFileChooser();
		
		elegirFichero.setCurrentDirectory(new File(System.getProperty("user.dir")));
		
		int resultado= elegirFichero.showOpenDialog(null);
		
		if(resultado==JFileChooser.APPROVE_OPTION) {
			File fichero=elegirFichero.getSelectedFile();
			
			System.out.println("Fichero Seleccionado:"+fichero.getAbsolutePath());
		}else {
			System.out.println("No se ha seleccionado ningún fichero");
		}
	}

}
