package unidad10.teoriaU10;

public class DemoArray {
	
	public static void main(String[] args) {
		
		int [] numeros= {1,2,3};
		
		try {
			numeros=null;
			System.out.println(numeros[40]);
		}catch(IndexOutOfBoundsException exc) {
			System.err.println("Valor fuera del límite. "+exc.getMessage());
		}catch(NullPointerException exc) {
			System.err.println("No existe array. "+exc.getMessage());
		}catch(Exception exc) {
			System.err.println("Se ha producido un error desconocido. "+exc.getMessage());
		}
		
	}
}
