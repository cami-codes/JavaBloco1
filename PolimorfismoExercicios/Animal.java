package PolimorfismoExercicios;

public class Animal {
	
	private String nome;
	private int idade;
	
	public void emitirSom() {
		System.out.println("*som*");
	}
	
	public void movimento() {
		System.out.println("locomoção");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
