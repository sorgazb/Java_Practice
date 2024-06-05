package ejerciciosEjemplo.pueblosExtremadura;

public class Pueblo {
	//Atributos de la clase Pueblo:
	private String nombre;
	private int codigoPostal;
	private int poblacion;
	private String comarca;
	private String provincia;
	
	//Constructor de la clase Pueblo:
	public Pueblo(String nombre, int codigoPostal, int poblacion, String comarca, String provincia) {
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
		this.poblacion = poblacion;
		this.comarca = comarca;
		this.provincia = provincia;
	}

	//Getters & Setters de la clase Pueblo:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public String getComarca() {
		return comarca;
	}

	public void setComarca(String comarca) {
		this.comarca = comarca;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
