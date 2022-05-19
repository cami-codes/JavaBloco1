package POOExercicios;

public class Patinete {

	public static void main(String[] args) {
		ModeloPatinete patinete1 = new ModeloPatinete();
		
		System.out.println("\n--------------------------------------------");
		
		patinete1.cor = "Preto";
		patinete1.protegido();
		patinete1.naoMotorizado();
		patinete1.toPreparado();
		
		patinete1.estadoAtual();
		patinete1.pilotar();
		
		System.out.println("\n--------------------------------------------");
	}

}
