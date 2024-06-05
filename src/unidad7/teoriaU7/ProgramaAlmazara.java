package unidad7.teoriaU7;

public class ProgramaAlmazara {
	
	public static final int NUM_PROCESOS=10;

	public static void main(String[] args) throws InterruptedException {
		
		ProcesoAlmazara [] procesoAlmazara= new ProcesoAlmazara[NUM_PROCESOS];
		
		for(int i=0; i < NUM_PROCESOS; i++) {
			procesoAlmazara[i]= new ProcesoAlmazara();
			System.out.println("Proceso "+(i+1)+" creado.");
		}
		
		for(int i=0; i < NUM_PROCESOS; i++) {
			System.out.println("-----------------");
			System.out.println("Proceso "+(i+1));
			procesoAlmazara[i].mostrarDatos();
			Thread.sleep(2000);
		}
		
		
	}

}
