package aula04_ex_7_1ADSM;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Entre com seu nome:");
			String string = scanner.nextLine();
			
			Maiusculo maiusculo = new Maiusculo();
			maiusculo.console(string);
			
			Minusculo minusculo = new Minusculo();
			minusculo.console(string);
			
			Duplicar duplicar = new Duplicar();
			duplicar.console(string);
			
			Inverter inverte =  new Inverter();
			inverte.console(string);
		}
		
	}

}
