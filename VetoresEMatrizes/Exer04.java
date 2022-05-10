package VetoresEMatrizes;

import java.util.Scanner;

public class Exer04 {
/* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m[][]= new int [3][3];
		int soma = 0, diagonal = 0;
		
		for (int linha=0;linha<3;linha++) {
			for (int coluna=0;coluna<3;coluna++) {
				System.out.println("Informe os valores: ");
				m[linha][coluna] = scan.nextInt();
				soma = soma + m[linha][coluna];
				diagonal = m[0][0] + m[1][1] + m[2][2];
			}
		}
			System.out.println("A soma total dos valores é: " + soma + " e a soma da diagonal é: " + diagonal);
			scan.close();
	}

}
