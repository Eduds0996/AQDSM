package aula03_ex_1_1ADSM;


public class MostraBloco  implements AbstractFactory{
	@Override
	public MostraValor getParserInstance(String parserType) {
		
		switch(parserType) {
		case "BlocoNotas": return new BlocoDeNotas();
		}
		return null;
	}
}
