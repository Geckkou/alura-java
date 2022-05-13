package busca;

public class BuscaMenorPreco {

	public static void main(String[] args) {
		Produtos produtos[] = {
				new Produtos("Lamborghini", 1000000),
				new Produtos("Jipe", 46000),
				new Produtos("Brasília", 16000),
				new Produtos("Smart", 46000),
				new Produtos("Fusca", 17000)
		};
		
		Produtos.buscaMenorPreco(produtos, 0, 5);
		Produtos.busMaiorPreco(produtos);
		
	}
}