package unidad10.teoriaU10;

public class DemoDivision {
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		double resultado=0;
		
		try{
			resultado=a/b;
		}catch(ArithmeticException exc) {
			System.err.println("Se ha producido un error.");
		}
		
		System.out.println("Resultado:"+resultado);
		
	}
}
