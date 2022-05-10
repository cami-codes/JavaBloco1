package VetoresEMatrizes;

import java.util.Scanner;
/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */
public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dado[] = new int [10], x, maior = 0, cont = 0;
		double media = 0.0, soma = 0.0;
		
		for (x = 0; x<10;x++) {
			System.out.println("Informe um valor: ");
			dado[x] = scan.nextInt();
			if (dado[x] > maior) {
				maior = dado[x];
			}
			soma = soma+dado[x];
		}
		System.out.println("Os valores digitados foram: ");
		for (x = 0; x<10;x++) {
			if (dado[x] == maior) {
				cont++;
			}
			System.out.print(dado[x] + "\t");
		}
		media = soma / 10;
		System.out.println("\nA média dos lançamentos é de: " + media);
		System.out.println("A maior pontuação ocorreu: " + cont + " vezes");
		
	}

}
