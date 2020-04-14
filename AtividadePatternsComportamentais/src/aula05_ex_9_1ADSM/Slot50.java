package aula05_ex_9_1ADSM;

public class Slot50 implements Slot {
	private Slot slot;
	public double valor;
	
	public Slot50(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;

	}

	@Override
	public double maquina(Produto produto) {
		if(produto.getValor() == 0.50) {
			System.out.println("Moeda de 50 centavos inserida...");
			return 0.50;
		} else if(this.slot != null){
			//System.out.println("Não é moeda de 50 centavos passe para a de 25 centavos...");
			return slot.maquina(produto);
		} else {
			System.out.println("Moda não encontrada...");
			return 0;
		}
	}
}
