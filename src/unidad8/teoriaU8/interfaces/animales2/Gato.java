package unidad8.teoriaU8.interfaces.animales2;

public class Gato extends Animal implements Mascota{
	
	private String codigo;
	private String raza;

	public Gato(Sexo sexo, String codigo, String raza) {
		super(sexo);
		this.codigo=codigo;
		this.raza=raza;
	}
	
	public Gato(Sexo sexo,String codigo) {
		super(sexo);
		this.codigo=codigo;
		this.raza="Siamés";
	}

	@Override
	public String getCodigo() {
		return codigo;
	}

	@Override
	public void hacerRuido() {
		this.maullar();
		this.ronronea();
	}

	private void ronronea() {
		System.out.println("Mrrrrrr");
	}

	private void maullar() {
		System.out.println("Miauuu Miauuu");
	}

	@Override
	public void come(String comida) {
		if("Pescado".equals(comida) || "pescado".equals(comida)) {
			System.out.println("UMMM, Gracias.");
			ronronea();
		}else {
			System.out.println("Lo siento,yo solo como pescado");
			maullar();
		}
	}

	@Override
	public void peleaCon(Animal contrincante) {
		if(this.getSexo()==Sexo.HEMBRA) {
			System.out.println("No me gusta pelear");
		}else if(contrincante.getSexo()==Sexo.HEMBRA) {
			System.out.println("No peleo contra gatitas ni contra perritas, salvo si es por comida");
		}else {
			System.out.println("Ven aquí que te vas a enterar");
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+"Raza: "+this.raza+"\n *******";
	}
	
	
}
