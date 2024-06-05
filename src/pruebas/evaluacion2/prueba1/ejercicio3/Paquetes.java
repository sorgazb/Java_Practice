package pruebas.evaluacion2.prueba1.ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Paquetes {
	
	private String [] id = {"1234-PLASENCIA","5678-ZAFRA","9012-NAVALMORAL DE LA MATA","3456-CACERES",
							"7890-BADAJOZ","2345-MERIDA", "6789-CACERES", "0123-PLASENCIA",
							"4567-NAVALMORAL DE LA MATA", "8901-BADAJOZ", "2345-NAVALMORAL DE LA MATA",
							"6789-BADAJOZ", "0123-PLASENCIA", "4567-ZAFRA", "8901-ZAFRA","2345-PLASENCIA",
							"6789-CACERES", "0123-ZAFRA", "4567-BADAJOZ", "8901-NAVALMORAL DE LA MATA","2345-DON BENITO",
							"6789-CORIA", "0123-CACERES","4567-CORIA","8901-PLASENCIA",
							"6622-CACERES", "5541-BADAJOZ","6551-ZAFRA","4317-DON BENITO",
							"9544-BADAJOZ","9691-CACERES","5190-NAVALMORAL DE LA MATA","1288-PLASENCIA",
							"3971-ZAFRA", "5378-DON BENITO", "4569-PLASENCIA","5561-MERIDA",
							"4136-DON BENITO", "6186-PLASENCIA", "5682-NAVALMORAL DE LA MATA",
							"6149-MERIDA", "2240-CORIA", "2809-MERIDA", "5018-MERIDA",
							"1540-CORIA", "5721-MERIDA", "6212-MERIDA", "1826-CACERES",
							"1347-CORIA", "5665-ZAFRA", "8368-DON BENITO","2014-DON BENITO",
							"5005-PLASENCIA", "8445-PLASENCIA", "3882-ZAFRA", "4054-DON BENITO",
							"5980-PLASENCIA", "3581-CORIA", "9819-DON BENITO", "7780-ZAFRA","4649-CACERES"};

	
	private double [] peso= {5.634,
            4.665,
            0.326,
            1.068,
            5.794,
            3.633,
            3.037,
            5.636,
            4.313,
            1.364,
            2.138,
            2.775,
            4.812,
            3.327,
            2.514,
            2.264,
            5.142,
            2.511,
            2.701,
            3.697,
            5.26,
            3.134,
            3.736,
            3.916,
            1.422,
            4.397,
            1.18,
            0.543,
            5.582,
            2.128,
            1.937,
            2.844,
            5.937,
            4.757,
            4.883,
            5.874,
            0.933,
            3.867,
            4.121,
            3.34,
            5.509,
            1.369,
            5.176,
            5.117,
            2.792,
            5.383,
            3.513,
            2.41,
            2.044,
            0.422,
            1.1,
            2.912,
            4.987,
            5.52,
            3.784,
            2.662,
            3.784,
            2.662,
            5.668,
            1.27,
            1.507};


	private String [] fechas= {"05/03/2024",
            "17/03/2024",
            "03/03/2024",
            "12/03/2024",
            "14/03/2024",
            "18/03/2024",
            "18/03/2024",
            "09/03/2024",
            "07/03/2024",
            "06/03/2024",
            "07/03/2024",
            "18/03/2024",
            "15/03/2024",
            "06/03/2024",
            "06/03/2024",
            "08/03/2024",
            "20/03/2024",
            "16/03/2024",
            "17/03/2024",
            "05/03/2024",
            "09/03/2024",
            "16/03/2024",
            "01/03/2024",
            "19/03/2024",
            "16/03/2024",
            "09/03/2024",
            "15/03/2024",
            "03/03/2024",
            "17/03/2024",
            "16/03/2024",
            "18/03/2024",
            "16/03/2024",
            "09/03/2024",
            "06/03/2024",
            "08/03/2024",
            "05/03/2024",
            "01/03/2024",
            "19/03/2024",
            "01/03/2024",
            "20/03/2024",
            "17/03/2024",
            "10/03/2024",
            "01/03/2024",
            "07/03/2024",
            "11/03/2024",
            "14/03/2024",
            "12/03/2024",
            "19/03/2024",
            "10/03/2024",
            "19/03/2024",
            "15/03/2024",
            "01/03/2024",
            "13/03/2024",
            "05/03/2024",
            "12/03/2024",
            "11/03/2024",
            "20/03/2024",
            "04/03/2024",
            "18/03/2024",
            "03/03/2024",
            "24/03/2024"};

	private List<Paquete> listaPaquetes;
	
	public Paquetes() {
		listaPaquetes= new ArrayList<Paquete>();
		for(int i=0; i < id.length; i++) {
			listaPaquetes.add(new Paquete(id[i], peso[i], fechas[i]));
		}
	}
	
	public void obtenerListadoPaquetes() {
		System.out.println("---LISTA DE PAQUETES---");
		Iterator iteradorPaquetes= listaPaquetes.iterator();
		while(iteradorPaquetes.hasNext()) {
			Paquete paquete= (Paquete)iteradorPaquetes.next();
			System.out.println(paquete);
		}
	}
	
	public void obtenerListadoZona(int zona) {
		System.out.println("---LISTA DE PAQUETES---");
		Iterator iteradorPaquetes= listaPaquetes.iterator();
		while(iteradorPaquetes.hasNext()) {
			Paquete paquete= (Paquete)iteradorPaquetes.next();
			if(paquete.getZona()==zona){
				System.out.println(paquete);
			}
		}
	}
	
	public void obtenerListadoEmpresa(int zona) {
		System.out.println("---LISTA DE PAQUETES---");
		Iterator iteradorPaquetes= listaPaquetes.iterator();
		while(iteradorPaquetes.hasNext()) {
			Paquete paquete= (Paquete)iteradorPaquetes.next();
			if(paquete.getZona()==zona){
				System.out.println(paquete);
			}
		}
	}
	
	public void obtenerListadoPaquetesCoste() {
		System.out.println("---LISTA DE PAQUETES---");
		Iterator iteradorPaquetes= listaPaquetes.iterator();
		while(iteradorPaquetes.hasNext()) {
			Paquete paquete= (Paquete)iteradorPaquetes.next();
			System.out.println("ID Paquete: "+paquete.getId()+" Coste: "+paquete.getCosteEnvio());
		}
	}
	
	public void mostrarIdCorto() {
		System.out.println("---LISTA DE PAQUETES---");
		Iterator iteradorPaquetes= listaPaquetes.iterator();
		while(iteradorPaquetes.hasNext()) {
			Paquete paquete= (Paquete)iteradorPaquetes.next();
			if(paquete.getId().contains("PLASENCIA")) {
				paquete.setId(paquete.getId().replace("PLASENCIA","PLAS"));
			}else if(paquete.getId().contains("CACERES")) {
				paquete.setId(paquete.getId().replace("CACERES","CACE"));
			}else if(paquete.getId().contains("CORIA")) {
				paquete.setId(paquete.getId().replace("CORIA","CORI"));
			}else if(paquete.getId().contains("NAVALMORAL DE LA MATA")) {
				paquete.setId(paquete.getId().replace("NAVALMORAL DE LA MATA","NAVA"));
			}else if(paquete.getId().contains("MERIDA")) {
				paquete.setId(paquete.getId().replace("MERIDA","MERI"));
			}else if(paquete.getId().contains("BADAJOZ")) {
				paquete.setId(paquete.getId().replace("BADAJOZ","BADA"));
			}else if(paquete.getId().contains("DON BENITO")) {
				paquete.setId(paquete.getId().replace("DON BENITO","DONB"));
			}else if(paquete.getId().contains("ZAFRA")) {
				paquete.setId(paquete.getId().replace("ZAFRA","ZAFR"));
			}
			System.out.println("ID Paquete: "+paquete.getId());
		}
	}
}
