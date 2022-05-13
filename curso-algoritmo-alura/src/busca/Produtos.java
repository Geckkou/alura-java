package busca;

public class Produtos {
	
	private String carro;
	private double precos;
	
	public Produtos() {
		
	}
	
	public Produtos(String carro, double precos) {
		super();
		this.precos = precos;
		this.carro = carro;
	}
	
	public static int buscaMenorPreco(Produtos[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		
		for(int atual = inicio; atual < termino; atual++) {
			if(produtos[atual].getPrecos() < produtos[maisBarato].getPrecos()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}
	
	public static int busMaiorPreco(Produtos[] produtos) {
		int maisCaro = 0;
		
		for(int atual = 0; atual < produtos.length; atual++) {
			if(produtos[atual].getPrecos() > produtos[maisCaro].getPrecos()) {
				maisCaro = atual;
			}
		}
		System.out.println("O carro mais barato caro: R$ " + produtos[maisCaro].getPrecos());
		return maisCaro;
	}
	
	public static void selectionSort(Produtos[] produtos, int quantidadeDeElementos) {
		for(int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
			int menor  = Produtos.buscaMenorPreco(produtos, atual, quantidadeDeElementos);
			
			Produtos.troca(produtos, atual, menor);
		}
		
		for (Produtos produto : produtos) {
			System.out.println(produto.getCarro() + " custa " + produto.getPrecos());
		}
	}
	
	public static void insertionSort(Produtos[] produtos, int quantidadeDeElementos) {
		for(int atual = 1; atual < quantidadeDeElementos; atual++) {
			
			int analise = atual;
			while(analise > 0 && produtos[analise].getPrecos() < produtos[analise-1].getPrecos()) {
				
				troca(produtos, analise, analise-1);
				analise--;
			}
		}
		for (Produtos produto : produtos) {
			System.out.println(produto.getCarro() + " custa " + produto.getPrecos());
		}
	}
	
	


	private static void troca(Produtos[] produtos, int primeiro, int segundo) {
		Produtos primeiroProduto = produtos[primeiro];
		Produtos segundoProduto = produtos[segundo];
		
		produtos[primeiro] = segundoProduto;
		produtos[segundo] = primeiroProduto;
		
	}

	public double getPrecos() {
		return precos;
	}


	public void setPrecos(double precos) {
		this.precos = precos;
	}


	public String getCarro() {
		return carro;
	}


	public void setCarro(String carro) {
		this.carro = carro;
	}
	
	
	
	
	

}
