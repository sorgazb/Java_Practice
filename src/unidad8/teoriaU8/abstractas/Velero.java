package unidad8.teoriaU8.abstractas;

import java.util.Scanner;

public class Velero extends Vehiculo{
	
	static Scanner entrada=new Scanner(System.in);
	
	private int longitud;

	public Velero() {
		super("Viento",0);
		setLongitud();
		setPrecio();
		
	}

	public int getLongitud() {
		return longitud;
	}

	@Override
	public void setPrecio() {
		final int MAX=10000;
		System.out.println("Introduzca un precio para el velero: ");
		precio=entrada.nextInt();
		if(precio > MAX) {
			precio=MAX;
		}
		if(precio < 0) {
			precio=0;
		}
	}
	
	public void setLongitud() {
		System.out.println("Introduzca la longitud para el velero: ");
		longitud=entrada.nextInt();
	}
	
	@Override
	public String toString() {
		String salida="Longitud: "+longitud+"\n"
				+"El velero tiene como fuente de alimentacion: "+getFuente_Alimentacion()+"\n"
				+"Tiene "+getRuedas()+" ruedas\n"
				+"Coste de "+getPrecio()+"€";
		return salida;
	}

	@Override
	public double calcEficienciaCarburante() {
		
		return 0;
	}

	@Override
	public double calcDistanciaViaje() {
		
		return 0;
	}
	


}
