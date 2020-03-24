package aula03_ex_1_1ADSM;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BlocoDeNotas implements MostraValor{
	
	public String valor() throws IOException {
		FileWriter arq = new FileWriter("hello_world.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf("Hello World");
		arq.close();
		System.out.println("Bloco de Notas Selecionado");
		return "Arquivo TxT gerado com sucesso";
	}
	
}
