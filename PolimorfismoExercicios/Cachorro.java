package PolimorfismoExercicios;

public class Cachorro extends Animal {
		
	
	@Override
	public void movimento() {
		System.out.println("Correndo...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au...");
	}
}
