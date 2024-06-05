package unidad8.teoriaU8.interfaces.animales1;

public class Leon implements Sonido {
	int pasos;
	@Override
	public void voz() {
		System.out.println("Grrrrr");
	}

	@Override
	public void andar() {
		pasos=pasos*2;
	}

}
