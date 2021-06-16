package Banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new Conta(1515, "Carlos", 540);
		
		cc.Deposito(10);
		System.out.println(cc.Extrato());
		
		cc.Saque(20);
		System.out.println(cc.Extrato());
		
		cc.Saque(9200);
	}

}
