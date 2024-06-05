package unidad4.teoriaU4;

public class Factorial {

	public static void main(String[] args) {
		int numero=6;
		int resultado= calcularFactorial(numero);
		System.out.println("El factorial de "+numero+" es:"+resultado);
	}
	
	private static int calcularFactorial(int numero) {
		int res;
		if(numero==0 || numero==1) {
			res=1;
		}
		else {
			res=numero*(calcularFactorial(numero-1));
		}
		return res;
	}

}
