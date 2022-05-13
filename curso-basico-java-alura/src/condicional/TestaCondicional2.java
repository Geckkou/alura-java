package condicional;

public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 14;
		int quantidadePessoas = 4;
		boolean estaAcompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || estaAcompanhado) {
			System.out.println("Seja Bem-vindo");
			System.out.println("você pode entrar.");
		} else {
			System.out.println("Você não pode entrar sem acompanhante, pois você é menor de idade.");
		} 

	}

}
