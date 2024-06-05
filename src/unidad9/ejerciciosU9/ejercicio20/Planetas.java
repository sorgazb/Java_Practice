package unidad9.ejerciciosU9.ejercicio20;

import java.util.HashMap;
import java.util.Map;

public class Planetas extends Astros{

	private int contadorSatelites=0;
	private Map<Integer, Satelites> mapaSatelites;
	
	private double distanciaAlSol;
	private double orbitaSol;
	private boolean tieneSatelites;
	
	public Planetas(double radioEcuatorial, double rotacioEje, double masa, double temperaturaMedia, double gravedad, double distanciaAlSol, double orbitaSol, boolean tieneSatelites, String nombre) {
		super(radioEcuatorial, rotacioEje, masa, temperaturaMedia, gravedad, nombre);
		this.distanciaAlSol=distanciaAlSol;
		this.orbitaSol=orbitaSol;
		this.tieneSatelites=tieneSatelites;
		if(this.tieneSatelites) {
			mapaSatelites= new HashMap<Integer, Satelites>();
		}
	}

	public double getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(double distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public double getOrbitaSol() {
		return orbitaSol;
	}

	public void setOrbitaSol(double orbitaSol) {
		this.orbitaSol = orbitaSol;
	}

	public boolean isTieneSatelites() {
		return tieneSatelites;
	}

	public void setTieneSatelites(boolean tieneSatelites) {
		this.tieneSatelites = tieneSatelites;
	}

	@Override
	public String toString() {
		return super.toString()+" Planetas [distanciaAlSol=" + distanciaAlSol + ", orbitaSol=" + orbitaSol + ", tieneSatelites="
				+ tieneSatelites + "]";
	}
	
	public void aniadirSatelites(Satelites satelite) {
		mapaSatelites.put(contadorSatelites, satelite);
		contadorSatelites++;
	}
	
	public void mostrarInformacionPlaneta() {
		System.out.println("-Nombre: "+nombre);
		System.out.println(toString());
		for (Integer satelite : mapaSatelites.keySet()) {
				System.out.println("ID:"+satelite+mapaSatelites.get(satelite));
		}
	}
	
	
	

}
