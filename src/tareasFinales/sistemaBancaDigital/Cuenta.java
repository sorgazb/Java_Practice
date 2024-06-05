package tareasFinales.sistemaBancaDigital;

public class Cuenta {
	
	private String idCuenta;
	private double balance;
	
	public Cuenta(String idCuenta, double balance) {
		super();
		this.idCuenta = idCuenta;
		this.balance = balance;
	}
	
	
	
	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void depositar(double cantidad) {
		if(cantidad>0) {
			this.balance=balance+cantidad;
		}else {
			System.out.println("ERROR. No se puede ingresar esa cantidad.");
		}
		
	}
	
	public boolean retirar(double cantidad) {
		boolean sePuede=false;
		if(cantidad<0) {
			System.out.println("ERROR.No se puede retirar");
		}else {
			this.balance=balance-cantidad;
		}
		return sePuede;
	}
	
	
}
