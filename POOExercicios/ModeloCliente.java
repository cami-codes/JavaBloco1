package POOExercicios;

public class ModeloCliente {
		// ATRIBUTOS
	
	String nome;
	String item;
	boolean comprar;
	
	
	   // M�TODO
	
	public void compra() {
		if (comprar == true) {
			System.out.println("Sua " + item + " custa R$ 20000000 ");
			System.out.println("Obrigada pela compra! Volte sempre");
		} else {
			System.out.println("E se eu fizer um descontinho...?");
		}
	}
	
	public void comprar() {
		this.comprar = true;
	}
	
	public void naoComprar() {
		this.comprar = false;
	}
	
	public void estadoAtual() {
		System.out.println("Qual seu nome? " + this.nome);
		System.out.println("Olá " + this.nome + "! O que você deseja comprar? " + this.item);
		System.out.println("Você deseja finalizar a compra? " + this.comprar);
	}
}
