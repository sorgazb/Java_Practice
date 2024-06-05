package unidad9.tareasU9.empresaRopa;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
	
	Map<Integer, Articulo> cantidadesArticulos = new HashMap<Integer, Articulo>();
	
	public Inventario() {
		setCantidadesArticulos();
	}
	
	public Map<Integer, Articulo> getCantidadesArticulos() {
		return cantidadesArticulos;
	}

	public void setCantidadesArticulos() {
		Articulo camiseta= new Articulo("Camiseta");
		Articulo sudadera= new Articulo("Sudadera");
		Articulo pantalon= new Articulo("Pantalón");
		Articulo jeans= new Articulo("Jeans");
		Articulo jersey= new Articulo("Jersey");
		Articulo chaqueta= new Articulo("Chaqueta");
		Articulo abrigo= new Articulo("Abrigo");
		Articulo chandal= new Articulo("Chandal");
		Articulo gorro= new Articulo("Gorro");
		Articulo gafas= new Articulo("Gafas");
		
		cantidadesArticulos.put(0, camiseta);
		cantidadesArticulos.put(1, sudadera);
		cantidadesArticulos.put(2, pantalon);
		cantidadesArticulos.put(3, jeans);
		cantidadesArticulos.put(4, jersey);
		cantidadesArticulos.put(5, chaqueta);
		cantidadesArticulos.put(6, abrigo);
		cantidadesArticulos.put(7, chandal);
		cantidadesArticulos.put(8, gorro);
		cantidadesArticulos.put(9, gafas);
	}
	
	public Articulo realizarPedido(int idProducto) {
		return cantidadesArticulos.get(idProducto);
	}



}
