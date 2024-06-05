package unidad6.teoriaU6;

public class Cadena {

	public static void main(String[] args) {
		String cadena= new String(" Esto es una linea de texto que se almacena como cadena");
		
		//Medir la longitud de una cadena:
		System.out.println("Longitud de la cadena: "+cadena.length());
		
		//Concatenar cadenas;
		String otraCadena=", y ahora ampliamos la cadena";
		String cadenaFinal= cadena+otraCadena;
		System.out.println(cadenaFinal);
		//Otra forma de concatenar cadenas (función concat):
		String otraCadenaFinal=cadena.concat(otraCadena);
		System.out.println(otraCadenaFinal);
		
		//Para comparar Cadenas (función equals):
		String cadena1="Sergio";
		String cadena2="Sergio";
		if(cadena1.equals(cadena2)) {
			System.out.println("Ambas cadenas son iguales.");
		}
		else {
			System.out.println("Son cadenas distintas.");
		}
		
		//Elimina los espacios en blanco al inicio y final de la cadena (función trim):
		System.out.println(cadena.trim());
		
		//Indica el caracter que se encuentra en la posición que le indicas (función charAt(num)):
		System.out.println(cadena.charAt(3));
		
		//Para poner en mayuscula una cadena (función toUpperCase):
		String matricula=new String("1994-hvc");
		System.out.println(matricula.toUpperCase());
		
		//Para devolver la posición de la primera aparición de la letra que le pasas (función indexOf):
		System.out.println(cadena.indexOf("a"));
		//También le puedes pasar una palabra la cual te dice en que posicíon comienza esa palabra:
		System.out.println(cadena.indexOf("una"));
		
		//Para sustituir un caracter por otro en una cadena (función replace):
		System.out.println(cadena.replace("a","o"));
		//También lo podemos realizar con cadenas:
		System.out.println(cadena.replace("cadena", "moto"));
		
		//Para comprobar si una palabra se encuentra en un texto (función contains):
		System.out.println(cadena.contains("cadena"));
		
		//Para separar la información (leer ficheros fin de linea,;) (función split).
		String nombres="DAW,DAM,ASIR,SMR";
		String ciclos[]= nombres.split(",");
		for(String nombre: ciclos) {
			System.out.println(nombre);
		}
		
		
		
	}

}
