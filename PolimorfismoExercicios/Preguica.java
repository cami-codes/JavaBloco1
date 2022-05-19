package PolimorfismoExercicios;

public class Preguica extends Animal {

	@Override
	public void movimento() {
		System.out.println("Subindo em uma árvore...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("zzZZzz");
	}
}
