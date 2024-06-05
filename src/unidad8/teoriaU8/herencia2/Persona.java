package unidad8.teoriaU8.herencia2;

public class Persona {
	//Atributos de la clase Persona:
	private int id;
	private String nombre;
	private String localidad;
	
	//Variable static que usaremos para establecer el ID de Persona:
	private static int contador=1000;
	
	//Cosntructor de la clase Persona:
	public Persona(String nombre) {
		contador++;
		this.id=contador;
		this.nombre=nombre;
	}
	
	//Método sobre escrito heredado de la clase Objects:
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		if(this==obj) {
			sonIguales=true;
		}
		if(obj instanceof Persona) {
			Persona laOtraPersona= (Persona) obj;
			sonIguales= (this.nombre.equals(laOtraPersona.getNombre()) 
					  && this.localidad.equals(laOtraPersona.getLocalidad()));
		}
		return sonIguales;
	}
	
	@Override
	public String toString() {
		return "ID "+this.id+" Nombre:"+this.nombre+" - Localidad: "+this.localidad;
	}

	//Métodos Getters & Setters:
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

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
}
