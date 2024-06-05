package unidad5.teoriaU5;

public class Venta_Anuales {
	//Constantes:
	static final int NUM_ANIOS=5;
	static final int NUM_TRIMESTRES=4;
	
	public static void main(String[] args) {
		//Definimos la matriz (Array Bidimensional):
		int [][] ventasAnuales= new int [NUM_ANIOS][NUM_TRIMESTRES];
		
		//Inicializamos ciertas casillas de la matriz:
		ventasAnuales[0][0]=100;
		ventasAnuales[0][1]=1500;
		ventasAnuales[0][2]=1800;
		ventasAnuales[1][0]=100;
		ventasAnuales[2][0]=1400;
		ventasAnuales[3][3]=2000;
		
		//Mostramos la Matriz por pantalla:
		for(int i=0; i < NUM_ANIOS; i++) {//filas
			for(int j=0; j < NUM_TRIMESTRES; j++) {//columnas
				System.out.print("["+ventasAnuales[i][j]+"]");
			}
			System.out.println("");
		}
		
	}

}
