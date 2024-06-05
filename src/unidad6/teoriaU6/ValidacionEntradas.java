package unidad6.teoriaU6;

public class ValidacionEntradas {
	
	/*
	 * \\s = espacio en blanco.
	 * [a-zA-Z] mayusculas y minusculas.
	 * \\d = indicas que es un número.
	 * {5} numero exato del dato
	 */
	
	public static boolean validarPrimerNombre(String primerNombre) {
		return primerNombre.matches("[A-Z][a-z]*");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
