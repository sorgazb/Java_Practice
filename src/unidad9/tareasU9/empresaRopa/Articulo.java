package unidad9.tareasU9.empresaRopa;

import java.util.HashMap;
import java.util.Map;

public class Articulo {
	
	public static final int CANTIDAD=4;
	
	private String nombre;
	Map<Integer, Integer> cantidadesTallas = new HashMap<Integer, Integer>();
	private int pedidosPendientes;
	
	public Articulo(String nombre) {
		this.nombre = nombre;
		setCantidadesTallas();
		this.pedidosPendientes=0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Map<Integer, Integer> getCantidadesTallas() {
		return cantidadesTallas;
	}
	
	public void setCantidadesTallas() {
		cantidadesTallas.put(0, CANTIDAD);//xs
		cantidadesTallas.put(1, CANTIDAD);//s
		cantidadesTallas.put(2, CANTIDAD);//m
		cantidadesTallas.put(3, CANTIDAD);//l
		cantidadesTallas.put(4, CANTIDAD);//xl
	}
	
	public void decrementarCantidad(int talla, int cantidad) {
		if(cantidadesTallas.get(talla) >= cantidad) {
			cantidadesTallas.replace(talla, (cantidadesTallas.get(talla)-cantidad));
			System.out.println("Pedido realizado");
		}else {
			System.err.println("ERROR.No tenemos suficientes tallas.");
			pedidosPendientes= pedidosPendientes+(cantidad+cantidadesTallas.get(talla));
			cantidadesTallas.replace(talla, 0);
		}
	}

		
}
