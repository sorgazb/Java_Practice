package tareasFinales.sistemaBancaDigital;

public class BancaDigital {

	public static void main(String[] args) {
		Banco banco= new Banco("Banco Santander", "Madrid");
		Cliente cliente1 = new Cliente("00001", "Daniel", "daniel@gmail.com");
		Cuenta cuenta1= new Cuenta("Cuenta001", 0);
		banco.registrarCliente(cliente1);
		
		
		cliente1.abrirCuenta(cuenta1.getIdCuenta());
		
		cuenta1.depositar(100);
		System.out.println("Has depositado 100€ en la cuenta "+cuenta1.getIdCuenta());
		
		cuenta1.retirar(20);
		System.out.println("Has retirado 20€ en la cuenta "+cuenta1.getIdCuenta());
		
		System.out.println("El balance de la cuenta "+cuenta1.getIdCuenta()+" es "+cuenta1.getBalance()+"€");
		
		if(cliente1.login("daniel@gmail.com", "Daniel")==true) {
			System.out.println("Logeado");
		}else {
			System.out.println("Algo ha salido mal");
		}
		
	}

}
