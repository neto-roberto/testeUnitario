package br.com.fornax.domain;

public class TipoAtraso {
	
	private short id;
	private String descricao;
	private short fatorAgravo;
	
	public TipoAtraso() {
		this.fatorAgravo = 1;
	}
	
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public short getFatorAgravo() {
		return fatorAgravo;
	}
	public void setFatorAgravo(short fatorAgravo) {
		this.fatorAgravo = fatorAgravo;
	}
	
}
