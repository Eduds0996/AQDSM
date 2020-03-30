package aula03_ex_2_2ADSM;

public class ProvedoraConfidencial implements Provedora {

	@Override
	public String lerTxt() {
		
		return lerArquivo("confidencial.txt");
	}

}
