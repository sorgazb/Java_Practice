package unidad6.tareasU6.tarea2;

public class Motor {
	
	private int litros_Aceite;
	private int cv;
	
	public Motor(int cv) {
		this.cv=cv;
		this.litros_Aceite=0;
	}

	public int getLitros_Aceite() {
		return litros_Aceite;
	}

	public void setLitros_Aceite(int litros_Aceite) {
		this.litros_Aceite = this.litros_Aceite + litros_Aceite;
	}

	public int getCv() {
		return cv;
	}
	
	public void mostrarDatosMotor() {
		System.out.println("Información Motor:");
		System.out.println("-CV:"+cv);
		System.out.println("-Litros Aceite:"+litros_Aceite);
	}
	
	
}
