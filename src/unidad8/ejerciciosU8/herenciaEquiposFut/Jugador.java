package unidad8.ejerciciosU8.herenciaEquiposFut;

public class Jugador {
	//Atributos de la clase Jugador:
	private String nombre;
	private String apellido;
	private String posicion;
	
	//Constructor de la clase Jugador:
	public Jugador(String nombre, String apellido, String posicion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.posicion=posicion;
	}

	//Métodos Getters & Setters de la clase Jugador:
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

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	//Métodos de la clase Jugador:
	
	//Método equals para comprar dos Jugadores:
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		if(this==obj) {
			sonIguales=true;
		}
		if(obj instanceof Jugador) {
			Jugador otroJugador= (Jugador) obj;
			sonIguales=((this.nombre.equals(otroJugador.getNombre()))
					&& (this.apellido.equals(otroJugador.getApellido()))
					&& (this.posicion.equals(otroJugador.getPosicion())));
		}
		return sonIguales;
	}
	
	//Método toString para mostrar datos Jugador:
	@Override
	public String toString() {
		String datos="Nombre: "+this.nombre+"\n"+
                     "Apellido: "+this.apellido+"\n"+
				     "Posición: "+this.posicion;
		return datos;
	}
	

}
