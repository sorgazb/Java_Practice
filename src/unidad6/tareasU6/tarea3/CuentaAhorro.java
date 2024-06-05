package unidad6.tareasU6.tarea3;

public class CuentaAhorro extends CuentaCorriente{
	//Atributo de la clase Cuenta Ahorro:
	private double interes;
	
	//Constructor de la clase CuentaAhorro:
	public CuentaAhorro(Titular titular, String numero_cuenta, double saldo, double interes) {
		super(titular, numero_cuenta, saldo);
		this.interes=interes;
	}
	
	//Constructor de la clase CuentaAhorro:
	public CuentaAhorro(Titular titular, String numero_cuenta,double interes) {
		super(titular, numero_cuenta);
		this.interes=interes;
	}
	
	//Constructor de la clase CuentaAhorro:
	public CuentaAhorro(Titular titular, String numero_cuenta) {
		super(titular, numero_cuenta);
		this.interes=2.5;
	}

	//Métodos Getters & Setters de la clase CuentaAhorro:
	public double getInteres() {
		return interes;
	}
	
	public void calcularInteres() {
		setSaldo(getSaldo()*interes);
	}
	
}
