package IntroducaoPOO;

public class Caneta {

	public static void main(String[] args) {
		ModeloCaneta caneta1 = new ModeloCaneta("azul", 1.1);
		ModeloCaneta caneta2 = new ModeloCaneta("preta", 0.5);
		
		System.out.println("Caneta 2");
		caneta2.carga=50;
		caneta2.cor="Preta";
		caneta2.ponta=0.5;
		caneta2.destampar();
		caneta2.estadoAtual();
		caneta2.escrever();
			
		
		System.out.println("\nCaneta 1");
		caneta1.cor="vermelha";
		caneta1.ponta=1.1;
		caneta1.carga=99;
		caneta1.tapar();
		caneta1.destampar();	
		caneta1.escrever();
		caneta1.estadoAtual();

	}

}
