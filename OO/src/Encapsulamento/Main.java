package Encapsulamento;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("Feijao", 3.50);
		
		//System.out.println(p1.name());
		System.out.println(p1.getName());
		
		
		//p1.name = "Aroz";
		p1.setName("Arroz");
		System.out.println(p1.getName());
	}

}
