package LacosRepeticao;

import java.util.Scanner;

public class Exercicio1While {
/* 1- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idade = 0, pessoasMenos21 = 0, pessoasMais50 = 0;

		while (idade <= 99) {
			System.out.println("Digite uma idade de 1 a 99: ");
			idade = scan.nextInt();
			
			if (idade <= 21) {
				pessoasMenos21++;
			} else if (idade > 50 && idade <= 99) {
				pessoasMais50++;
			}
			scan.close();
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + pessoasMenos21);
		System.out.println("Total de pessoas com mais de 50 anos: " + pessoasMais50);
	}

}
