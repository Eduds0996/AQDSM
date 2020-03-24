package aula03_ex_1_1ADSM;

public class MostraConsole implements AbstractFactory {
	@Override
	public MostraValor getParserInstance(String parserType) {
		
		switch(parserType) {
		case "Console": return new Console();
		}
		return null;
	}
}
