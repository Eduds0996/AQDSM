package aula03_ex_2_2ADSM;

public class FactoryMethod {
	
	public FactoryMethod(String senha) {
		
		Provedora escolha;
		
		if(senha.equals("desi gnpatt er ns")) {
			escolha = new ProvedoraConfidencial();
		}
		else {
			escolha = new ProvedoraPublica();
		}
		
		escolha.lerTxt();
	}

}
