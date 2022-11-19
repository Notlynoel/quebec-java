package br.com.notlinoel.model;

import java.io.Serializable;
import java.util.List;

public class Banco implements Serializable {

	private static final long serialVersionUID = -5234239169769706490L;

	// Declaração de variáveis de instância
	private String nome;	
	private List<Conta> contas;

	// Métodos Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
