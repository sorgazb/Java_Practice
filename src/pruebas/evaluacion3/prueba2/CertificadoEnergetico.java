package pruebas.evaluacion3.prueba2;

public class CertificadoEnergetico {
	
	private String id;
	private String propietario;
	private String direccion;
	private String tipoPropiedad;
	private String clasificacion;
	private String fechaExpedicion;
	private String empresaCertificadora;
	private String codigoTecnico;
	
	public CertificadoEnergetico(String id, String propietario, String direccion, String tipoPropiedad,
			String clasificacion, String fechaExpedicion, String empresaCertificadora, String codigoTecnico) {
		super();
		this.id = id;
		this.propietario = propietario;
		this.direccion = direccion;
		this.tipoPropiedad = tipoPropiedad;
		this.clasificacion = clasificacion;
		this.fechaExpedicion = fechaExpedicion;
		this.empresaCertificadora = empresaCertificadora;
		this.codigoTecnico = codigoTecnico;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTipoPropiedad() {
		return tipoPropiedad;
	}
	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String getFechaExpedicion() {
		return fechaExpedicion;
	}
	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	public String getEmpresaCertificadora() {
		return empresaCertificadora;
	}
	public void setEmpresaCertificadora(String empresaCertificadora) {
		this.empresaCertificadora = empresaCertificadora;
	}
	public String getCodigoTecnico() {
		return codigoTecnico;
	}
	public void setCodigoTecnico(String codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}

	@Override
	public String toString() {
		return "CertificadoEnergetico [id=" + id + ", propietario=" + propietario + ", direccion=" + direccion
				+ ", tipoPropiedad=" + tipoPropiedad + ", clasificacion=" + clasificacion + ", fechaExpedicion="
				+ fechaExpedicion + ", empresaCertificadora=" + empresaCertificadora + ", codigoTecnico="
				+ codigoTecnico + "]";
	}
	
}
