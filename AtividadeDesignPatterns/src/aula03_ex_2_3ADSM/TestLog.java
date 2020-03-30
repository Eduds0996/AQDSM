package aula03_ex_2_3ADSM;

import javax.swing.JOptionPane;

public class TestLog {

	public static void main(String[] args) {
		
		String escolha = JOptionPane.showInputDialog("Escolha entre 'console' e 'arquivo' ");
		new FactoryMethod(escolha);

	}
}
