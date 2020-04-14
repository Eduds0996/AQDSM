package aula05_ex_9_1ADSM;

public class Slot10 implements Slot {
	private Slot slot;
	public double valor;
	
	public Slot10(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;

	}

	@Override
	public double maquina(Produto produto) {
		if(produto.getValor() == 0.10) {
			System.out.println("Moeda de 10 centavos inserida...");
			return 0.10;
		} else if(this.slot != null){
			//System.out.println("Não é moeda de 10 centavos passe para a de 5 centavos...");
			return slot.maquina(produto);
		} else {
			System.out.println("Moda não encontrada...");
			return 0;
		}
	}
}
