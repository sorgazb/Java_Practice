package tareasFinales.panelesYPlantaSolar;

public class DemoPlantaSolar {

	public static void main(String[] args) {
		PanelSolar p1= new PanelSolar("P1", 85, true, 45.6, 100, false);
		PanelSolar p2= new PanelSolar("P2", 30, false, 60, 75.5, false);
		PanelSolar p3= new PanelSolar("P3", 73, false, 22.5, 120, false);
		PanelSolar p4= new PanelSolar("P4", 70, false, 20, 100, false);
		
		PlantaSolar plantaSolar= new PlantaSolar();
		plantaSolar.aniadirPanel(p1);
		plantaSolar.aniadirPanel(p2);
		plantaSolar.aniadirPanel(p3);
		plantaSolar.aniadirPanel(p4);
		
		if(plantaSolar.yaExiste(p1)) {
			System.out.println("Ya existe ese Panel no se puede añadir.");
		}
		
		plantaSolar.alinearPlanta();
		
		plantaSolar.obtenerValoresMedios();
		
		plantaSolar.obtenerPrimerPanelAveriado();
	}

}
