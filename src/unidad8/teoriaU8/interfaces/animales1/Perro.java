package unidad8.teoriaU8.interfaces.animales1;

public class Perro implements Sonido {
	int pasos;
	@Override
	public void voz() {
		System.out.println("Guau Guau");
	}

	@Override
	public void andar() {
		pasos++;
	}

}
