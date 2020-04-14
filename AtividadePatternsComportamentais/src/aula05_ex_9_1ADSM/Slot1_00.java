package aula05_ex_9_1ADSM;

public class Slot1_00 implements Slot {
	private Slot slot;
	public double valor;
	
	public Slot1_00(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;

	}

	@Override
	public double maquina(Produto produto) {
		if(produto.getValor() == 1.00) {
			System.out.println("Moeda de 1 real inserida...");
			return 1;
		} else if(this.slot != null){
			//System.out.println("Não é moeda de 1 real passe para a de 50 centavos...");
			return slot.maquina(produto);
		} else {
			System.out.println("Moda não encontrada...");
			return 0;
		}	
	}

}
