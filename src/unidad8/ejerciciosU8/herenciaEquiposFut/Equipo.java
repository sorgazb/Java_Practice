package unidad8.ejerciciosU8.herenciaEquiposFut;

public class Equipo {
	private static final int MAX_JUGADORES=5;
	
	private String nombre;
	private String ciudad;
	private Jugador[] array_Jugadores;
	
	public Equipo(String nombre, String ciudad, Jugador[] array_Jugadores) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.array_Jugadores = array_Jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Jugador[] getArray_Jugadores() {
		return array_Jugadores;
	}

	public void setArray_Jugadores(Jugador[] array_Jugadores) {
		this.array_Jugadores = array_Jugadores;
	}
	
	//Método equals para comprar dos Equipos:
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales=false;
		if(this==obj) {
			sonIguales=true;
		}
		if(obj instanceof Equipo) {
			Equipo otroEquipo= (Equipo) obj;
			int cont=0;
			boolean iguales=false;
			for(int i=0; i < this.array_Jugadores.length; i++) {
				for(int j=0; j < otroEquipo.array_Jugadores.length; j++) {
					if(this.array_Jugadores[i].equals(otroEquipo.array_Jugadores[j])) {
						cont++;
					}
				}
			}
			if(cont==this.array_Jugadores.length){
				iguales=true;
			}
			sonIguales=((this.nombre.equals(otroEquipo.getNombre()))
					&& (this.ciudad.equals(otroEquipo.getCiudad()))&& iguales);
		}
		return sonIguales;
	}
	
	//Método toString para mostrar datos Jugador:
	@Override
	public String toString() {
		String datos="Nombre: "+this.nombre+"\n"+
                     "Ciudad: "+this.ciudad+"\n"+
				     "Jugadores: "+this.array_Jugadores;
		return datos;
	}
	
	
	
}
