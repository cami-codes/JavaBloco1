package POOExercicios;

public class ModeloPaciente {
	
	// ATRIBUTOS
	String nome;
	int idade;
	String grau;
	String area;
	
	// M�TODOS
	public void atendimento (){
		if (area=="Ortopedista") {
			System.out.println("Ok, você irá passar com um ortopedista.");
		} else if (area == "Neurologista") {
			System.out.println("Ok, você irá passar com um neurologista.");
		} else if (area == "Oftalmologista") {
			System.out.println("Ok, você irá passar com um oftalmologista.");
		}
		
		if (grau== "Vermelho") {
			System.out.println("Estado grave! Você será atendido imediatamente");
		} else if (grau == "Amarelo"){
			System.out.println("Assim que pudermos iremos te atender.");
		} else {
			System.out.println("Existem outras prioridades na sua frente, você terá de aguardar.");
		}
			
	}
	
	public void estadoAtual() {
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Em qual área voc� deseja ser atendido (Ortopedista - Neurologista - Oftalmologista) " + area);
		System.out.println("Qual sua prioridade? (Vermelho - Amarelo - Verde)");
	}
}
