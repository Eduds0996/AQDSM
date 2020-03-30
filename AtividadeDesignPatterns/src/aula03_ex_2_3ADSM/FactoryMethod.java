package aula03_ex_2_3ADSM;

public class FactoryMethod {
	
	public FactoryMethod(String escolha) {
		Log p;
		
		if("arquivo".equals(escolha)){
			p = new ArquivoTxt();	
			p.log();
			System.out.println(p.log());
		}
		
		if("console".equals(escolha)) {
			p = new Console();	
			System.out.println(p.log());
		}
		
		else {
			p = null;
		}
		
	}

}
