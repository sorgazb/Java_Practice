package unidad8.tareasU8.tarea3.contenedores;
import unidad8.tareasU8.tarea3.enums.TipoContenedor;

public class Bolsa extends Contenedores{
	
	//Atributos de la clase Bolsa:
	private double resistencia_Max;
	
	//Constructor de la clase Bolsa heredado de la Clase Contenedores:
	public Bolsa(String id_Contenedor, int alto, int ancho) {
		super(id_Contenedor, alto, ancho);
	}

	//Métodos Getters && Setters:
	public double getResistencia_Max() {
		return resistencia_Max;
	}

	public void setResistencia_Max(double resistencia_Max) {
		this.resistencia_Max = resistencia_Max;
	}
	
	//Métodos de la clase Bolsa:
	
	/*
	 * Tipo ENUM
	 * Método del cual obtenemos el tipo de contenedor con el que estamos
	 * trabajando.
	 */
	public TipoContenedor getTipo() {
		return getTipo().BOLSA;
	}
	
	/*
	 * 
	 */
	@Override
	public int getSuperficie() {
		int radio= getDiametro()/2;
		return(int)(Math.PI*radio*radio);
	}
	
	/*
	 * 
	 */
	public int getDiametro() {
		return (int) ((2*ancho)/Math.PI);
	}

}
