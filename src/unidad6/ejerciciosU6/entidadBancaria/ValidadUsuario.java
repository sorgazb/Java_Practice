package unidad6.ejerciciosU6.entidadBancaria;

public class ValidadUsuario {
	
	public static boolean validad_DNI(String dni) {
		return dni.matches("\\d{8}[A-Z]");
	}
	
	public static boolean validad_FechaNacimiento(String fechaNacimiento) {
		return fechaNacimiento.matches("\\d{2}/\\d{2}/\\d{4}");
	}
}
