package PrimeirosExercicios;

import java.util.Scanner;

public class Exer01 {
// Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		
		System.out.println("Informe o primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = scan.nextInt();
		
		System.out.println("Informe o terceiro e último número: ");
		num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O primeiro número é o maior.");
			
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo número é o maior.");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O terceiro número é o maior.");
		}
		
		scan.close();
	}

}
