package unidad8.teoriaU8.abstractas;

import java.util.Scanner;

public class Bicicleta extends Vehiculo{
	
	static Scanner entrada = new Scanner(System.in);

	public Bicicleta() {
		super("Una persona",2);
		setPrecio();
	}

	@Override
	public void setPrecio() {

		final int MAX=1000;
		System.out.println("Introduzca un precio para la bicicleta: ");
		precio=entrada.nextInt();
		if(precio > MAX) {
			precio=MAX;
		}
		if(precio < 0) {
			precio=0;
		}
	}
	
	@Override
	public String toString() {
		String salida=
				"La bicicleta tiene como fuente de alimentacion: "+getFuente_Alimentacion()+"\n"
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
