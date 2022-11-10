package br.com.notlinoel.modulo03;

import java.util.Scanner;

/*
 Desafio 1
 Dado um inteiro x, retorne o número de etapas para reduzi-lo a zero.
 Em uma etapa, se o número atual for par, você deve dividi-lo por 2, caso contrário, você deve
 subtrair 1 dele.
*/
public class Desafio04 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        // Implemente uma condição onde seja possível reduzir o número até 0:

        while (num > 0) {
            if ((num & 1) == 1) {
                step++;
            }
            num /= 2;
            step++;
        }

	if(step >  num){
	    System.out.println(step - 1);
	}else{
	    System.out.println(step);
	}
    }

}
