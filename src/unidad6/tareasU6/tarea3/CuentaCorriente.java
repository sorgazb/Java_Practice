package unidad6.tareasU6.tarea3;

public class CuentaCorriente {
	//Atributos de la clase CuentaCorriente:
	private Titular titular;
	private String numero_cuenta;
	private double saldo;
	
	//Constructor de la clase CuentaCorriente con Titular String double:
	public CuentaCorriente(Titular titular, String numero_cuenta, double saldo) {
		this.titular= titular;
		this.numero_cuenta=numero_cuenta;
		this.saldo=saldo;
	}
	
	//Constructor de la clase CuentaCorriente con Titular String double=15.3:
	public CuentaCorriente(Titular titular, String numero_cuenta) {
		this.titular=titular;
		this.numero_cuenta=numero_cuenta;
		this.saldo=15.3;
	}

	//Métodos Getters & Setters de la clase CuentaCorriente:
	public Titular getTitular() {
		return titular;
	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Métodos de la clase CuentaCorriente:
	
	//Método ingresar que aumenta el saldo en función de cantidad:
	public void ingresar(double cantidad) {
		this.saldo=saldo+cantidad;
	}
	
	//Método reintegro que decrementa el saldo en funcíon de cantidad:
	public void reintegro(double cantidad) {
		this.saldo=saldo-cantidad;
	}
	
	//Método para imprimir datos de una cuenta corriente:
	public void imprimirDatos() {
		System.out.println("----CUENTA CORRIENTE:----");
		System.out.println("-Titular: "+this.titular.getNombre()+" "+this.titular.getApellidos());
		System.out.println("-Edad: "+this.titular.getEdad());
		System.out.println("-Numero de cuenta: "+this.numero_cuenta);
		System.out.println("-Saldo actual: "+this.saldo+"€");
	}
	
	//Método para comparar cuentas:
	public boolean compararCuentas(String cuenta) {
		boolean iguales=false;
		if(this.numero_cuenta.compareTo(cuenta)==0) {
			iguales=false;
		}else {
			iguales=true;
		}
		return iguales;
	}
}
