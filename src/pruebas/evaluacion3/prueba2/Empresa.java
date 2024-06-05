package pruebas.evaluacion3.prueba2;

public class Empresa {
	private String codigo;
	private String nombre;
	
	public Empresa(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
