package unidad7.teoriaU7;


public class Almazara {
	//Constantes de la clase:
	private static final int NUM_PROCESOS_MAX=10;
	
	//Atributos de la clase:
	private int id;
	private String localidad;
	private ProcesoAlmazara[] procesos= new ProcesoAlmazara[NUM_PROCESOS_MAX];
	
	//Constructores de la clase:
	public Almazara(int id, String localidad) {
		this.id=id;
		this.localidad=localidad;
	}
	
	public Almazara(int id, String localidad, int numeroProcesos) {
		this.id=id;
		this.localidad=localidad;
		if(numeroProcesos <= NUM_PROCESOS_MAX) {
			for(int i=0; i < numeroProcesos; i++) {
				procesos[i]= new ProcesoAlmazara();
			}
		}
	}

	public Almazara(int id, String localidad, ProcesoAlmazara[] procesos) {
		this.id=id;
		this.localidad=localidad;
		this.procesos=procesos;
	}
	
	
	//Métodos de la clase:
	public void mostrarDatos() {
		System.out.println("Almazara: "+id);
		System.out.println("Localidad: "+localidad);
		mostrarProcesos();
		System.out.println("________________________");
	}

	public void mostrarProcesos() {
		for(int i=0; i < NUM_PROCESOS_MAX; i++) {
			if(procesos[i]!=null) {
				procesos[i].mostrarDatos();
			}
		}
	}

	public void addProceso(ProcesoAlmazara proceso) {
		boolean insertado=false;
		int i=0;
		while(!insertado && i<NUM_PROCESOS_MAX) {
			if(procesos[i]==null) {
				procesos[i]=proceso;
				insertado=true;
			}else {
				i++;
			}
		}
	}
	
	
}
