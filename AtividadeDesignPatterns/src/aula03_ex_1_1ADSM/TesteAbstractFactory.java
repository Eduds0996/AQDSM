package aula03_ex_1_1ADSM;

import java.io.IOException;
import java.util.Random;

public class TesteAbstractFactory {
	
	public static void main(String[] args) throws IOException {
		Random gerador = new Random();
		int x = gerador.nextInt();
		String string = "Console";
		switch (x % 2) {
		case 0:
			string = "Bloco de Notas";
			break;
		}
		if (string == "Bloco de Notas") {
			AbstractFactory parserFactory = new MostraBloco();
			MostraValor parser = parserFactory.getParserInstance("BlocoNotas");
			String msg = "";
			msg = parser.valor();
			System.out.println(msg);
		}
		if (string == "Console") {
			AbstractFactory parserFactory = new MostraConsole();
			MostraValor parser = parserFactory.getParserInstance("Console");
			String msg = "";
			msg = parser.valor();
			System.out.println(msg);
		}

	}
}	
