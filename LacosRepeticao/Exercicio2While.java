package LacosRepeticao;

import java.util.Scanner;

public class Exercicio2While {
/* Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
			o número de pessoas calmas;
			o número de mulheres nervosas;
			o número de homens agressivos;
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos;
			o número de pessoas calmas com menos de 18 anos.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pessoas = 0, idade = 0, qtdCalmas = 0, qtdMulheresNervosas = 0, qtdHomensAgressivos = 0,
		qtdOutrosCalmos = 0, qtdNervosos40 = 0, qtdCalmos18 = 0;
		String sexo, personalidade;
		
		while (pessoas <= 150) {
			System.out.println("Informe sua idade: ");
			idade = scan.nextInt();
			
			System.out.println("Informe seu sexo: ('F' - Feminino | 'M' - Masculino | 'O' - Outros)");
			sexo = scan.next();
			
			System.out.println("Informe sua personalidade: ('C' - Calma | 'N' - Nervosa | 'A' - Agressiva)");
			personalidade = scan.next();
			
			if (personalidade.equalsIgnoreCase("C")) {
				qtdCalmas++;
			} if (sexo == "F" && personalidade == "N") {
				qtdMulheresNervosas++;
			} if (sexo == "M" && personalidade == "A") {
				qtdHomensAgressivos++;
			} if(sexo == "O" && personalidade == "C") {
				qtdOutrosCalmos++;
			} if (idade > 40 && personalidade == "N") {
				qtdNervosos40++;
			} if(idade < 18 && personalidade == "C") {
				qtdCalmos18++;
				pessoas = pessoas + 1;
			} 
			pessoas = pessoas + 1;
		}
		
		
		
		System.out.println("Total de pessoas calmas: " + qtdCalmas);
		System.out.println("Total de mulheres nervosas: " + qtdMulheresNervosas);
		System.out.println("Total de homens agressivos: " + qtdHomensAgressivos);
		System.out.println("Total de outros calmos: " + qtdOutrosCalmos);
		System.out.println("Total de pessoas nervosas com mais de 40 anos: " + qtdNervosos40);
		System.out.println("Total de pessoas calmas menores de 18 anos: " + qtdCalmos18);
		scan.close();
	}

}
