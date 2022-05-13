package condicional;

public class TesteCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 13;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("Seja Bem-vindo");
			System.out.println("Você é maior de idade.");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Você é menor de idade mas pode entrar com acompanhante. ");
		} else {
			System.out.println("Você não pode entrar sem acompanhante, pois você é menor de idade.");
		}

	}

}
