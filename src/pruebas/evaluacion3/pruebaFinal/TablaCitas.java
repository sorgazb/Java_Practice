package pruebas.evaluacion3.pruebaFinal;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaCitas extends JFrame{
	
	private JTable tabla;
	private JScrollPane panel;

	public TablaCitas(String [][] datos, String [] cabecera, String titulo) {
		pintarTabla(datos,cabecera);
		setTitle(titulo);
		setSize(500, 300);
	}

	private void pintarTabla(String [][] datos, String [] cabecera) {
		tabla = new JTable(datos, cabecera);
		panel = new JScrollPane(tabla);

		getContentPane().add(panel, BorderLayout.CENTER);
	}

}
