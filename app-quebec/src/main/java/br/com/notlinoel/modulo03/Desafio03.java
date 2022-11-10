package br.com.notlinoel.modulo03;

import java.io.IOException;
import java.util.Scanner;

/*

 Desafio
 Faça um programa que leia um valor T e preencha um vetor N[1000] com a 
 sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. 
 Imprima o vetor N.

 ENTRADA
 A entrada contém um valor inteiro T (2 <= T <= 50).

 SAÍDA
 Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor 
 e x é o valor armazenado naquela posição
*/

public class Desafio03 {
	public static void main(String[] args) throws IOException {
		
		// Criando uma variável to tipo Scanner
		Scanner leitor = new Scanner(System.in);
		
		int t = leitor.nextInt();
		int[] N = new int[1000];
		
		int cont = 0;
		while (cont < 999) {
			for (int j = 0; j < t; j++) {
				if (cont > 999)
					break;
				N[cont] = j;
				cont++;
			}
		}

		for (int i = 0; i < N.length; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}

		leitor.close();
	}

}
