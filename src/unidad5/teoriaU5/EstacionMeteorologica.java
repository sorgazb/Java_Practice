package unidad5.teoriaU5;

public class EstacionMeteorologica {

	public static void main(String[] args) {
		//Para inicializar en la declaración:
		int  []temperaturas= {12,7,14,15,19,21,27,26,20,18,12,-5};
		System.out.println("____TEMPERATURA_MES____");
		for(int i=0; i < temperaturas.length; i++) {
			System.out.println("En el mes "+(i+1)+" : "+temperaturas[i]+"ºC.");
		}
		
		System.out.println("____DIAS_DE_LLUVIA____");
		int  []diasLluviosos= {5,7,1,5,9,2,7,6,0,1,12,5};
		for(int i=0; i < diasLluviosos.length; i++) {
			System.out.println("En el mes "+(i+1)+" llueven "+diasLluviosos[i]+" dias.");
		}
		
		System.out.println("____DIAS_LLUVIOSOS_ESTACIONES____");
		int  []diasLluviosos2= {28,6,48,89};
		for(int i=0; i < diasLluviosos2.length; i++) {
			System.out.println("En la estación"+(i+1)+" llueven "+diasLluviosos2[i]+" dias.");
		}
		
		System.out.println("____HUMEDAD____");
		int []humedad= {10,67,24,89,76,50};
		for(int i=0; i < humedad.length; i++) {
			System.out.println("En el mes "+(i+1)+" hay "+humedad[i]+" % de humedad.");
		}
		
		System.out.println("----------------------------------------------------");
		imprimirArray(temperaturas, "ºC");
		System.out.println("----------------------------------------------------");
		imprimirArray(diasLluviosos, "dias");
		System.out.println("----------------------------------------------------");
		imprimirArray(diasLluviosos2, "dias");
		System.out.println("----------------------------------------------------");
		imprimirArray(humedad, "%");
	}
	
	private static void imprimirArray(int [] datos, String unidad) {
		for(int i=0; i < datos.length; i++) {
			System.out.println("En el mes "+(i+1)+" hay "+datos[i]+" "+unidad);
		}
	}
	
}
