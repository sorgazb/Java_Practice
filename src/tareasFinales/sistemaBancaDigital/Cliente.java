package tareasFinales.sistemaBancaDigital;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String idCliente;
	private String nombre;
	private String email;
	public List<Cuenta> listaCuentas=null;
	
	public Cliente(String idCliente, String nombre, String email) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.email = email;
		listaCuentas= new ArrayList<Cuenta>();
	}
	
	public boolean login(String email, String nombre) {
		boolean loginCorrecto=false;
		if(this.email.equals(email) && this.nombre.equals(nombre)) {
			loginCorrecto=true;
		}
		return loginCorrecto;
	}
	
	public Cuenta abrirCuenta(String idCuenta) {
		Cuenta cuenta=new Cuenta(idCuenta, 0);
		boolean aniadido=false;
		if(listaCuentas.isEmpty()) {
			listaCuentas.add(cuenta);
		}else {
			for(Cuenta cuentas:listaCuentas) {
				if(!cuentas.getIdCuenta().equals(cuenta.getIdCuenta())) {
					if(aniadido==false) {
						listaCuentas.add(cuenta);
						aniadido=true;
					}
				}else {
					cuenta=null;
				}
			}
		}

		return cuenta;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
