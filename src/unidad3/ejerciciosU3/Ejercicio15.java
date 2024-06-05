package unidad3.ejerciciosU3;
/*
 * Suponga que la población de bovino de la provincia de Cáceres es de 354000 y que la población aumenta
 * 1.01 por ciento anualmente. Suponga que la población de ovino de Badajoz es de 410000 y que la población
 * se reduce 0.15 por ciento anual.Escribir una aplicación que muestra las poblaciones de las dos proviencias
 * cada año hasta que la población de Cáceres exceda a la de los de Badajoz, y muestre el número de años
 * que se necesitó para superar. Guarde el archivo como PoblacionBovina.java
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		double poblacionCaceres=354000;
		double poblacionBadajoz=410000;
		double crecimientoCaceres=1.01;
		double decrecimientoBadajoz=0.15;
		int anio=2023;
		int contador=0;
		System.out.println("Año:"+anio);
		System.out.println("Población Caceres: "+poblacionCaceres);
		System.out.println("Población Badajoz: "+poblacionBadajoz);
		System.out.println("-------------------------------------------");
		while(poblacionCaceres<poblacionBadajoz) {
			anio=anio+1;
			System.out.println("Año:"+anio);
			poblacionCaceres=(((poblacionCaceres*1.01)/100)+poblacionCaceres);
			poblacionBadajoz=poblacionBadajoz-((poblacionBadajoz*0.15)/100);
			System.out.println("Población Caceres: "+poblacionCaceres);
			System.out.println("Población Badajoz: "+poblacionBadajoz);
			System.out.println("-------------------------------------------");
			contador++;
		}
		System.out.println("Tarda "+contador+" años.");
	}
}
