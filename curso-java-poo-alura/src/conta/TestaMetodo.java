package conta;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		Conta contaDaMarcela = new Conta();
		
		contaDoPaulo.setSaldo(100);;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.getSaldo());
		
		contaDoPaulo.deposita(20);
		System.out.println(contaDoPaulo.getSaldo());
		
		
		boolean conseguiRetirar  = contaDoPaulo.saca(70);
		System.out.println(contaDoPaulo.getSaldo());
		System.out.println(conseguiRetirar);
		
		contaDaMarcela.deposita(1000);
		contaDaMarcela.transfere(500, contaDoPaulo);
		
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoPaulo.getSaldo());

	}

}
