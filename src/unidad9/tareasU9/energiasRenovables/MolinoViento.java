package unidad9.tareasU9.energiasRenovables;

import java.time.LocalDate;
import java.util.Random;

public class MolinoViento extends ProductorEnergia{
	
	public static final double CANTIDAD_MIN_MOLINO=2;
	public static final double CANTIDAD_MAX_MOLINO=3;
			
	
	VelocidadesViento velocidadViento;

	public MolinoViento(String id, LocalDate fechaUltimaRev) {
		super(id, fechaUltimaRev);
		calcularEficiencia();
		generadorDatos();
	}

	@Override
	public void generadorDatos() {
        Random random = new Random();
        capacidadGenerada=(CANTIDAD_MIN_MOLINO)+
        		((CANTIDAD_MAX_MOLINO - CANTIDAD_MIN_MOLINO) * random.nextDouble());
        capacidadGenerada=capacidadGenerada+ (capacidadGenerada*eficiciencia);
	}

	@Override
	public void calcularEficiencia() {
		if(velocidadViento==VelocidadesViento.MUY_ALTA) {
			eficiciencia=0.9;
		}else if(velocidadViento==VelocidadesViento.ALTA) {
			eficiciencia=0.75;
		}else if(velocidadViento==VelocidadesViento.MEDIA) {
			eficiciencia=0.5;
		}else if(velocidadViento==VelocidadesViento.BAJA) {
			eficiciencia=0.2;
		}
	}

	@Override
	public String toString() {
		return super.toString()+ " MolinoViento [velocidadViento=" + velocidadViento + "]";
	}
	
	
	
	
	
}
