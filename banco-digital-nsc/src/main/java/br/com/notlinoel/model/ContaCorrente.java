package br.com.notlinoel.model;


public class ContaCorrente extends Conta {
	
	private static final long serialVersionUID = 8227843540175703622L;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("        EXTRATO CONTA CORRENTE    ");
		super.imprimirInfosComuns();
	}
	

}
