package Banco;

public class Conta {
	private int conta;
	private String name;
	private double value;
	
	public Conta(int conta, String name, double value) {
		super();
		this.conta = conta;
		this.name = name;
		this.value = value;
	}
	
	public Conta(int conta, String name) {
		super();
		this.conta = conta;
		this.name = name;
		this.value = 0;
	}

	public int getConta() {
		return conta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private double getValue() {
		return value;
	}

	private void setValue(double value) {
		this.value = value;
	}
	
	
	public void Saque(double valor) {
		if (valor <= getValue()) {
			setValue(getValue()-valor);
		}else {
			System.out.println("Saldo indisponivel");
		}
	}
	
	public void Deposito(double valor) {
		setValue(getValue()+ valor);
	}
	
	public double Extrato() {
		return getValue();
	}
}
