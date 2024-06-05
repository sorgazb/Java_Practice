package unidad6.teoriaU6;

public class DemoStringBuffer {

	public static void main(String[] args) {
		String cadenaString= new String("Programación");
		//Son cadenas que cuando modificas la cadena no te devuelve una nueva cadena
		//sino que realiza la modificación sobre la misma.
		StringBuffer cadenaBuffer = new StringBuffer("Programación");
		StringBuilder cadenaBuilder= new StringBuilder("Programación");
		
		System.out.println("Cadena-String: "+cadenaString);
		System.out.println("Cadena-Buffer: "+cadenaBuffer);
		System.out.println("Cadena-Builder: "+cadenaBuilder);
		
		//*Concatenación:*
		
		//Genera una nueva cadena con la modificación (en este caso creamos una nueva cadena):
		System.out.println("Contatenación CLASE STRING:");
		String cadenaStringMod=cadenaString.concat(" en DAW");
		System.out.println(cadenaStringMod);
		
		//Modificación con el BUILDER Y BUFFER, no necesita crear ninguna nueva varible ni nada:
		cadenaBuffer.append(" en DAW");
		cadenaBuilder.append(" en DAW");
		System.out.println("Contatenación CLASE STRING-BUFFER:");
		System.out.println(cadenaBuffer);
		System.out.println("Contatenación CLASE STRING-BUILDER:");
		System.out.println(cadenaBuilder);
		
		//Capacidad y Longitud del array de caracteres de la cadena
		//Para el String buffer y el String builder:
		System.out.println("Longitud: "+cadenaBuffer.length());
		System.out.println("Capacidad: "+cadenaBuffer.capacity());
	}

}
