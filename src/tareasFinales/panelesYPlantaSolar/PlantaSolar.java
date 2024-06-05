package tareasFinales.panelesYPlantaSolar;

import java.util.ArrayList;
import java.util.List;

public class PlantaSolar {
	public static List<PanelSolar> plantaSolar;

	public PlantaSolar() {
		super();
		plantaSolar= new ArrayList<PanelSolar>();
	}
	
	public void aniadirPanel(PanelSolar panelSolar) {
		plantaSolar.add(panelSolar);
	}
	
	public boolean yaExiste(PanelSolar panelSolar) {
		boolean existe=false;
		for(PanelSolar panel:plantaSolar) {
			if(panel.obtenerId().equals(panelSolar.obtenerId())) {
				existe=true;
			}
		}
		return existe;
	}
	
	public void alinearPlanta() {
		for(PanelSolar panelSolar:plantaSolar) {
			if(panelSolar.isAlineado()==false) {
				panelSolar.setAlineado(true);
			}
		}
	}
	
	public void obtenerValoresMedios() {
		double acimutMedio=0;
		double elevacionMedia=0;
		int cont=0;
		for(PanelSolar panelSolar:plantaSolar) {
			acimutMedio=acimutMedio + panelSolar.getAcimut();
			elevacionMedia= elevacionMedia + panelSolar.getElevacion();		
			cont++;
		}
		System.out.println("El Acimut Medio es: "+(acimutMedio/cont));
		System.out.println("La Elevacion Media es: "+(elevacionMedia/cont));
	}
	
	public void obtenerPrimerPanelAveriado() {
		PanelSolar panelAveriado=null;
		for(PanelSolar panelSolar:plantaSolar) {
			if(panelSolar.isAveriado()) {
				panelAveriado=panelSolar;
				break;
			}
		}
		if(panelAveriado==null) {
			System.out.println("No existen Paneles Averiados.");
		}else {
			System.out.println("El ID del primer panel Averiado es: "+panelAveriado.obtenerId());
		}
	}
	
	
}
