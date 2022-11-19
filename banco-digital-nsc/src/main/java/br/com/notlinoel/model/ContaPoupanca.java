package br.com.notlinoel.model;

public class ContaPoupanca extends Conta {

	private static final long serialVersionUID = -8664493905187063819L;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirInfosComuns() {
		System.out.println("\n''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("        EXTRATO CONTA POUPANÇA    ");
		System.out.println("-----------------------------------------");
		System.err.println("        Data: " + data + " às " + hora);
		System.out.println(String.format("	Favorecido: %s", this.cliente.getNome()));
		System.out.println(String.format("	Agência: %d", this.agencia));
		System.out.println(String.format("	Número: %d", this.numero));
		System.out.println(String.format("	Saldo: R$ %.2f", this.saldo));
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("        EXTRATO CONTA POUPANÇA    ");
		super.imprimirInfosComuns();
	}
	
	

}
