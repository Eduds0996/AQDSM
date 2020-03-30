package aula03_ex_2_3ADSM;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoTxt implements Log {

	@Override
	public String log() {
		
		try {
			FileWriter arq = new FileWriter("log.txt");
			PrintWriter gravarArq = new PrintWriter(arq);
			for(int i=1; i <= 10; i=i+1)
			{
				gravarArq.println("Contagem " + i);
				
			}
			arq.close();
			
		} catch (IOException error) {
			System.out.println("Erro ao criar o arquivo log.txt"+error);
		}
		return "Arquivo txt criado com sucesso"; 
	}	
}
