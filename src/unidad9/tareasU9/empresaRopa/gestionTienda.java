package unidad9.tareasU9.empresaRopa;

import java.util.Scanner;

public class gestionTienda {
	public static Scanner entrada = new Scanner(System.in);
	
	public static Inventario inventarioTienda= new Inventario();
	
	public static void main(String[] args) {
		
		
		
		int opcion=0;
		do {
			menu();
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				Pedido p1;
				Articulo a;
				System.out.println("1_. Realizar Pedido");
				a=pedirArticulo();
				String talla= pedirTalla();
				int cantidad=pedirCantidad();
				p1= new Pedido(a, talla, cantidad);
				break;
			case 2:
				break;
			case 0:
				System.out.println("SALIENDO...");
				break;

			default:
				System.out.println("Opción no valida.");
				break;
			}
		}while(opcion!=0);
		System.out.println("Gracias por confiar en nosotros.");
	}
	
	public static void menu() {
		System.out.println("---- MENU ----");
		System.out.println("1_. Realizar Pedido");
		System.out.println("2_. Realizar Devolución");
		System.out.println("0_. Salir");
	}
	
	public static Articulo pedirArticulo() {
		int idProducto=0;
		System.out.println("ID Artículo");
		idProducto=entrada.nextInt();
		if(idProducto >= 0 && idProducto <= 9) {
			return inventarioTienda.realizarPedido(idProducto);
		}else {
			return null;
		}
	}
	
	public static String pedirTalla() {
		String talla="";
		System.out.println("Introduce Talla: ");
		talla=entrada.next();
		return talla;
	}
	
	public static int pedirCantidad() {
		int cantidad=0;
		System.out.println("Introduce Cantidad: ");
		cantidad=entrada.nextInt();
		return cantidad;
	}

}
