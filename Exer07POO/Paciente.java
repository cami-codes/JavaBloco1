package Exer07POO;

public class Paciente {

	public static void main(String[] args) {
		ModeloPaciente paciente1 = new ModeloPaciente();
		ModeloPaciente paciente2 = new ModeloPaciente();
		
		System.out.println("PACIENTE 1");
		paciente1.nome = "Camila";
		paciente1.idade = 21;
		paciente1.area = "Ortopedista";
		paciente1.grau = "Amarelo";
		paciente1.estadoAtual();
		paciente1.atendimento();

		System.out.println("\nPACIENTE 2");
		paciente2.nome = "José";
		paciente2.idade = 102;
		paciente2.area = "Neurologista";
		paciente2.grau = "Vermelho";
		paciente2.estadoAtual();
		paciente2.atendimento();
	}

}
