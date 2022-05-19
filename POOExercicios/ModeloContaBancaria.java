package POOExercicios;

public class ModeloContaBancaria {

	
	// ATRIBUTOS
	String nomeTitular;
	int numConta;
	double saldo;
	boolean sacarSaldo;
	
	// M�TODOS
	public void sacar () {
		if(sacarSaldo == true) {
			System.out.println("Imprimindo notas...");
		} else {
			System.out.println("Retornando ao menu.");
		}
	}
	
	public void sacarSaldo() {
		this.sacarSaldo = true;
		
	}
	
	public void naoSacar() {
		this.sacarSaldo = false;
	}
	
	public void estadoAtual() {
		System.out.println("Nome completo do titular: " + nomeTitular);
		System.out.println("Informe o número sua conta: " + numConta);
		System.out.println("Seu saldo é de: " + saldo);
		System.out.println("Deseja realizar o saque? " + sacarSaldo);
		
	}
}
