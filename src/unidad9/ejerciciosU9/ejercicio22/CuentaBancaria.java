package unidad9.ejerciciosU9.ejercicio22;

public abstract class CuentaBancaria {
	

	public final double INTERES_ANUAL_BASICO=0.03;
	
	protected String iban;
	protected double saldo;
	
	public CuentaBancaria(String iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void consultarDatos() {
		System.out.println("IBAN: "+iban);
		System.out.println("Saldo: "+saldo);
	}
	
	public void ingresarDinero(double aniadido) {
		if(aniadido > 0) {
			saldo= saldo+aniadido;
			System.out.println("Saldo añadido.");
		}else {
			System.err.println("ERROR. Cantidad invalida");
		}
	}
	
	public void retirarDinero(double retirado) {
		if(retirado > 0) {
			if(retirado <= saldo) {
				saldo= saldo -  retirado;
				System.out.println("Saldo retirado.");
			}else {
				System.err.println("ERROR. No se puede retirar tanto dinero.");
			}

		}else {
			System.err.println("ERROR. Cantidad invalida");
		}
	}
	
	public void traspaso(CuentaBancaria cuenta, double cantidad) {
		if(cantidad > 0) {
			if(cantidad <= saldo) {
				saldo= saldo -  cantidad;
				cuenta.ingresarDinero(cantidad);
				System.out.println("Traspaso realizado.");
			}else {
				System.err.println("ERROR. No se puede retirar tanto dinero.");
			}

		}else {
			System.err.println("ERROR. Cantidad invalida");
		}
	}
	
	public abstract void calcularInteres();
	
	
}
