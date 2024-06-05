package unidad9.ejerciciosU9.ejercicio22;

public class CuentaAhorro extends CuentaBancaria{
	
	public final double SALDO_MINIMO=150;

	public CuentaAhorro(String iban, double saldo) {
		super(iban, saldo);	
		calcularInteres();
	}

	@Override
	public void calcularInteres() {
		if(saldo < SALDO_MINIMO) {
			saldo=saldo+(saldo*(INTERES_ANUAL_BASICO/2));
		}else {
			saldo=saldo+(saldo*(INTERES_ANUAL_BASICO*2));
		}
	}

}
