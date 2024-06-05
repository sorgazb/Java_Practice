package unidad3.ejerciciosU3;
import java.util.Scanner;
/*
 * Se desea escribir un programa para el cálculo del área de superficies: cuadrado,
 * rectángulo, círculo, triángulo y trapecio. El programa mostrará al inicio el siguiente
 * menú:
 * Seguidamente leerá de la entrada estándar un valor que estará comprendido entre 1 y 5, 
 * indicando el tipo de superficie cuya área se desea calcular. El programa leerá entonces 
 * los datos que necesite para calcular el área en cuestión. El resultado se mostrará en la
 * salida estándar, tras lo cual el programa terminará.
 */

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("_________________________________");
		System.out.println("CÁLCULO DE SUPERFICIES");           
		System.out.println("1.Cuadrado lado*lado");             
		System.out.println("2.Circulo pi*radio*radio");          
		System.out.println("3.Rectángulo base*altura");         
		System.out.println("4.Trapecio (base1+base2)*altura/2");
		System.out.println("5.Triángulo (base*altura)/2");
		System.out.println("_________________________________");
		
		int opcion;
		System.out.print("Opcion:");
		opcion=entrada.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("1.Cuadrado lado*lado"); 
			float lado;
			System.out.print("Introduce la medida del lado:");
			lado=entrada.nextFloat();
			System.out.println("Area cuadrado: "+(lado*lado));
			break;
		case 2:
			System.out.println("2.Circulo pi*radio*radio");
			float radio;
			final double pi=3.1416;
			System.out.print("Introduce la medida del radio:");
			radio=entrada.nextFloat();
			System.out.println("Area circulo: "+(pi*radio*radio));
			break;
		case 3:
			System.out.println("3.Rectángulo base*altura"); 
			float base;
			float altura;
			System.out.print("Introduce la medida de la base:");
			base=entrada.nextFloat();
			System.out.print("Introduce la medida de la altura:");
			altura=entrada.nextFloat();
			System.out.println("Area cuadrado: "+(base*altura));
			break;
		case 4:
			System.out.println("4.Trapecio (base1+base2)*altura/2");
			float base1;
			float base2;
			float alturaTr;
			System.out.print("Introduce la medida de la base1:");
			base1=entrada.nextFloat();
			System.out.print("Introduce la medida de la base2:");
			base2=entrada.nextFloat();
			System.out.print("Introduce la medida de la altura:");
			alturaTr=entrada.nextFloat();
			System.out.println("Area cuadrado: "+((base1+base2)*alturaTr/2));
			break;
		case 5:
			System.out.println("5.Triángulo (base*altura)/2");
			float baseTri;
			float alturaTri;
			System.out.print("Introduce la medida de la base:");
			baseTri=entrada.nextFloat();
			System.out.print("Introduce la medida de la altura:");
			alturaTri=entrada.nextFloat();
			System.out.println("Area cuadrado: "+((baseTri*alturaTri)/2));
			break;
		default:
			System.out.println("Error.");
			break;
		}
	}

}
