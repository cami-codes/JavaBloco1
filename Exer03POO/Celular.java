package Exer03POO;

public class Celular {

	public static void main(String[] args) {
		ModeloCelular meuPocket = new ModeloCelular();
		
		System.out.println("\n--------------------------------------------");
		
		meuPocket.marca = "Nokia";
		meuPocket.modelo = "Tijolão";
		meuPocket.carga = 88;
		meuPocket.desbloqueado();
		meuPocket.conectadoInternet = true;
		meuPocket.estadoAtual();
		meuPocket.navegar();
		
		System.out.println("--------------------------------------------");

	}

}
