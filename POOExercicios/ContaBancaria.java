package POOExercicios;

public class ContaBancaria {

	public static void main(String[] args) {
		
		ModeloContaBancaria conta1 = new ModeloContaBancaria();
		
		System.out.println("\n========================================================");
		conta1.nomeTitular = "Camila de Matos Rocha Martins";
		conta1.numConta = 9584985;
		conta1.saldo = 1500;
		conta1.sacarSaldo();
		conta1.estadoAtual();
		conta1.sacar();
		System.out.println("========================================================");

	}

}
