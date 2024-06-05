package unidad8.teoriaU8.interfaces.animales2;

public interface Mascota {
	
	String getCodigo();
	void hacerRuido();
	void come(String comida);
	void peleaCon(Animal contrincante);
	
}
