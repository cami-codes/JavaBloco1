package IntroducaoPOO;

public class ModeloCaneta {

	// CARACTERISTICA -> ATRIBUTOS
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	
	// M�TODO CONSTRUTOR
	public ModeloCaneta(String c, double p) {
		this.carga=100;
		this.tampada=true;
		this.ponta=p;
		this.cor=c;
	}
	
	// COMPORTAMENTO -> M�TODOS (fun��es)
	public void escrever () {
		if(this.tampada==true)
			System.out.println("Erro! A caneta está tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	
	
	// M�TODOS ASSESSORES (gets) e MODIFICADORES (sets)
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
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
