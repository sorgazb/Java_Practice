package unidad9.tareasU9.energiasRenovables;

import java.util.HashSet;
import java.util.Iterator;

public class Planta {
	
	private String id;
	private TipoPlanta tipoPlanta;
	HashSet<ProductorEnergia> planta;
	
	public Planta(String id, TipoPlanta tipoPlanta) {
		this.id = id;
		this.tipoPlanta=tipoPlanta;
		planta= new HashSet<ProductorEnergia>();
	}
	
	public void aniadirProductor(ProductorEnergia productor) {
		planta.add(productor);
	}
	
	public double capacidadTotal() {
		double energiaTotal=0;
		Iterator iterador= planta.iterator();
		while(iterador.hasNext()) {
			ProductorEnergia productor= (ProductorEnergia)iterador.next();
			energiaTotal=energiaTotal+productor.capacidadGenerada;
		}
		return energiaTotal;
	}
	
	public void mostrarPlanta() {
		Iterator iterador= planta.iterator();
		while(iterador.hasNext()) {
			ProductorEnergia productor= (ProductorEnergia)iterador.next();
			System.out.println(productor);;
		}
	}
	
	
	
}
