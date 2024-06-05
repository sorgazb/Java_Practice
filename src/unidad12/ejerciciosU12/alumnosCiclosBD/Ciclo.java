package unidad12.ejerciciosU12.alumnosCiclosBD;

public class Ciclo {

	//Atributos de la clase Ciclo:
	private int id;
	private String nombre;
	private String codigo;
	
	//Constructor de la clase Ciclo:
	public Ciclo(int id, String nombre, String codigo) {
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
	}

	//Metodos Getters && Setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	//Metodo toString:
	@Override
	public String toString() {
		return "Ciclo [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
}
