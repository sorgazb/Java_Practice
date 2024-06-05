package tareasFinales.precioAquilerVehiculos;

import java.util.ArrayList;
import java.util.List;

public class RegistroVehiculos {
	private static List <VehiculoAlqui> listaVehiculos=null;

	public RegistroVehiculos() {
		super();
		listaVehiculos=new ArrayList<VehiculoAlqui>();
	}
	
	public boolean registrarVehiculo(VehiculoAlqui v) {
		boolean registrado=false;
		for(VehiculoAlqui vAux:listaVehiculos) {
			if(vAux.getMatricula().equals(v.getMatricula())) {
				registrado=true;
			}
		}
		if(registrado==true) {
			System.out.println("Vehiculo ya registrado.");
		}else {
			listaVehiculos.add(v);
			System.out.println("Vehiculo añadido.");
		}
		return registrado;
	}
	
	public VehiculoAlqui buscarVehiculo(String matricula) {
		VehiculoAlqui buscado=null;
		for(VehiculoAlqui vAux:listaVehiculos) {
			if(vAux.getMatricula().equals(matricula)) {
				buscado=vAux;
			}
		}
		return buscado;
	}
	
	public void mostrarTodosPrecio(int dias) {
		for(VehiculoAlqui vAux:listaVehiculos) {
			System.out.println("-Vehiculo: "+vAux.getMatricula()+" -Precio: "+vAux.precioAlquiler(dias)+"€");
		}
	}
	
	public void obtenerPrecioAlquiler(String matricula, int dias) {
		VehiculoAlqui vAlquilar=buscarVehiculo(matricula);
		double precio=vAlquilar.precioAlquiler(dias);
		System.out.println("El precio por alquilar el Vehiculo con matricula "+vAlquilar.getMatricula()+"\n"
				+"por "+dias+" es "+precio+"€");
		
	}
	
	
}
