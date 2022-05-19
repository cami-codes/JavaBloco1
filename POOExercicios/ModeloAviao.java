package POOExercicios;

public class ModeloAviao {

	// ATRIBUTOS
	int totalPassageiros;
	int combustivel;
	String companhia;
	
	// M�TODO CONSTRUTOR
	public ModeloAviao() {
		this.combustivel = 100;	
	}
	
	// M�TODOS
	public void voar() {
		if (this.combustivel > 50) {
			System.out.println("Metade do combustível usado.");
		} else if (this.combustivel < 50 && this.combustivel >= 20){
			System.out.println("Combustivel acabando...");
		} else {
			System.out.println("MAYDAY MAYDAY");
		}
		
	}
	
	public void estadoAtual() {
		System.out.println("Qual a companhia áerea? " + companhia);
		System.out.println("Qual o total de passageiros? " + totalPassageiros);
		System.out.println("Combustível: " + combustivel + " % cheio");
	}
}
