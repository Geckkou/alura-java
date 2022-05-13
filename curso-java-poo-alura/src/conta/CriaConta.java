package conta;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.setSaldo(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.setSaldo(primeiraConta.getSaldo() + 100);
		System.out.println(primeiraConta.getSaldo());
		
		segundaConta.setSaldo(300);
		System.out.println("Primeira conta tem: R$ " + primeiraConta.getSaldo());
		System.out.println("Segunda conta tem: R$ " + segundaConta.getSaldo());
		

	}

}
