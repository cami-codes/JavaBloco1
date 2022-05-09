package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2For {
// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, pares = 0, impares = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
			
		}
		System.out.println("Total de pares: " + pares);
		System.out.println("Total de ímpares: " + impares);
		scan.close();
	}
	      
}
