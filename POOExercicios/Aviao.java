package POOExercicios;

public class Aviao {

	public static void main(String[] args) {
		ModeloAviao aviao1 = new ModeloAviao();
		
		aviao1.companhia = ("Gol");
		aviao1.totalPassageiros = 100;
		aviao1.combustivel = 15;
		aviao1.estadoAtual();
		aviao1.voar();
		

	}

}
