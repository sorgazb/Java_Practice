package unidad2.ejerciciosU2;

public class Ejercicio22 {

	public static void main(String[] args) {
		long poblacionMundial=8045311500L;
		double tasaCrecimiento=0.9;
		System.out.println("La población mundial actual es de: "+poblacionMundial);
		System.out.println("La tasa de crecimiento anual mundial es de: "+tasaCrecimiento);
		System.out.println("La población mundial del año que viene será de: "+(poblacionMundial*tasaCrecimiento));
		System.out.println("La población mundial dentro de 2 años será de: "+(poblacionMundial*(tasaCrecimiento*2)));
		System.out.println("La población mundial dentro de 3 años será de: "+(poblacionMundial*(tasaCrecimiento*3)));
		System.out.println("La población mundial dentro de 4 años será de: "+(poblacionMundial*(tasaCrecimiento*4)));
		System.out.println("La población mundial dentro de 5 años será de: "+(poblacionMundial*(tasaCrecimiento*5)));
	}
}
