package unidad8.tareasU8.tarea1;

public class GestorCuenta {

	public static void main(String[] args) {
		CuentaCorriente cuenta_corriente= new CuentaCorriente();
		//CuentaAhorro cuenta_ahorro= new CuentaAhorro();
		
		System.out.println("----Cuenta Ahorro----");
		System.out.println(cuenta_corriente);
		//System.out.println("----Cuenta Corriente----");
		//System.out.println(cuenta_ahorro);
		
		cuenta_corriente.retirada(130);
		System.out.println("Despues retirada");
		System.out.println(cuenta_corriente);
	}

}
