package Quadrado;

public class quadradoMain {

	public static void main(String[] args) {
		quadrado qua = new quadrado(2, 3.3);
		
		System.out.println(qua.area());
		System.out.println(qua);
		qua.base = 5.6;
		System.out.println(qua.area());

	}

}
