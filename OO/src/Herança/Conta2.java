package Herança;

public class Conta2 {

	private int conta;
	private String nome;
	private double saldo;
	
	public Conta2(int conta, String nome, double saldo) {
		super();
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [conta=" + conta + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
	
	
}	
