package variaveis;

public class ConversaoDeTipos {

	public static void main(String[] args) {
		
		float pontoFlutuante = 3.14f;

		double salario = 1270.50;
		int valor = (int)salario;
		
		System.out.println("Meu salário é de: " + valor);
		
		long numeroGrande = 2132312313221312312l;
		short valorPequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);

	}

}
