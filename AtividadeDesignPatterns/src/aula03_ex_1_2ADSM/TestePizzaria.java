package aula03_ex_1_2ADSM;

import javax.swing.JOptionPane;

public class TestePizzaria {

	public static void main(String[] args) {
		
		String data = JOptionPane.showInputDialog("Digite sua data");
		Pizzaiolo pizzaiolo = Pizzaiolo.pizzaiolo(data);
		
		System.out.println(pizzaiolo.pizza().ingrediente());
		System.out.println(pizzaiolo.calzone().sabor());
		System.out.println(data);
	}

}
