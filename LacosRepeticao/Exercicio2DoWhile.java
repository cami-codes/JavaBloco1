package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2DoWhile {
/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, cont = 0, soma = 0;
		
		do {
			System.out.println("Informe números inteiros. Para sair do programa digite 0.");
			num = scan.nextInt();
			
			if (num % 3 == 0) {
				soma = soma + num;
				cont++;
			}
			
		} while (num != 0);
		System.out.println("A média dos valores multiplos de 3 digitados é de: " + soma / cont);
		
		scan.close();
	}

}
