package construtores;

public class Banco {
	private int conta;
	private String titular;
	private double saldo;
	
	//Construtores
	public Banco(int conta, String titular, double deposito) {
		this.conta = conta;
		this.titular = titular;
		this.saldo = deposito;
	}
	//overload
	public Banco(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
		}
	
	//getters and setters
	public int getConta() {
		return conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getDeposito() {
		return saldo;
	}
	
	//Metodos
	public void Saque(double saque) {
		saldo -= saque + 5;
	};
	public void Deposito(double deposit) {
		saldo += deposit;
	};
	
	
	//toString
	public String toString() {
		return "Account " + conta + ", Holder: " + titular + ", Balance: $ " + saldo;
	}
	
	
	
	
	
	
	
}
