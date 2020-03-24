package aula03_ex_1_2ADSM;

public class PizzariaFechada extends Pizzaiolo {

	@Override
	public Calzone calzone() {
		return new CalzoneDomingo();
	}

	@Override
	public Pizza pizza() {
		return new PizzaDomingo();
	}

}
