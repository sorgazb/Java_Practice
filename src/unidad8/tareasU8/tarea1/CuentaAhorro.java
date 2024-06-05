package unidad8.tareasU8.tarea1;

public class CuentaAhorro extends Cuenta{
	
	public static final double BONO=10;
	
	public CuentaAhorro() {
		super();
		depositar(BONO);
	}
	
	@Override
	public void retirada(double cantidad) {
		this.cantidad=getCantidad()-cantidad;
		if(getCantidad()<0) {
			System.out.println("Saldo de la cuenta negativo.");
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+" al ser una Cuenta de Ahorro ha obtenido un bono de "+BONO+"€.";
	}
}
