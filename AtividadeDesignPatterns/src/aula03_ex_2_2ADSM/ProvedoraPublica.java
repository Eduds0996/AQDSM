package aula03_ex_2_2ADSM;

public class ProvedoraPublica implements Provedora {

	@Override
	public String lerTxt() {
		return lerArquivo("publico.txt");
	}

}
