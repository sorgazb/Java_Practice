package unidad8.tareasU8.tarea3.contenedores;
import unidad8.tareasU8.tarea3.enums.TipoContenedor;

public class Caja extends Contenedores{

	//Constructor de la clase Caja heredado de la Clase Contenedores:
	public Caja(String id_Contenedor, int alto, int ancho) {
		super(id_Contenedor, alto, ancho);
		
	}
	
	//Métodos de la clase Caja:
	
	/*
	 * Tipo ENUM
	 * Método del cual obtenemos el tipo de contenedor con el que estamos
	 * trabajando.
	 */
	public TipoContenedor getTipo() {
		return getTipo().CAJA;
	}
	
	/*
	 * 
	 */
	@Override
	public int getSuperficie() {
		return ancho*alto;
	}
}
