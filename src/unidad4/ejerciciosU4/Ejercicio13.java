package unidad4.ejerciciosU4;
import java.util.Scanner;

/*
 * Escriba un método Java para calcular el valor de la inversión futura 
 * a una tasa de interés determinada durante un número específico de años.
 * Ingresar el monto de la inversión: 1000
 * Ingresar la tasa de interés: 10
 * Ingresar el número de años: 5
 * Salida esperada:
 * Años	Valores futuros                                 	
 * 1        	1104.71                                 	
 * 2        	1220.39                                     
 * 3        	1348.18                                 	
 * 4        	1489.35                                 	
 * 5        	1645.31
 */



public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el monto de la inversión: ");
        double montoInicial = scanner.nextDouble();

        System.out.print("Ingresar la tasa de interés (porcentaje): ");
        double tasaInteres = scanner.nextDouble() / 100.0;

        System.out.print("Ingresar el número de años: ");
        int numAnios = scanner.nextInt();

        scanner.close();

        System.out.println("Años\tValor Futuro");

        for (int i = 1; i <= numAnios; i++) {
            double valorFuturo = calcularValorFuturo(montoInicial, tasaInteres, i);
            System.out.printf("%d\t%.2f%n", i, valorFuturo);
        }
    }

    public static double calcularValorFuturo(double montoInicial, double tasaInteres, int numAnios) {
        return montoInicial * Math.pow(1 + tasaInteres, numAnios);
    }
    
 
    
}
