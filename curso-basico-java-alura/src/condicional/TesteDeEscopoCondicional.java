package condicional;

public class TesteDeEscopoCondicional {

	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadePessoas = 1;
		
		boolean acompanhado;
		//boolean estaAcompanhado = quantidadePessoas >= 2;
		if (quantidadePessoas >= 2) {
			 acompanhado = true;
		} else {
			 acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja Bem-vindo");
			System.out.println("você pode entrar.");
		} else {
			System.out.println("Você não pode entrar sem acompanhante, pois você é menor de idade.");
		} 
	}

}
