package HerançaExercicios;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		System.out.println("Cachorro:");
		cachorro.nome = "doguinho";
		cachorro.idade = 100;
		cachorro.som();
		cachorro.correr();
		
		System.out.println("\nCavalo:");
		cavalo.nome = "cavalinho";
		cavalo.idade = 100;
		cavalo.som();
		cavalo.correr();
		
		System.out.println("\nPregui�a:");
		preguica.nome = "preguicinha";
		preguica.idade = 100;
		preguica.som();
		preguica.escalar();
	}

}
