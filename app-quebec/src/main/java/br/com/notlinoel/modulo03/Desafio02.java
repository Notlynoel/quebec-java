package br.com.notlinoel.modulo03;

import java.io.IOException;
import java.util.Scanner;

/*
 Desafio
 Neste problema, deve-se ler:

 O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1. 
 O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
 Após, calcule e mostre o valor a ser pago.

 Entrada
 O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, 
 respectivamente dois inteiros e um valor com 2 casas decimais.

 Saída
 A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de 
 deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser 
 apresentado com 2 casas após o ponto.

 Exemplo 1:

 Exemplos de Entrada	Exemplos de Saída
 12 1 5.30
 16 2 5.10

 VALOR A PAGAR: R$ 15.50

 Exemplo 2:

 Exemplos de Entrada	Exemplos de Saída
 13 2 15.30
 161 4 5.20

 VALOR A PAGAR: R$ 51.40

 Exemplo 3:

 Exemplos de Entrada	Exemplos de Saída
 1 1 15.10
 2 1 15.10
 */
public class Desafio02 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		// int codPeca1 = leitor.nextInt();
		int qtdPeca1 = leitor.nextInt();
		double valorPeca1 = leitor.nextDouble();
		
		// int codPeca2 = leitor.nextInt();
		int qtdPeca2 = leitor.nextInt();
		double valorPeca2 = leitor.nextDouble();

		/*
		Implemente um Cálculo Simples.
		Levando em consideração a sua precedência 
		de operadores e a definição de suas casas decimais:
		*/

		double total = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
		
		leitor.close();
		
		
	}

}
