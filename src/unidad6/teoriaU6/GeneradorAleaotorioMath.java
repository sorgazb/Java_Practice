package unidad6.teoriaU6;

public class GeneradorAleaotorioMath {

	public static void main(String[] args) {
		
		//Se genera aleatorio entre el 0.0 y 1.0 double
		double numero= Math.random();
		System.out.println(numero);
		
		//Se genera aleatorio entre el 0 y 9 double
		double numero2= (Math.random()*10);
		System.out.println(numero2);
		
		//Se genera aleatorio entre el 0 y 9 int
		int numero3=(int)(Math.random()*10);
		System.out.println(numero3);
		
		//Se genera aleatorio entre el 0 y 10 int
		int numero4=(int)(Math.random()*10+1);
		System.out.println(numero4);
		
		//Se genera aleatorio entre el 0 y 100 int
		int numero5=(int)(Math.random()*100+1);
		System.out.println(numero5);
	}

}
