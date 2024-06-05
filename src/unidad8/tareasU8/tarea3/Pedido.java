package unidad8.tareasU8.tarea3;
import unidad8.tareasU8.tarea3.contenedores.Contenedores;

public class Pedido {
	
	//Constantes de la clase Pedido:
	private static final int MIN_CONTENEDORES=4;
	
	//Atributos de la clase:
	private String id_Pedido;
	
	private I_Contenedores [] contenedores;
	
	//Constructor de la clase Pedido:
	public Pedido(String id_Pedido) {
		this.id_Pedido = id_Pedido;
		contenedores= new I_Contenedores[MIN_CONTENEDORES];
	}

	//Métodos Getters && Setters:
	public String getId_Pedido() {
		return id_Pedido;
	}

	public void setId_Pedido(String id_Pedido) {
		this.id_Pedido = id_Pedido;
	}

	public I_Contenedores[] getContenedores() {
		return contenedores;
	}

	public void setContenedores(I_Contenedores[] contenedores) {
		this.contenedores = contenedores;
	}
	
	
	
	
}
