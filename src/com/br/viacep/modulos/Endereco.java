package com.br.viacep.modulos;

public class Endereco {
	public String logradouro;
	public String bairro; 
	public String localidade;
	
	
	public Endereco(String logradouro, String bairro, String localidade) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
	}

	public String getLogradouro() {
		return logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getLocalidade() {
		return localidade;
	}
	
	
	
	
}
