package ejerciciosEjemplo.practicasBD.Biblioteca;

public class Libro {
	
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private double precio;
	
	public Libro(String titulo, String autor, int anioPublicacion, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.precio = precio;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", precio="
				+ precio + "]";
	}
	
	
}
