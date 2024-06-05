package unidad5.teoriaU5;

public class Arrays {

	public static void main(String[] args) {
		
		final int MAX=30; //Constante de tamaño del array.
		
		//Array Edades
		int [] array_edades= new int[MAX];      //Array de edades con 10 posiciones.
		                                        //int vectorEdades[]; otra forma de declarar un array.
		array_edades[0 ]=13;
		array_edades[1]=6;
		array_edades[2]=34;
		array_edades[3]=56;
		array_edades[4]=19;
		array_edades[5]=25;
		array_edades[6]=42;
		
		System.out.println("____ORDEN_ASCENDENTE_____");
		for(int i=0; i < array_edades.length ;i++) {
			if(array_edades[i]!=0) {
				System.out.println("Edad "+(i+1)+" es: "+array_edades[i]);
			}
		}
		
		System.out.println("____ORDEN_DESCENDENTE_____");
		for (int j=(MAX-1); j>=0; j--) {
			if(array_edades[j]!=0) {
				System.out.println("Edad "+(j+1)+" es: "+array_edades[j]);
			}
		}
		
		System.out.println("_____MAYORES_DE_EDAD_____");
		int cont=0;
		for (int i=0; i < array_edades.length; i++) {
			if(array_edades[i]>17) {
				System.out.println("Edad "+(i+1)+" es mayor de edad con "+array_edades[i]+" años.");
				cont++;
			}
		}
		System.out.println("Hay "+cont+" usuarios mayores de edad.");
		
	}

}
