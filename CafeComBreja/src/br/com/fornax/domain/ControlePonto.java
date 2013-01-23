package br.com.fornax.domain;

import java.sql.Timestamp;
import java.util.Date;

public class ControlePonto {

	private Long id;
	private Timestamp entrada;
	private Timestamp saida;
	private Pessoa pessoa; 
	private Date data;
	
	public ControlePonto() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getEntrada() {
		return entrada;
	}

	public void setEntrada(Timestamp entrada) {
		this.entrada = entrada;
	}

	public Timestamp getSaida() {
		return saida;
	}

	public void setSaida(Timestamp saida) {
		this.saida = saida;
	}

	public Pessoa getContribuinte() {
		return pessoa;
	}

	public void setContribuinte(Pessoa contribuinte) {
		this.pessoa = contribuinte;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
