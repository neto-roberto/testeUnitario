package br.com.fornax.domain;

import java.util.Date;

public class Atraso {

	private Long id;
	private Boolean avisado;
	private String motivo;
	private Taxa taxa;
	private Boolean pago;
	private Date dataHora;
	private Pessoa contribuinte;
	private TipoAtraso tipoAtraso;
	private ControlePonto controlePonto;

	public Atraso(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getAvisado() {
		return avisado;
	}

	public void setAvisado(Boolean avisado) {
		this.avisado = avisado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Taxa getTaxa() {
		return taxa;
	}

	public void setTaxa(Taxa taxa) {
		this.taxa = taxa;
	}

	public Boolean getPago() {
		return pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Pessoa getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(Pessoa contribuinte) {
		this.contribuinte = contribuinte;
	}

	public TipoAtraso getTipoAtraso() {
		return tipoAtraso;
	}

	public void setTipoAtraso(TipoAtraso tipoAtraso) {
		this.tipoAtraso = tipoAtraso;
	}
	
	public ControlePonto getControlePonto() {
		return controlePonto;
	}

	public void setControlePonto(ControlePonto controlePonto) {
		this.controlePonto = controlePonto;
	}	
}
