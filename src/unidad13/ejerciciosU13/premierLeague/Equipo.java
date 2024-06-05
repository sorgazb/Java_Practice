package unidad13.ejerciciosU13.premierLeague;

public class Equipo {
	
	//Atributos de la clase Equipos:
	private String nombre;
	private String puntos;
	private String partidosGanados;
	private String partidosEmpatados;
	private String partidosPerdidos;
	private String golesAFavor;
	private String golesEnContra;
	private String tarjetasAmarillas;
	private String tarjetasRojas;
	
	//Constructor de la clase Equipo:
	public Equipo(String nombre, String puntos, String partidosGanados, String partidosEmpatados, String partidosPerdidos,
			String golesAFavor, String golesEnContra, String tarjetasAmarillas, String tarjetasRojas) {
		this.nombre = nombre;
		this.puntos = puntos;
		this.partidosGanados = partidosGanados;
		this.partidosEmpatados = partidosEmpatados;
		this.partidosPerdidos = partidosPerdidos;
		this.golesAFavor = golesAFavor;
		this.golesEnContra = golesEnContra;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
	}

	
	//Metodos Getters & Setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuntos() {
		return puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}

	public String getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(String partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public String getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(String partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}

	public String getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(String partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public String getGolesAFavor() {
		return golesAFavor;
	}

	public void setGolesAFavor(String golesAFavor) {
		this.golesAFavor = golesAFavor;
	}

	public String getGolesEnContra() {
		return golesEnContra;
	}

	public void setGolesEnContra(String golesEnContra) {
		this.golesEnContra = golesEnContra;
	}

	public String getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(String tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public String getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(String tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}


	//Metodo toString:
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", puntos=" + puntos + ", partidosGanados=" + partidosGanados
				+ ", partidosEmpatados=" + partidosEmpatados + ", partidosPerdidos=" + partidosPerdidos
				+ ", golesAFavor=" + golesAFavor + ", golesEnContra=" + golesEnContra + ", tarjetasAmarillas="
				+ tarjetasAmarillas + ", tarjetasRojas=" + tarjetasRojas + "]";
	}
	
}
