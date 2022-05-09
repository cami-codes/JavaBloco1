package LacosRepeticao;

import java.util.Scanner;

public class Exercicio1DoWhile {
/* 1- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um número: (Se o número digitado for igual a 0, o programa será encerrado.)");
			num = scan.nextInt();
			soma = soma + num;
			
		} while (num > 0);
		System.out.println("A soma dos valores digitados é de: " + soma);

		scan.close();
	}

}
