package unidad2.teoriaU2;

public class Literales {

	public static void main(String[] args) {
		//Numero en codigo binario.
		//Se usa el 0b antes del numero para indicar que es binario
		int binario=0b0000101_00111001_01111111_10110001;
		System.out.println(binario) ;
		int binario2=0b0000_0101_0011_1001_0111_1111_1011_0001;
		System.out.println(binario2);
		
		//Numero en codigo hexadecimal, se usa el 0x.
		int hexadecimal=0x5___3___9___7___F___B___1;
		System.out.println(hexadecimal);
		int hexadecimal2=0x5397FB1;
		System.out.println(hexadecimal2);
		
		//Para escribir un numero en octal se usa el 0.
		int octal=022;
		System.out.println(octal);
		int octal2=01001;
		System.out.println(octal2);
	}

}
