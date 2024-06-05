package pruebas.evaluacion3.prueba1;

public class Cuenta {
	
	private String idCliente;
	private String IBAN;
	private double balance;
	
	public Cuenta(String idCliente, String iBAN, double balance) {
		super();
		this.idCliente = idCliente;
		IBAN = iBAN;
		this.balance = balance;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Cuenta [idCliente=" + idCliente + ", IBAN=" + IBAN + ", balance=" + balance + "]";
	}
	
	
	
	
}
