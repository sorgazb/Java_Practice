package unidad8.teoriaU8.interfaces.animales1;

public class Gato implements Sonido{
	double pasos;
	@Override
	public void voz() {
		System.out.println("Miau Miau");
	}

	@Override
	public void andar() {
		pasos=pasos*(1.15);
	}

}
