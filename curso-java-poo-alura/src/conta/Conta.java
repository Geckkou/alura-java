package conta;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {
		this.agencia = 0000;
		this.numero = 1111;
	}
	
	public Conta(double saldo, int agencia, int numero, Cliente titular) {
		Conta.total++;
		System.out.println("O total de contas é: " + Conta.total);
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	public void deposita(double valor) {
		setSaldo(getSaldo() + valor);
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			setSaldo(getSaldo() - valor); 
			return true;
		} else {
			System.out.println("Saldo insuficiente;");
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			setSaldo(getSaldo() - valor);
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <=0 ) {
			System.out.println("Não pode valores menores ou igual a 0.");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode valores meneros ou igual a 0.");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + "]";
	}
	
	

}
