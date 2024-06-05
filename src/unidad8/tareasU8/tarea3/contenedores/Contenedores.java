package unidad8.tareasU8.tarea3.contenedores;
import unidad8.tareasU8.tarea3.I_Contenedores;
import unidad8.tareasU8.tarea3.Productos;
import unidad8.tareasU8.tarea3.enums.TipoContenedor;

public class Contenedores implements I_Contenedores{
	
	//Atriurtos Contenedores:
	protected String id_Contenedor;
	protected int alto;
	protected int resistencia;
	protected int ancho;
	
	protected Productos [] productos;

	//Constructor de la clase Contenedor
	public Contenedores(String id_Contenedor, int alto, int ancho) {
		this.id_Contenedor = id_Contenedor;
		this.alto = alto;
		this.ancho = ancho;
	}

	//Métodos Getters && Setters:
	public String getId_Contenedor() {
		return id_Contenedor;
	}

	public void setId_Contenedor(String id_Contenedor) {
		this.id_Contenedor = id_Contenedor;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public Productos[] getProductos() {
		return productos;
	}

	public void setProductos(Productos[] productos) {
		this.productos = productos;
	}
	
	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public String getReferencia() {
		
		return null;
	}

	@Override
	public int getVolumen() {
		
		return 0;
	}

	@Override
	public int volumenDisponible() {
		
		return 0;
	}

	@Override
	public TipoContenedor getTipo() {
		
		return null;
	}

	@Override
	public boolean meter(Productos producto) {
		
		return false;
	}

	@Override
	public boolean resiste(Productos producto) {
		
		return false;
	}

	@Override
	public int getSuperficie() {
		
		return 0;
	}
	
}
