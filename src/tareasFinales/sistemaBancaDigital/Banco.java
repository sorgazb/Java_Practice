package tareasFinales.sistemaBancaDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nombre;
	private String localizacion;
	public List<Cliente> listaCliente=null;
	
	public Banco(String nombre, String localizacion) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		listaCliente= new ArrayList<Cliente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	public void registrarCliente(Cliente cliente) {
		boolean aniadido=false;
		if(listaCliente.isEmpty()) {
			listaCliente.add(cliente);
		}else {
			for(Cliente clienteLista:listaCliente) {
				if(!clienteLista.getIdCliente().equals(cliente.getIdCliente())) {
					if(aniadido==false) {
						listaCliente.add(cliente);
						aniadido=true;
						System.out.println("Cliente añadido.");
					}
					
				}
			}

			if(aniadido==false) {
				System.out.println("ERROR. No se pudo añadir al Cliente.");
			}
		}

	}
	
}
