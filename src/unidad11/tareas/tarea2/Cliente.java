package unidad11.tareas.tarea2;

public class Cliente {
	
	private String nif;
	private int cantidadVendida;
	private int numeroVentas;
	
	public Cliente(String nif, int cantidadVendida) {
		this.nif = nif;
		this.cantidadVendida = cantidadVendida;
		this.numeroVentas = 1;
	}

	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	public String getNif() {
		return nif;
	}
	
}
