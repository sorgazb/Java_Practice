package tareasFinales.taller;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
	
	private List<Coche> listaCoches;

	public Garaje() {
		super();
		this.listaCoches = new ArrayList<Coche>();
	}
	
	public void aniadirCocheGaraje(Coche coche) {
		boolean matriculaIgual=false;
		if(listaCoches.isEmpty()) {
			listaCoches.add(coche);
		}else {
			for(Coche cocheLista:listaCoches) {
				if(cocheLista.getMatricula().equals(coche.getMatricula())) {
					matriculaIgual=true;
				}
			}
			if(matriculaIgual==false) {
				listaCoches.add(coche);
			}else {
				System.err.println("ERROR. Ya existe un coche con esa matricula.");
			}
		}
	}
	
	public boolean validarMatricula(String matricula) {
		boolean formatoCorrecto=false;
		String matriculaProvincial="[A-Z]-\\d{4}-[A-Z]{2}";
		String matriculaNacional="[A-Z]{3}-\\d{4}";
		if(matricula.matches(matriculaProvincial) || matricula.matches(matriculaNacional)) {
			formatoCorrecto=true;
		}else {
			System.err.println("ERROR. Formato de matricula incorrecto");
		}
		return formatoCorrecto;
	}
	
}
