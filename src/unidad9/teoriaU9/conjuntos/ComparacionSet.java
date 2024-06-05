package unidad9.teoriaU9.conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparacionSet {

	public static void main(String[] args) {

		Set<String> frutasAlmacen = new HashSet<String>();
		Set<String> frutasTienda = new LinkedHashSet<String>();
		Set<String> frutasCampo = new TreeSet<String>();

		for (String fruta : Arrays.asList("mango", "manzana", "platano", "pera", "naranja", "sandia", "melón")) {
			frutasAlmacen.add(fruta);
			frutasTienda.add(fruta);
			frutasCampo.add(fruta);
		}

		// Sin orden específico:
		System.out.println("Orden en HashSet:" + frutasAlmacen);
		// Orden de llegada:
		System.out.println("Orden en LinkedHashSet:" + frutasTienda);
		// Orden alfabético:
		System.out.println("Orden en TreeSet:" + frutasCampo);
 //----------------------------------------------------------------------------------------------------------
		System.out.println("PRUEBA DE TIEMPO:");
		
		Set<Integer> numeros = new HashSet<Integer>();
		long tiempoInicio = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numeros.add(i);
		}
		long tiempoFinal = System.nanoTime();
		System.out.println("Tiempo total en insertar 10M de elementos en" + " un HashSet (nanoseg): "
				+ (tiempoFinal - tiempoInicio));

 //----------------------------------------------------------------------------------------------------------

		numeros = new LinkedHashSet<Integer>();
		tiempoInicio = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numeros.add(i);
		}
		tiempoFinal = System.nanoTime();
		System.out.println("Tiempo total en insertar 10M de elementos en" + " un LinkedHashSet (nanoseg): "
				+ (tiempoFinal - tiempoInicio));
		
//----------------------------------------------------------------------------------------------------------
		numeros = new TreeSet<Integer>();
		tiempoInicio = System.nanoTime();
		for (int i = 0; i < 10000000; i++) {
			numeros.add(i);
		}
		tiempoFinal = System.nanoTime();
		System.out.println("Tiempo total en insertar 10M de elementos en" + " un TreeSet (nanoseg): "
				+ (tiempoFinal - tiempoInicio));
	}

}
