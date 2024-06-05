package unidad9.teoriaU9.colecciones.ejemploComparaciones.comparator;

public class Jugador {
	
	private int ranking;
	private int edad;
	private String nombre;
	
	public Jugador(int ranking, int edad, String nombre) {
		this.ranking = ranking;
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Jugador [ranking=" + ranking + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	
	
}
