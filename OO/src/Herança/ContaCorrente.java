package Herança;

public class ContaCorrente extends Conta2 {

	private double emprestimo;

	public ContaCorrente(int conta, String nome, double saldo, double emprestimo) {
		super(conta, nome, saldo);
		this.emprestimo = emprestimo;
	}

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [emprestimo=" + emprestimo + "]";
	}

	

	

}
