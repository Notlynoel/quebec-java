package br.com.notlinoel.modulo03;

/*
	Desafio
	O objetivo deste desafio é resolvê-lo utilizando 
	o seu conhecimento sobre Arrays, uma estrutura 
	de dados que armazena uma coleção de dados em 
	um bloco de memória. Dado uma array de 
	valores {2, 3, 5, 7, 11, 13, 18, 34}, desenvolva 
	um programa que retorne como resultado 
	apenas os números pares dessa array.

	Entrada
	A entrada consiste em um array de números inteiros positivos.

	Saída
	A saída do desafio equivale aos números pares do Array, 
	como mostra o exemplo a baixo:

	Exemplo 1:
	
	Entrada								Saída

 	2, 3, 5, 7, 11, 13, 18, 34    		2, 18, 34
 */
public class Desafio01 {
	public static void main(String[] args) {

		// TODO: Crie um Array de números inteiros:
		int[] valores = { 2, 3, 5, 7, 11, 13, 18, 34 };

		// TODO: Implemente um laço de repetição que verifique APENAS seus números
		// Pares:
		for (int valor : valores) {
			if (valor % 2 == 0) {
				System.out.println(valor);
			}
		}

	}

}
