package br.com.notlinoel.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta implements Serializable, ContaService {

	private static final long serialVersionUID = -6610475366551986307L;

	// Declaração de constantes
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;	
	
	// Código para formatar data e hora atual
	Date dataHoraAtual = new Date(); 
	String data = new SimpleDateFormat("dd/MM/yyyy"). format(dataHoraAtual); 
	String hora = new SimpleDateFormat("HH:mm:ss"). format(dataHoraAtual);
	
	// Declaração de variáveis de instância
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	// Construtor padrão
	public Conta() {
		
	}
	
	// Construtor com passagem de parâmetro
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	// Sobrescrevendo os métodos da Interface ContaService
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, ContaService contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	// Métodos Getters
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}

	// Método que vai imprimir as informações da conta
	public void imprimirInfosComuns() {
		System.out.println("-----------------------------------------");
		System.err.println("        Data: " + data + " às " + hora);
		System.out.println(String.format("	Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("	Agência: %d", this.agencia));
		System.out.println(String.format("	Número: %d", this.numero));
		System.out.println(String.format("	Saldo: R$ %.2f", this.saldo));
	}

}
