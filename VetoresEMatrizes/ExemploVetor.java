package VetoresEMatrizes;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int v[]= {1,2,3,4,5};  // vetor com dados
		int v1[]= new int[5]; // vetor vazio
		System.out.println(v[0]);
		v[1] = 8;
		System.out.println(v[1]);
		
		for (int posicao=0;posicao < 5; posicao++) {
			System.out.print(v[posicao]+"\t");
		}
		System.out.println("Digite um numero: ");
		v1[2] = scan.nextInt();
		System.out.println(v1[2]);
		
		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite um numero: ");
			v1[indice] = scan.nextInt();
		}
		for (int indice=0;indice < 5; indice++) {
			System.out.print(v1[indice]+"\t");
		}
		scan.close();
	}

}
