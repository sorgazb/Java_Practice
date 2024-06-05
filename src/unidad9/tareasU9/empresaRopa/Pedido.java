package unidad9.tareasU9.empresaRopa;

public class Pedido {
	
	private Articulo articulo;
	private String talla;
	private int cantidad;
	
	public Pedido(Articulo articulo, String talla, int cantidad) {
		this.articulo = articulo;
		this.talla = talla;
		this.cantidad = cantidad;
		realizarPedido();
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void realizarPedido() {
		int talla= pedirTalla();
		articulo.decrementarCantidad(talla, cantidad);
	}
	
	public int pedirTalla() {
		int talla=0;
		switch (this.talla) {
		case "xs": 
			talla=0;
			break;
		case "s": 
			talla=1;
			break;
		case "m": 
			talla=2;
			break;
		case "l": 
			talla=3;
			break;
		case "xl": 
			talla=4;
			break;	
		}
		return talla;
	}
	
	
}
