package Collections;

import java.util.*;
public class Exemplo1 {

	public static void main(String[] args) {
		String aula1 = "Bloco 1";
		String aula2 = "Bloco 2";		
		String aula3 = "Bloco 3";
		
		ArrayList<String> aulas = new ArrayList<>();	
		
		aulas.add(aula2);
		aulas.add(aula1);
		aulas.add(aula3);
		aulas.add("Aula 0");
		aulas.add("como fazer");
		
		aulas.remove(4);
		
		System.out.println("Mostra o conteudo do indice 2");
		System.out.println(aulas.get(2));
		
		System.out.println("\nConteudo do array");
		System.out.println(aulas);
		
		System.out.println(aulas.contains("Bloco 1"));
		
		System.out.println("\nMostra o tamanho da lista");
		System.out.println(aulas.size());
		
		System.out.println("\nLista organizada");
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
