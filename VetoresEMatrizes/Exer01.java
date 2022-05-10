package VetoresEMatrizes;

import java.util.Scanner;

public class Exer01 {
/* 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, maior = 0;
		
		int vetor[] = new int [5];
		
		for (x = 0; x < 5; x++) {
			System.out.println("Digite um valor: ");
			vetor[x] = scan.nextInt();
			if (vetor[x] > maior) {
				maior = vetor[x];
			}
			
		}
		System.out.println("A maior pontuação foi de: " + maior);
		scan.close();
		
	}

}
