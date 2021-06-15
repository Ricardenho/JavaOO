package OrientacaoObjetos;

public class quadrado {
	double base;
	double altura;
	
	public quadrado(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "quadrado [base=" + base + ", altura=" + altura + "]";
	}
	
	public double area() {
		
		return altura*base;
	}
	
	
	
}
