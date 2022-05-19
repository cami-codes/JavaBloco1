package IntroducaoPOO;

public class Caneta {

	public static void main(String[] args) {
		ModeloCaneta caneta1 = new ModeloCaneta("azul", 1.1);
		ModeloCaneta caneta2 = new ModeloCaneta("preta", 0.5);
		
		
		caneta1.setCor("vermelho");
		caneta2.getCor();
		caneta1.estadoAtual();
	}

}
