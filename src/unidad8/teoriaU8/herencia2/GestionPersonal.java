package unidad8.teoriaU8.herencia2;

public class GestionPersonal {

	public static void main(String[] args) {
		Persona p1= new Persona("Manuel");
		Persona p2= new Persona("Manuel");
		p1.setLocalidad("Talayuela");
		p2.setLocalidad("Peraleda");
		
		if(p1.equals(p2)) {
			System.out.println("Son la misma persona");
		}else {
			System.out.println("No son la misma persona");
		}
		
		System.out.println(p1);
		System.out.println(p2);

		

	}

}
