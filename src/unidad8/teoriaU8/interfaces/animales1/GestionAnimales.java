package unidad8.teoriaU8.interfaces.animales1;

public class GestionAnimales {

	public static void main(String[] args) {
		
		Perro p1= new Perro();
		Gato g1= new Gato();
		Leon l1= new Leon();
		
		p1.voz();
		g1.voz();
		l1.voz();
		
		Sonido sonido= p1;
		sonido.voz();
		sonido=g1;
		sonido.voz();
		sonido=l1;
		sonido.voz();
	}

}
