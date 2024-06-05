package unidad9.tareasU9.energiasRenovables;

import java.time.LocalDate;
import java.util.Random;

public class PlacaSolar extends ProductorEnergia{

	public static final double CANTIDAD_MAX_PLACA=500;
	public static final double CANTIDAD_MIN_PLACA=150;
	
	private TipoPlacas tipo;
	private Orientaciones orientacion;
	private double inclinacion;
	
	public PlacaSolar(String id, LocalDate fechaUltimaRev,TipoPlacas tipo, Orientaciones orientacion, double inclinacion) {
		super(id, fechaUltimaRev);
		this.tipo=tipo;
		this.orientacion=orientacion;
		this.inclinacion=inclinacion;
		calcularEficiencia();
		generadorDatos();
	}
	
	

	public TipoPlacas getTipo() {
		return tipo;
	}



	public void setTipo(TipoPlacas tipo) {
		this.tipo = tipo;
	}



	public Orientaciones getOrientacion() {
		return orientacion;
	}



	public void setOrientacion(Orientaciones orientacion) {
		this.orientacion = orientacion;
	}



	public double getInclinacion() {
		return inclinacion;
	}



	public void setInclinacion(double inclinacion) {
		this.inclinacion = inclinacion;
	}

	@Override
	public void generadorDatos() {
        Random random = new Random();
        capacidadGenerada=(CANTIDAD_MIN_PLACA )+
        		((CANTIDAD_MAX_PLACA - CANTIDAD_MIN_PLACA) * random.nextDouble());
        capacidadGenerada=capacidadGenerada+ (capacidadGenerada*eficiciencia);
	}
	
	@Override
	public void calcularEficiencia() {
		if(tipo==TipoPlacas.PANEL_FOTOVOLTAICO) {
			eficiciencia=0.80;
		}else if(tipo==TipoPlacas.PANEL_HIBRIDO) {
			eficiciencia=0.65;
		}else if(tipo==TipoPlacas.PANEL_TERMICO) {
			eficiciencia=0.45;
		}
	}



	@Override
	public String toString() {
		return super.toString()+" PlacaSolar [tipo=" + tipo + ", orientacion=" + orientacion + ", inclinacion=" + inclinacion + "]";
	}
	
	

}
