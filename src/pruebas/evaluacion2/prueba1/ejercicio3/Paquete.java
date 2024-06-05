package pruebas.evaluacion2.prueba1.ejercicio3;

import java.time.LocalDate;

import pruebas.evaluacion2.prueba1.ejercicio3.constantes.Constantes;


public class Paquete {	
	
	public static final double PRECIO_CACERES=1;
	public static final double PRECIO_CORIA=1.5;
	public static final double PRECIO_PLASENCIA=1.25;
	public static final double PRECIO_MERIDA=2;
	public static final double PRECIO_DON_BENITO=2;
	public static final double PRECIO_BADAJOZ=2.25;
	public static final double PRECIO_ZAFRA=2.5;
	
	private String id;
	private double peso;
	private String fechaEntrega;
	private int localizacion;
	private int empresaReparto;
	private int zona;
	private double costeEnvio;
	
	public Paquete(String id, double peso, String fechaEntrega) {
		this.id = id;
		this.peso = peso;
		this.fechaEntrega = fechaEntrega;
		asignarDestino();
		asignarZona();
		asignarEmpresaReparto();
		asignarCosteEnvio();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	

	public int getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(int localizacion) {
		this.localizacion = localizacion;
	}

	public int getEmpresaReparto() {
		return empresaReparto;
	}

	public void setEmpresaReparto(int empresaReparto) {
		this.empresaReparto = empresaReparto;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public double getCosteEnvio() {
		return costeEnvio;
	}

	public void setCosteEnvio(double costeEnvio) {
		this.costeEnvio = costeEnvio;
	}

	public void asignarEmpresaReparto() {
		if(peso > 1) {
			empresaReparto=Constantes.NAVALEXPRESS;
		}else if(peso >=1 && peso <= 2) {
			empresaReparto=Constantes.NAVALSEAR;
		}else {
			empresaReparto=Constantes.NAVALMAZON;
		}
	}
	
	public void asignarZona() {
		if(zona== Constantes.NAVALMORAL_DE_LA_MATA) {
			localizacion=Constantes.LOCAL;
		}else {
			localizacion=Constantes.EXTERNO;
		}
	}
	
	public void asignarCosteEnvio() {
		if(localizacion==Constantes.LOCAL) {
			if(peso<=2) {
				costeEnvio=peso*0.2;
			}else {
				costeEnvio=peso*0.4;
			}
		}else {
			if(peso<=2) {
				costeEnvio=peso*0.2;
			}else {
				costeEnvio=peso*0.4;
			}
			
			if(zona==Constantes.CACERES) {
				costeEnvio=costeEnvio+PRECIO_CACERES;
			}else if(zona==Constantes.CORIA) {
				costeEnvio=costeEnvio+PRECIO_CORIA;
			}else if(zona==Constantes.PLASENCIA) {
				costeEnvio=costeEnvio+PRECIO_PLASENCIA;
			}else if(zona==Constantes.MERIDA) {
				costeEnvio=costeEnvio+PRECIO_MERIDA;
			}else if(zona==Constantes.DON_BENITO) {
				costeEnvio=costeEnvio+PRECIO_DON_BENITO;
			}else if(zona==Constantes.BADAJOZ) {
				costeEnvio=costeEnvio+PRECIO_BADAJOZ;
			}else if(zona==Constantes.ZAFRA) {
				costeEnvio=costeEnvio+PRECIO_ZAFRA;
			}
		}
	}
	
	public void asignarDestino() {
		if(id.contains("NAVALMORAL DE LA MATA")) {
			zona=Constantes.NAVALMORAL_DE_LA_MATA;
		}else if(id.contains("CACERES")) {
			zona=Constantes.CACERES;
		}else if(id.contains("CORIA")) {
			zona=Constantes.CORIA;
		}else if(id.contains("PLASENCIA")) {
			zona=Constantes.PLASENCIA;
		}else if(id.contains("MERIDA")) {
			zona=Constantes.MERIDA;
		}else if(id.contains("BADAJOZ")) {
			zona=Constantes.BADAJOZ;
		}else if(id.contains("DON BENITO")) {
			zona=Constantes.DON_BENITO;
		}else if(id.contains("ZAFRA")) {
			zona=Constantes.ZAFRA;
		}
	}
	
	@Override
	public String toString() {
		return "Paquete [id=" + id + ", peso=" + peso + ", fechaEntrega=" + fechaEntrega + ", localizacion="
				+ localizacion + ", empresaReparto=" + empresaReparto + ", zona=" + zona + ", costeEnvio=" + costeEnvio
				+ "]";
	}
	
	
}
