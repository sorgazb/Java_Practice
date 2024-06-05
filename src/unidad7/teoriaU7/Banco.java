package unidad7.teoriaU7;
import java.security.SecureRandom;
import java.util.Scanner;

public class Banco {
	
	//public Scanner entrada= new Scanner();

	public static void main(String[] args) {
		String cvv=generarCVV();
		String numero=generarNumero();
     	TarjetaBancaria tarjeta1= new TarjetaBancaria(numero,cvv,"",11,25,"Visa","BBVA");
		tarjeta1.mostrarDatos();
	}
	
	private static String generarCVV() {
		int cvv;
		String cvvString="";
		SecureRandom random= new SecureRandom();
		cvv=random.nextInt(1000);
		if(cvv<100) {
			if(cvv<10) {
				cvvString=("00"+cvv);
			}else {
				cvvString=("0"+cvv);
			}
		}else {
			cvvString=(""+cvv);
		}
		return cvvString;
	}
	
	private static String generarNumero() {
		String num="";
		int num1;
		int num2;
		int num3;
		int num4;
		SecureRandom random= new SecureRandom();
		num1=random.nextInt(10000);
		num2=random.nextInt(10000);
		num3=random.nextInt(10000);
		num4=random.nextInt(10000);
		num=(""+num1+" "+num2+" "+num3+" "+num4);
		return num;
	}


}
