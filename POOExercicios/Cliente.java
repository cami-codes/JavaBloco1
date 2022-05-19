package POOExercicios;

public class Cliente {

	public static void main(String[] args) {
		ModeloCliente cliente1 = new ModeloCliente();
		
		System.out.println("\n========================================================");
		cliente1.nome= "Camila";
		cliente1.item = "bala";
		cliente1.comprar();
		cliente1.estadoAtual();
		cliente1.compra();
		System.out.println("========================================================");

	}

}
