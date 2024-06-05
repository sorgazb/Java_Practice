package unidad11.teoriaU11.gson.tarjetas;

public class TarjetaCredito {
	private String tipo_de_tarjeta;
	private String numero_de_tarjeta;
	private String numero_de_cuenta_asociada;
	private String titular;
	private String fecha_caducidad;
	
	public TarjetaCredito(String tipo_de_tarjeta, String numero_de_tarjeta, String numero_de_cuenta_asociada,
			String titular, String fecha_caducidad) {
		super();
		this.tipo_de_tarjeta = tipo_de_tarjeta;
		this.numero_de_tarjeta = numero_de_tarjeta;
		this.numero_de_cuenta_asociada = numero_de_cuenta_asociada;
		this.titular = titular;
		this.fecha_caducidad = fecha_caducidad;
	}

	
	
	public String getTipo_de_tarjeta() {
		return tipo_de_tarjeta;
	}



	public void setTipo_de_tarjeta(String tipo_de_tarjeta) {
		this.tipo_de_tarjeta = tipo_de_tarjeta;
	}



	public String getNumero_de_tarjeta() {
		return numero_de_tarjeta;
	}



	public void setNumero_de_tarjeta(String numero_de_tarjeta) {
		this.numero_de_tarjeta = numero_de_tarjeta;
	}



	public String getNumero_de_cuenta_asociada() {
		return numero_de_cuenta_asociada;
	}



	public void setNumero_de_cuenta_asociada(String numero_de_cuenta_asociada) {
		this.numero_de_cuenta_asociada = numero_de_cuenta_asociada;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public String getFecha_caducidad() {
		return fecha_caducidad;
	}



	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}



	@Override
	public String toString() {
		return "TarjetaCredito [tipo_de_tarjeta=" + tipo_de_tarjeta + ", numero_de_tarjeta=" + numero_de_tarjeta
				+ ", numero_de_cuenta_asociada=" + numero_de_cuenta_asociada + ", titular=" + titular
				+ ", fecha_caducidad=" + fecha_caducidad + "]";
	}
	
	
}
