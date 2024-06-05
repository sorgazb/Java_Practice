package tareasFinales.formularioTenistas;

public class Tenista {
	private String nombre;
	private String apellido;
	private boolean retirado;
	private String sexo;
	private String reves;
	private String superficie;
	
	public Tenista(String nombre, String apellido, boolean retirado, String sexo, String reves, String superficie) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.retirado = retirado;
		this.sexo = sexo;
		this.reves = reves;
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isRetirado() {
		return retirado;
	}

	public void setRetirado(boolean retirado) {
		this.retirado = retirado;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getReves() {
		return reves;
	}

	public void setReves(String reves) {
		this.reves = reves;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	
	
	
}
