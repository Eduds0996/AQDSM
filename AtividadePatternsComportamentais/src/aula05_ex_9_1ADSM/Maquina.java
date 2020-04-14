package aula05_ex_9_1ADSM;

import javax.swing.JOptionPane;

public class Maquina {

	public static void main(String[] args) {
		Slot slot1_00 = new Slot1_00(1.00);
		Slot slot50   =	new Slot50(0.50);
		Slot slot25   =	new Slot25(0.25);
		Slot slot10   =	new Slot10(0.10);
		Slot slot5    =	new Slot5(0.05);
		Slot slot1    =	new Slot1(0.01);
		
		slot1_00.setSlot(slot50);
		slot50.setSlot(slot25);
		slot25.setSlot(slot10);
		slot10.setSlot(slot5);
		slot5.setSlot(slot1);
		
		
		double total = 0;
		double valor; 
		double preco = 0;
		
		System.out.println("");
		int produto = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu produto: \n1 - Refrigerante 5.35 \n2 - Salgadinho 3.15 \n3 - suco 4.2\n4 - Bala 3.75 \n5 - Chiclete 2.00"));
		if(produto == 1) {
			preco = 5.35;
		}
		if(produto == 2) {
			preco = 3.15;
			
		}
		if(produto == 3) {
			preco = 4.2;
		}
		if(produto == 4) {
			preco = 3.75;
		}
		if(produto == 5) {
			preco = 2;
		}
		while(total < preco) {
			double moeda; 
			moeda = Double.parseDouble(JOptionPane.showInputDialog("Insira a moeda..."));
			valor = slot1_00.maquina(new Produto(moeda));
			total = total + valor;
		}
		
		
		System.out.println("Total de reais inserido na maquina R$: " + total);
		System.out.println("Troco R$: " + (total - preco));
	}

}
