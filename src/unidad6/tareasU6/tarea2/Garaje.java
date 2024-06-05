package unidad6.tareasU6.tarea2;

import java.security.SecureRandom;

public class Garaje {
	private Coche coche;
	private String averia_Asociada;
	private int num_coche_atendidos;
	
	public boolean aceptarCoche(Coche coche, String averia_Asociada) {
		boolean aceptar=false;
		if(this.coche==null) {
			this.coche=coche;
			aceptar=true;
			num_coche_atendidos++;
			if(averia_Asociada.equals("aceite")) {
				coche.getMotor().setLitros_Aceite(10);
				coche.acumularAveria(Math.random()*10);
			}else {
				coche.acumularAveria(Math.random()*1000);
			}
		}
		return aceptar;
	}
	
	public void devolverCoche() {
		this.coche=null;
		this.averia_Asociada="";
	}

}
