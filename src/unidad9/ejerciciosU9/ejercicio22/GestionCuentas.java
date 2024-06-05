package unidad9.ejerciciosU9.ejercicio22;

import java.util.ArrayList;
import java.util.List;

public class GestionCuentas {
	
	public static void main(String[] args) {
		List <CuentaBancaria> listaCuentas= new ArrayList<CuentaBancaria>();
		
		CuentaBancaria cuenta1= new CuentaAhorro("ES-4976", 15);
		CuentaBancaria cuenta2= new CuentaCorriente("ES-4999", 1000);
		CuentaBancaria cuenta3= new CuentaAhorro("ES-4976", 15000);

		listaCuentas.add(cuenta1);
		listaCuentas.add(cuenta2);
		listaCuentas.add(cuenta3);
		

		cuenta1.consultarDatos();
		cuenta2.ingresarDinero(188);
		cuenta3.traspaso(cuenta1, 1000);
		cuenta1.retirarDinero(1000);
		
		for(CuentaBancaria cuentaBancaria: listaCuentas) {
			cuentaBancaria.consultarDatos();
		}
	}
}
