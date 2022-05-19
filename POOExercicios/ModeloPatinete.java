package POOExercicios;

public class ModeloPatinete {
	
	// ATRIBUTOS
	String cor;
	boolean protecao;
	boolean motorizado;
	boolean preparado;
	
	// M�TODOS
	public void pilotar() {
		if (this.protecao==false) {
			System.out.println("É recomendável o uso de proteção");
		} else {
			System.out.println("Que bom que você está protegido!");
		}
		if (this.motorizado==true) {
			System.out.println("Que rápido!!");
		} else {
			System.out.println("Que pena... Seu patinete não é motorizado.");
		}
		if (this.preparado == true) {
			System.out.println("Uhul! Vamos lá!");
		} else {
			System.out.println("No seu tempo.");
		}	
	}
	
	public void protegido() {
		this.protecao = true;
	}
	
	public void desprotegido() {
		this.protecao = false;
	}
	
	public void motorizado() {
		this.motorizado = true;
	}
	
	public void naoMotorizado() {
		this.motorizado = false;
	}
	
	public void toPreparado() {
		this.preparado = true;
	}
	
	public void naoPreparado() {
		this.preparado = false;
	}
	
	public void estadoAtual () {
		System.out.println("Cor do patinete: " +this.cor);
		System.out.println("Está usando proteção? " +this.protecao);
		System.out.println("Seu patinete é motorizado? " +this.motorizado);
		System.out.println("Está preparado?! " +this.preparado);
	}
}
