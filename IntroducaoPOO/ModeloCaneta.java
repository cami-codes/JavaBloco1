package IntroducaoPOO;

public class ModeloCaneta {

	// CARACTERISTICA -> ATRIBUTOS
	public String cor;
	public double ponta;
	public int carga;
	public boolean tampada;
	
	// MÉTODO CONSTRUTOR
	public ModeloCaneta(String c, double p) {
		this.carga=100;
		this.tampada=true;
		this.ponta=p;
		this.cor=c;
	}
	
	// COMPORTAMENTO -> MÉTODOS (funções)
	public void escrever () {
		if(this.tampada==true)
			System.out.println("Erro! A caneta está tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	public void tapar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void estadoAtual () {
		System.out.println("Cor: " +this.cor);
		System.out.println("Ponta: " +this.ponta);
		System.out.println("Está tampada? " +this.tampada);
		System.out.println("A carga está em: " +this.carga + " %");
	}
	
	
}
