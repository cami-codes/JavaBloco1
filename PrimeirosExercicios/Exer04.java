package PrimeirosExercicios;

import java.util.Scanner;

public class Exer04 {
/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double num, raizQuadrada, quadrado;
		
		System.out.println("Informe um número: ");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			raizQuadrada = Math.sqrt(num);
			System.out.println("Número par. A raiz quadrada desse número é: " + raizQuadrada);
		} else {
			quadrado = Math.pow(num, 2);
			System.out.println("Número impar. " + num + " elevado ao quadrado é: " + quadrado);
		}

		scan.close();
	}

}
