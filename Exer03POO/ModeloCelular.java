package Exer03POO;

public class ModeloCelular {
	
	// ATRIBUTOS
	String marca;
	String modelo;
	int carga;
	boolean bloqueado;
	boolean conectadoInternet;
	
	// MÉTODO CONSTRUTOR
	public ModeloCelular() {
		this.carga=100;
		this.bloqueado = true;
		
	}
	
	// MÉTODOS
	public void navegar () {
		if(this.bloqueado==true) {
			System.out.println("Desbloqueie o aparelho para utilizá-lo.");
		} else {
			System.out.println("Aparelho desbloqueado!");
		}
		
		if(this.conectadoInternet==false) {
			System.out.println("Erro de rede.");
		} else {
			System.out.println("Navegando...");
		}
		
	}
	
	public void bloqueado() {
		this.bloqueado = true;
	}
	
	public void desbloqueado () {
		this.bloqueado = false;
	}
	
	public void estadoAtual () {
		System.out.println("Marca do celular: " + this.marca);
		System.out.println("Modelo do celular: " + this.modelo);
		System.out.println("O aparelho está bloqueado? " + this.bloqueado);
		System.out.println("O aparelho está conectado a internet? " + this.conectadoInternet);
		System.out.println("A carga está em: " + this.carga + " %");
	}
}
