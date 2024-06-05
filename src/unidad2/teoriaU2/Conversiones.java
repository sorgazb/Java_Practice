package unidad2.teoriaU2;

public class Conversiones {

	public static void main(String[] args) {
		//Convertimos un número entero en un float.
		int numeroEntero=34;
		float numeroFloat;
		System.out.println("Numero Entero:"+numeroEntero) ;
		numeroFloat=numeroEntero;
		System.out.println("Numero float:"+numeroFloat);
		
		//Cuidado al hacer a los siguientes casos ya que al hacer el cambio se pierde información.
		
	    //Convertimos un numero float en un entero.
		int numeroEntero2=0;
		float numeroFloat2=34.5678f;
		System.out.println("Numero float:"+numeroFloat2);
		//Entre parentesis debemos indicar al tipo de datos que queremos cambiar.
		numeroEntero2=(int)numeroFloat2;
		System.out.println("Numero entero:"+numeroEntero2);
		
		//Convertimos un numero entero en tipo byte.
		byte numeroByte;
		int numeroEntero3=54345;
		numeroByte=(byte)numeroEntero3;
		System.out.println("Numero byte:"+numeroByte);
		
	}

}
