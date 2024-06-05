package pruebas.evaluacion3.pruebaFinal;

public class Reserva {
	private int numeroCita;
	private String documento;
	private String fecha;
	private int hora;
	private String estadoPago;
	private String tramite;
	private String telefono;
	private String email;
	
	
	public Reserva(int numeroCita, String documento, String fecha, int hora, String estadoPago, String tramite,
			String telefono, String email) {
		super();
		this.numeroCita = numeroCita;
		this.documento = documento;
		this.fecha = fecha;
		this.hora = hora;
		this.estadoPago = estadoPago;
		this.tramite = tramite;
		this.telefono = telefono;
		this.email = email;
	}


	public int getNumeroCita() {
		return numeroCita;
	}


	public void setNumeroCita(int numeroCita) {
		this.numeroCita = numeroCita;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public String getEstadoPago() {
		return estadoPago;
	}


	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}


	public String getTramite() {
		return tramite;
	}


	public void setTramite(String tramite) {
		this.tramite = tramite;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Reserva [numeroCita=" + numeroCita + ", documento=" + documento + ", fecha=" + fecha + ", hora=" + hora
				+ ", estadoPago=" + estadoPago + ", tramite=" + tramite + ", telefono=" + telefono + ", email=" + email
				+ "]";
	}
	
}
