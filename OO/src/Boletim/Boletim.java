package Boletim;

public class Boletim {
	double n1;
	double n2;
	double n3;
	
	public Boletim(double n1, double n2, double n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}


	public void situation() {
		double nota = (n1+n2+n3)/3;
		if(nota >= 7) {
			System.out.printf("Final Grade: %.2f\n", nota);
			System.out.println("PASS");
		}else {
			System.out.printf("Final Grade: %.2f\n", nota);
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points", 7-nota);
		}
	}
}
