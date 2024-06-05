package unidad8.tareasU8.tarea2;

import java.util.Scanner;

public class CuentaCorriente implements I_Responsable{
	
	static Scanner entrada = new Scanner(System.in);
	public static final double MINBALANCE=100;
	private String nombre;
	protected double cantidad;
	
	public CuentaCorriente() {
		setNombre();
		setCantidad();
	}
	

	@Override
	public String toString() {
		
		return "-Nombre Cuenta: " + this.nombre + "\n" + "-Monto actual: " + this.cantidad + "€";
	}

	@Override
	public boolean isValidDeposit(double cantidad) {
		boolean is_Valid = false;
		if (cantidad < 0) {
			is_Valid = true;
		}
		return is_Valid;
	}

	@Override
	public void deposit(double cantidad) {
		if(isValidDeposit(cantidad)==true) {
			this.cantidad = getCantidad() + cantidad;
		}else {
			System.out.println("No se puede retirar");
		}
		
	}

	@Override
	public boolean isValidWithdrawal(double retiro) {
		boolean is_Valid = false;
		if (retiro > 0) {
			if (getCantidad() > retiro) {
				if(getCantidad()-retiro > MINBALANCE) {
					is_Valid = true;
				}
			}
		}
		return is_Valid;
	}

	@Override
	public void withdraw(double cantidad) {
		if (isValidWithdrawal(cantidad) == true) {
			this.cantidad = getCantidad() - cantidad;
		} else {
			System.out.println("No se puede retirar.");
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre() {
		String validarNombre = "[A-Z][a-z]*";
		boolean fin = false;
		while (!fin) {
			System.out.println("Introduce un nombre: ");
			String nombre = entrada.next();
			boolean datoCorrecto = nombre.matches(validarNombre);
			if (datoCorrecto == true) {
				this.nombre = nombre;
				fin = true;
			} else {
				System.err.println("Error con el formato del nombre.");
			}
		}
	}

	public double getCantidad() {
		return cantidad;
	}

	private void setCantidad() {
		boolean fin = false;
		while (!fin) {
			System.out.println("Introduce la cantidad incial de la cuenta: ");
			double cantidad = entrada.nextDouble();
			if (cantidad > 0) {
				this.cantidad = cantidad;
				fin = true;
			} else {
				System.err.println("Cantidad no validad < 0€");
			}
		}
	
	}
}
