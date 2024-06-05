package unidad8.tareasU8.tarea1;

import java.util.Scanner;

public abstract class Cuenta {
	
	static Scanner entrada= new Scanner(System.in);
	
	//Atributos de la clase Cuenta:
	private String nombre;
	protected double cantidad;
	
	//Método constructor de la clase Cuenta:
	public Cuenta(String nombre, double cantidad) {
		this.nombre=nombre;
		this.cantidad=cantidad;
	}
	
	public Cuenta() {
		setNombre();
		setCantidad();;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre() {
		String validarNombre="[A-Z][a-z]*";
		boolean fin=false;
		while(!fin) {
			System.out.println("Introduce un nombre: ");
			String nombre= entrada.next();
			boolean datoCorrecto= nombre.matches(validarNombre);
			if(datoCorrecto==true) {
				this.nombre=nombre;
				fin=true;
			}else {
				System.err.println("Error con el formato del nombre.");
			}
		}
	}



	public double getCantidad() {
		return cantidad;
	}



	private void setCantidad() {
		boolean fin=false;
		while(!fin) {
			System.out.println("Introduce la cantidad incial de la cuenta: ");
			double cantidad=entrada.nextDouble();
			if(cantidad>0) {
				this.cantidad=cantidad;
				fin=true;
			}else {
				System.err.println("Cantidad no validad < 0€");
			}
		}		
	}
	
	public abstract void retirada(double cantidad);

	
	public void depositar(double cantidad) {
		this.cantidad= getCantidad()+cantidad;
	}



	@Override
	public String toString() {
		return "-Nombre Cuenta: "+this.nombre+"\n"+
		"-Monto actual: "+this.cantidad+"€";
	}
}
