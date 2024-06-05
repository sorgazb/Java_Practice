package unidad8.tareasU8.tarea1;

public class CuentaCorriente extends Cuenta{
	
	public static final double SALDO_MIN=10;
	private int num_Titulares;
	
	public CuentaCorriente() {
		super();
		this.num_Titulares=1;
	}
	
	public CuentaCorriente(String nombre, double cantidad, int num_Titulares) {
		super(nombre, cantidad);
		this.num_Titulares=num_Titulares;
		
	}

	public int getNum_Titulares() {
		return num_Titulares;
	}

	public void setNum_Titulares(int num_Titulares) {
		this.num_Titulares = num_Titulares;
	}
	
	@Override
	public void retirada(double cantidad) {
		if(super.getCantidad()-cantidad <= SALDO_MIN) {
			System.out.println("La cantidad a retirar es demasiado grande.");
		}else {
			this.cantidad=getCantidad()-cantidad;
		}
	
	}
	
	@Override
	public String toString() {
		
		return super.toString()+" el numero de titulares de la cuenta es de "+this.num_Titulares;
	}
	
}
