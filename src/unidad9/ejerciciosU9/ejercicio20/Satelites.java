package unidad9.ejerciciosU9.ejercicio20;

public class Satelites extends Astros{

	private double distanciaAlPlaneta;
	private double orbitaPlanetaria;
	private Planetas planeta;
	
	public Satelites(String nombre, double radioEcuatorial, double rotacioEje, double masa, double temperaturaMedia, double gravedad, double distanciaAlPlaneta, double orbitaPlanetaria, Planetas planeta) {
		super(radioEcuatorial, rotacioEje, masa, temperaturaMedia, gravedad, nombre);
		this.distanciaAlPlaneta = distanciaAlPlaneta;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.planeta = planeta;
	}

	public double getDistanciaAlPlaneta() {
		return distanciaAlPlaneta;
	}

	public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
		this.distanciaAlPlaneta = distanciaAlPlaneta;
	}

	public double getOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}

	public void setOrbitaPlanetaria(double orbitaPlanetaria) {
		this.orbitaPlanetaria = orbitaPlanetaria;
	}

	public Planetas getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planetas planeta) {
		this.planeta = planeta;
	}

	@Override
	public String toString() {
		return super.toString()+" Satelites [distanciaAlPlaneta=" + distanciaAlPlaneta + ", orbitaPlanetaria=" + orbitaPlanetaria
				+ ", planeta=" + planeta + "]";
	}
	
	
	
	

	
}
