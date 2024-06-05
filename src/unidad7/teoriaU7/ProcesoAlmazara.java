package unidad7.teoriaU7;
import java.text.DecimalFormat;


public class ProcesoAlmazara {
	
	//Atributos de la clase:
	private double pesoAceituna;
	private double pesoLimpio;
	private double pesoMolturado;
	private double aceiteExtraido;
	private double aceiteFiltrado;
	private ClienteAlmazara cliente;
	
	//Constructor de la clase:
	public ProcesoAlmazara() {
		
		pesoAceituna=SimuladorAlmazara.generarCantidadAleatoria
				(CantidadesAlmazara.CANTIDAD_MIN_ACEITUNAS, CantidadesAlmazara.CANTIDAD_MAX_ACEITUNAS);
		
		double porcentajeLimpieza= SimuladorAlmazara.aplicarPorcentaje
				(CantidadesAlmazara.CANTIDAD_MIN_LIMPIEZA, CantidadesAlmazara.CANTIDAD_MAX_LIMPIEZA);
		pesoLimpio=SimuladorAlmazara.aplicarPorcentaje(pesoAceituna, porcentajeLimpieza);
		
		double porcentajeMolturacion=SimuladorAlmazara.generarPorcentajeAleatorio
				(CantidadesAlmazara.CANTIDAD_MIN_MOLTURACION, CantidadesAlmazara.CANTIDAD_MAX_MOLTURACION);
		pesoMolturado=SimuladorAlmazara.aplicarPorcentaje(pesoLimpio, porcentajeMolturacion);
		
		double porcentajeExtraccion=SimuladorAlmazara.generarPorcentajeAleatorio
				(CantidadesAlmazara.CANTIDAD_MIN_EXTRACCION, CantidadesAlmazara.CANTIDAD_MAX_EXTRACCION);
		aceiteExtraido=SimuladorAlmazara.aplicarPorcentaje(pesoMolturado, porcentajeExtraccion);
		
		double porcentajeFiltrado= SimuladorAlmazara.generarPorcentajeAleatorio
				(CantidadesAlmazara.CANTIDAD_MIN_FILTRADO, CantidadesAlmazara.CANTIDAD_MAX_FILTRADO);
		aceiteFiltrado=SimuladorAlmazara.aplicarPorcentaje(aceiteExtraido, porcentajeFiltrado);
		
		
		
	}

	//Métodos Getters && Setters:
	public double getPesoAceituna() {
		return pesoAceituna;
	}

	public void setPesoAceituna(double pesoAceituna) {
		this.pesoAceituna = pesoAceituna;
	}

	public double getPesoLimpio() {
		return pesoLimpio;
	}

	public void setPesoLimpio(double pesoLimpio) {
		this.pesoLimpio = pesoLimpio;
	}

	public double getPesoMolturado() {
		return pesoMolturado;
	}

	public void setPesoMolturado(double pesoMorturado) {
		this.pesoMolturado = pesoMorturado;
	}

	public double getAceiteExtraido() {
		return aceiteExtraido;
	}

	public void setAceiteExtraido(double aceiteExtraido) {
		this.aceiteExtraido = aceiteExtraido;
	}

	public double getAceiteFiltrado() {
		return aceiteFiltrado;
	}

	public void setAceiteFiltrado(double aceiteFiltrado) {
		this.aceiteFiltrado = aceiteFiltrado;
	}
	
	
	//Métodos de la clase:
	public void mostrarDatos() {
        DecimalFormat formato = new DecimalFormat("0.00");//Formato para mostrar valores con dos cifras decimales.
        System.out.println("--RESULTADOS SIMULACIÓN--");
        System.out.println("Peso inicial de aceitunas: " +   formato.format(pesoAceituna)  + " kg");
        System.out.println("Peso después de la limpieza: " + formato.format(pesoLimpio) + " kg");
        System.out.println("Peso después de la molturación: " + formato.format(pesoMolturado) + " kg");
        System.out.println("Aceite extraído: " + formato.format(aceiteExtraido) + " litros");
        System.out.println("Aceite después de la filtración: " + formato.format(aceiteFiltrado) + " litros");
        if(cliente!=null) {
        	cliente.mostrarDatos();
        }
	}

	public ClienteAlmazara getCliente() {
		return cliente;
	}

	public void setCliente(ClienteAlmazara cliente) {
		this.cliente = cliente;
	}

}
