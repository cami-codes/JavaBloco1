package Exceptions;

import java.util.Scanner;

public class Exemplo1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2;
		try {
		System.out.println("Digite os n�meros para divis�o: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		System.out.println("\nA divis�o �: " +n1/n2);
		} catch(Exception erro) {
			System.out.println("Valor inv�lido" +erro);
		}
		System.out.println("\nFim do programa");
	}
}
