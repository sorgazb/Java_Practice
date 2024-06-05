package unidad7.teoriaU7;

public class AlmazaraEjecutable {

	public static void main(String[] args) {
		Almazara a1= new Almazara(1, "Coria");
		Almazara a2= new Almazara(2, "Navalmoral de la Mata",2);
		
		ProcesoAlmazara p1= new ProcesoAlmazara();
		ClienteAlmazara c1= new ClienteAlmazara("56482392F", "Raúl", true);
	
		p1.setCliente(c1);
		
		a1.mostrarDatos();
		a2.mostrarDatos();
		
		System.out.println("/////////////////////////////////////////////");
		
		a1.addProceso(p1);
		a1.mostrarDatos();
		
	}
	

}
