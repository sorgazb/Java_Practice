package unidad9.tareasU9.explotacionGanadera;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Animales {
	
	protected int id;
	protected int camada;
	protected String nombre;
	protected LocalDate fechaVacunacion;
	protected String raza;
	protected Tipo tipo;
	protected Sexo sexo;
	protected List<Revision> listaRevisiones;
	
	public Animales(int id, int camada, String nombre, LocalDate fechaVacunacion, String raza, Tipo tipo, Sexo sexo) {
		this.id = id;
		this.camada = camada;
		this.nombre = nombre;
		this.fechaVacunacion = fechaVacunacion;
		this.raza = raza;
		this.tipo = tipo;
		this.sexo = sexo;
		this.listaRevisiones = new ArrayList<Revision>();
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCamada() {
		return camada;
	}

	public void setCamada(int camada) {
		this.camada = camada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaVacunacion() {
		return fechaVacunacion;
	}

	public void setFechaVacunacion(LocalDate fechaVacunacion) {
		this.fechaVacunacion = fechaVacunacion;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<Revision> getListaRevisiones() {
		return listaRevisiones;
	}

	public void setListaRevisiones(List<Revision> listaRevisiones) {
		this.listaRevisiones = listaRevisiones;
	}

	
	
	public void controlVacunacion() {
		if(fechaVacunacion.compareTo(LocalDate.now()) >= 300) {
			System.out.println("Han pasado ya 300 días desde la ultima vacunacion. Contacte con el veterinario");
		}
	}
	
	public void obtenerRevisiones() {
		System.out.println("---LISTA DE REVISIONES---");
		Iterator iteradorRevisiones= listaRevisiones.iterator();
		while(iteradorRevisiones.hasNext()) {
			Revision revision= (Revision)iteradorRevisiones.next();
			System.out.println(revision);
		}
	}
	
	public void aniadirRevision(Revision revision) {
		listaRevisiones.add(revision);
	}
	
	@Override
	public String toString() {
		return "-ID: "+id+"\n"+
				"-Camada: "+camada+"\n"+
				"-Nombre: "+nombre+"\n"+
				"-Raza: "+raza+"\n"+
				"-Tipo: "+tipo+"\n"+
				"-Sexo: "+sexo;
	}

}
