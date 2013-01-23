package br.com.fornax.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Taxa {

	private short id;
	private BigDecimal valor;
	private Date horaVigencia;
	
	public Taxa() {
	
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getHoraVigencia() {
		return horaVigencia;
	}

	public void setHoraVigencia(Date horaVigencia) {
		this.horaVigencia = horaVigencia;
	}
	
}
