package aula05_ex_9_1ADSM;

public class Slot5 implements Slot {
	private Slot slot;
	public double valor;
	
	public Slot5(double valor) {
		this.valor = valor;
	}

	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;

	}

	@Override
	public double maquina(Produto produto) {
		if(produto.getValor() == 0.05) {
			System.out.println("Moeda de 5 centavos inserida...");
			return 0.05;
		} else if(this.slot != null){
			//System.out.println("Não é moeda de 25 centavos passe para a de 10 centavos...");
			return slot.maquina(produto);
		} else {
			System.out.println("Moda não encontrada...");
			return 0;
		}
	}

}
