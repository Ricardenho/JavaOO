package Lista;

public class Funcionario {
	private Integer id;
	private String nome;
	private double salario;
	
	public Funcionario(Integer id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentoSalario(double percentual) {
		setSalario(getSalario()+ (getSalario()*(percentual/100)));
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario= R$" + salario + "]";
	}
}	
