package aula03_ex_2_2ADSM;

import java.util.Scanner;

public class TesteProvedor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		new FactoryMethod(sc.nextLine());
		sc.close();

	}
	
	
}
