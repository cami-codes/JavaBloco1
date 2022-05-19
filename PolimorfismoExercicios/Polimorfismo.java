package PolimorfismoExercicios;

public class Polimorfismo {

	public static void main(String[] args) {
		Cachorro doguinho = new Cachorro();
		Cavalo horsinho = new Cavalo();
		Preguica preguicinha = new Preguica();
		
		System.out.println("CACHORRO: ");
		doguinho.emitirSom();
		
		System.out.println("\nCAVALO: ");
		horsinho.emitirSom();
		
		System.out.println("\nPREGUIÇA: ");
		preguicinha.emitirSom();
	}

}
