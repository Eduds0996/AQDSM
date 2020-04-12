package aula04_ex_5_1ADSM;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TesteFacade {

	public static void main(String[] args) {
		IOFacade iof = new IOFacade();
		iof.lerArquivoBinario();
		iof.lerArquivoTexto();
		escreverObjeto();
		
		System.out.println("\nArquivo com objeto: " + iof.abrirObjeto("aluno.obj"));
	}


	private static void escreverObjeto() {
		Aluno aluno = new Aluno(1, "Lili", 9.9);
		try {
			FileOutputStream fileOut = new FileOutputStream("aluno.obj");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(aluno);
			objectOut.close();
		} catch (Exception ex) {
			System.out.println("N�o foi poss�vel escrever o objeto.");
			ex.printStackTrace();
		}
	}
}
