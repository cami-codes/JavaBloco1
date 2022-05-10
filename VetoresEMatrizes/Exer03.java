package VetoresEMatrizes;

import java.util.Scanner;

public class Exer03 {
/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N1 [][] = {{1,2,3,4,5,6},{6,5,4,3,2,1},{1,2,3,4,5,6},{6,5,4,3,2,1}};
		int N2 [][] = {{1,2,3,4,5,6},{6,5,4,3,2,1},{1,2,3,4,5,6},{6,5,4,3,2,1}};
		int M1[][] = new int [4][6], M2 [][] = new int [4][6];
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}

		
			}
		
	}

