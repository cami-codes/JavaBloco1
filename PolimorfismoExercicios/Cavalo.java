package PolimorfismoExercicios;

public class Cavalo extends Animal {

	
	@Override
	public void movimento() {
		System.out.println("Correndo...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("IRRIII...");
	}
}
