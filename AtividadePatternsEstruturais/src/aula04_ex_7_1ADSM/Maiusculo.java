package aula04_ex_7_1ADSM;

public class Maiusculo extends LerStringConsole {

	@Override
	protected void formatarTexto(String string) {
		
		System.out.println("A palavra escrita em Mai�sculo: " + string.toUpperCase());

	}

}
