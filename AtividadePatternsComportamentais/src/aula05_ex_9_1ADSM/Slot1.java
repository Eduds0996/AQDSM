package aula05_ex_9_1ADSM;

public class Slot1 implements Slot {
	private Slot slot;
	public double valor;
	
	public Slot1(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;

	}

	@Override
	public double maquina(Produto produto) {
		if(produto.getValor() == 0.01) {
			System.out.println("Moeda de 1 centavos inserida...");
			return 0.01;
		} else if(this.slot != null){
			//System.out.println("Não é moeda de 1 centavos passe para a...");
			return slot.maquina(produto);
		} else {
			System.out.println("Moda não encontrada...");
			return 0;
		}
	}

}
