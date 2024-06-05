package unidad3.teoriaU3;

public class BucleFor2 {

	public static void main(String[] args) {
		int a,b;
		b=4;
		for(a=1;a<b;a++) {
			System.out.println("A="+a);
			System.out.println("B="+b);
			b--;
		}
		
		for(a=1,a=4;a<b; a++,b--) {
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
	}

}
