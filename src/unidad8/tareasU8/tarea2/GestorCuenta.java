package unidad8.tareasU8.tarea2;

public class GestorCuenta {

	public static void main(String[] args) {
		CuentaCorriente cuenta_corriente= new CuentaCorriente();
		CuentaAhorro cuenta_ahorro= new CuentaAhorro();
		
		System.out.println("----Cuenta Ahorro----");
		System.out.println(cuenta_corriente);
		System.out.println("----Cuenta Corriente----");
		System.out.println(cuenta_ahorro);
		
	
		cuenta_corriente.withdraw(100);
		cuenta_ahorro.withdraw(100);
		
		System.out.println("Despues retirada");
		System.out.println(cuenta_corriente);
		System.out.println(cuenta_ahorro);
	}

}
