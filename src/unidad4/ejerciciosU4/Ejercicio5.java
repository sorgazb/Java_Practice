package unidad4.ejerciciosU4;

/*
 * En esta tarea, se escribe una clase Secuencia que muestra una secuencia comenzando con los 
 * números 1 y 1. Los números sucesivos en la secuencia son la suma de los dos números anteriores.
 * Por ejemplo: 1 1 2 3 5 8 13. Siga estos pasos para crear la clase:
 * a)Escriba una clase llamada Secuencia que contenga un método llamado mostrarSecuencia.
 * b)El método deberá contener un bucle while que:
 * -Realice una operación para calcular un número en la secuencia.
 * -Mostrar los 10 primeros números en la secuencia. El resultado debe ser el
 * siguiente: 1-1-2-3-5-8-13-21-34-55
 */

public class Ejercicio5 {
	//Creo una constante por si en algún momento el usuario 
	//decide cambiar el número de inicio de la secuencia.
	final static int NUMERO_INI=1;
	
	//Método principal en el cual se llama únicamente al 
	//método "mostrarSecuencia"
	public static void main(String[] args) {
		mostarSecuencia();
	}
	
	//Método mostrarSecuencia, el cual génera todos los
	//10 primeros números de la secuencia 
	public static void mostarSecuencia() {
		int cont=2;//iniciamos el contador a 2 porque sabemos ya los 2 primeros numeros de la secuencia
		int numero1= NUMERO_INI;
		int numero2=0;
		int siguiente=siguienteNumero(numero1, numero2);
		numero2=siguiente;
		System.out.println(numero1);
		while(cont<11) {//el bucle genera los 8 números restantes de la secuencia.
			System.out.println(siguiente);
			numero1=numero2;//actualizamos los dos numero de la secuencia con el valor siguiente que le corresponde a cada uno.
			numero2=siguiente;
			siguiente=siguienteNumero(numero1, numero2);
			cont ++;
		}
	}
	
	//Método siguienteNúmero, el cual se encarga de generar y devolvernos el siguente número
	//que le corresponde a la secuencia.
	public static int siguienteNumero(int a, int b) {
		int siguienteNumero=a+b;
		return siguienteNumero;
	}

}
