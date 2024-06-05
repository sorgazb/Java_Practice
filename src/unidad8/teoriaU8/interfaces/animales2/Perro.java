package unidad8.teoriaU8.interfaces.animales2;

public class Perro extends Animal implements Mascota{
	
	private String codigo;
	
	public Perro(Sexo sexo, String codigo) {
		super(sexo);
		this.codigo=codigo;
	}
	
	public Perro(String codigo) {
		super();
		this.codigo=codigo;
	}

	@Override
	public String getCodigo() {
		return codigo;
	}

	@Override
	public void hacerRuido() {
		this.ladra();
	}

	private void ladra() {
		System.out.println("Guau Guau");
	}

	@Override
	public void come(String comida) {
		if("Carne".equals(comida) || "carne".equals(comida)) {
			System.out.println("UMMM, Gracias.");
			ladra();
		}else {
			System.out.println("Lo siento, yo solo como carne");
			ladra();
		}
	}

	@Override
	public void peleaCon(Animal contrincante) {
		//Si el contrincante cuyo nombre de clase es Perro...
		if(contrincante.getClass().getSimpleName().equals("Perro")) {
			System.out.println("Ven aquí que te vas a enterar...");
		}else {
			System.out.println("No me gusta pelear");
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}
