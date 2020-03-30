package aula03_ex_2_2ADSM;

import java.io.BufferedReader;
import java.io.FileReader;

public interface Provedora {
	
	default String lerArquivo(String arquivo) {
		try 
		{
		      FileReader arq1 = new FileReader(arquivo);
		      BufferedReader lerArq = new BufferedReader(arq1);
		 
		      String linha = lerArq.readLine(); 
		
		      while (linha != null) 
		      {
		        System.out.printf("%s\n", linha);
		        linha = lerArq.readLine(); 
		      }
		 
		      arq1.close();
	    }catch(Exception e) {
	    	System.out.println("Erro ao ler");
	    }
		return null;
		
	}
	
	public String lerTxt();
}
