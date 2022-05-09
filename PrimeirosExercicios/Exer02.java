package PrimeirosExercicios;

import java.util.Scanner;

public class Exer02 {
// Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Entre com o primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro e último número: ");
		num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
			// num1 é maior. num1 > num2 > num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
			
		} else if (num1 >= num2 && num1 >= num3 && num3 >= num2) {
			// num1 é maior, num2 é menor. num1 > num3 > num2
			System.out.println(num2 + " - " + num3 + " - " + num1);
			
		} else if (num2 >= num1 && num2 >= num3 && num1 >= num3) {
			// num2 é maior, num3 é menor. num2 > num1 > num3
			System.out.println(num3 + " - " + num1 + " - " + num2);
			
		} else if (num2 >= num1 && num2 >= num3 && num3 >= num1) {
			//num2 é maior, num1 é menor. num2 > num3 > num1
			System.out.println(num1 + " - " + num3 + " - " + num2);
			
		} else if (num3 >= num1 && num3 >= num2 && num2 >= num1) {
			// num3 é maior, num1 é menor. num3 > num2 > num1
			System.out.println(num1 + " - " + num2 + " - " + num3);
			
		} else if (num3 >= num1 && num3 >= num2 && num1 >= num2) {
			//num3 é maior, num2 é menor. num3 > num1 > num2
			System.out.println(num2 + " - " + num1 + " - " + num3);
			
		} else {
			System.out.println("Entre com um valor válido.");
		}
		
		scan.close();
	}

}
