package br.com.notlinoel.views;

import br.com.notlinoel.model.Cliente;
import br.com.notlinoel.model.Conta;
import br.com.notlinoel.model.ContaCorrente;
import br.com.notlinoel.model.ContaPoupanca;

public class TestarBanco {
	public static void main(String[] args) {
		// Instanciando a classe Cliente e criando um objeto cliente1		
		Cliente cliente1 = new Cliente();
		// Inserindo o nome do cliente
		cliente1.setNome("Fulano da Silva Sicrano");
		
		// Instanciando a classe Cliente e criando um objeto cliente2
		Cliente cliente2 = new Cliente();
		// Inserindo o nome do cliente
		cliente2.setNome("Maria Beltrano Sicrano");
		
		// Instanciando a classe 
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente2);

		// Depositando R$ 100 na conta do cliente1
		cc.depositar(150);
		// Verificando o saldo após o depósito
		cc.imprimirExtrato();
		
		// Faz uma transferência para uma conta poupança
		cc.transferir(100, poupanca);
		
		// Imprimir o saldo da conta corrente após a transferência
		cc.imprimirExtrato();
		poupanca.imprimirInfosComuns();
	}

}
