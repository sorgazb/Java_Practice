package unidad7.teoriaU7;

public class ClienteAlmazara {
	
	//Atributos de la clase:
	private String id;
	private String nombre;
	private boolean socio;
	private String direccion;
	private String tlf;
	private String email;
	
	
	//Constructores de la clase:
	public ClienteAlmazara(String id, String nombre, boolean socio) {
		this.id = id;
		this.nombre = nombre;
		this.socio = socio;
	}


	//Métodos Getters && Setters de la clase:
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void mostrarDatos() {
		System.out.println("ID Cliente: "+id);
		System.out.println("Nombre Cliente: "+nombre);
		System.out.println("Es socio: "+socio);
	}
	
	

	
}
