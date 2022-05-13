package conta;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(0, 1337, 24226, null);
		Conta novaConta = new Conta(0, 1337, 16549, null);
		Conta outraConta = new Conta(0, 2112, 14660, null);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		novaConta.setAgencia(4324323);
		outraConta.setAgencia(534435);
		
		System.out.println(Conta.getTotal());
	}

}
