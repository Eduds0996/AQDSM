package aula03_ex_2_3ADSM;

public class Console implements Log {

	@Override
	public String log() {
		int conta = 1;
		System.out.println("Contando ate 10...");
		for(int i=1 ; i<=10 ; i++) {
			System.out.println("Contagem  " + conta);
			conta++;
		}
		return "";
	}

}
