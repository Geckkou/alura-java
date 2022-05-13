package conta;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = primeiraConta;
		
		primeiraConta.setSaldo(300);;
		
		System.out.println("Saldo da primeira conta: R$ " + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta: R$ " + segundaConta.getSaldo());
		
		segundaConta.setSaldo(segundaConta.getSaldo() + 100);
		System.out.println("Saldo da segunda conta: R$ " + segundaConta.getSaldo());
		System.out.println("Saldo da primeira conta: R$ " + primeiraConta.getSaldo());
		
		if(primeiraConta == segundaConta) {
			System.out.println("São referencias ao mesmo objeto na memoria.");
		} else {
			System.out.println("São contas diferentes");
		}
		
		

	}

}
