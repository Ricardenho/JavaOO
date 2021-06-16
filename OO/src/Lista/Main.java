package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		String resp = "S";
		
		while(resp.toUpperCase().equals("S")) {
			int contem=0;
			System.out.printf("Digite o Id: ");
			int id = sc.nextInt();
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getId()==id) {
					contem++;
				}
			}
			if(contem==0) {
				sc.nextLine();
				System.out.printf("Digite o Nome: ");
				String nome = sc.nextLine();
				System.out.printf("Digite o Salario: ");
				double salario = sc.nextDouble();
				Funcionario fc = new Funcionario(id, nome, salario);
				
				list.add(fc);
				sc.nextLine();
			}else {
				System.out.println("Id ja cadastrado");
				sc.nextLine();
			}
			
			System.out.printf("Quer Continuar: [S/N] ");
			resp = sc.nextLine();
		}
		System.out.println("ANTES: ");
		System.out.println(list);
		
		System.out.printf("Digite o id do funcionario: ");
		int x = sc.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId()==x) {
				System.out.printf("Digite o percentual que deseja aumentar: ");
				double p = sc.nextDouble();
				list.get(i).aumentoSalario(p);
			}
		}
		
		System.out.println("DEPOIS: ");
		System.out.println(list);
		
		sc.close();
	}

}
