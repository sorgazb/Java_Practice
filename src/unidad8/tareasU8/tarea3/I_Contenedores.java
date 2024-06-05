package unidad8.tareasU8.tarea3;
import unidad8.tareasU8.tarea3.enums.TipoContenedor;

public interface I_Contenedores {

	//Métodos o Comportamientos de la clase Contenedores:
	String getReferencia();
	
	int getVolumen();
	
	int volumenDisponible();
	
	int getResistencia();
	
	Productos [] getProductos();
	
	TipoContenedor getTipo();
	
	boolean meter(Productos producto);
	
	boolean resiste(Productos producto);
	
	int getSuperficie();
}
