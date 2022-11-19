package br.com.notlinoel.model;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 657217184377819932L;

	// Declaração de variável de instância
	private String nome;

	// Métodos Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
