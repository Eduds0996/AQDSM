package aula05_ex_8_1E8_2ADSM;

import java.util.ArrayList;
import java.util.List;

public class AgregadorMensal implements ConsomeNoticia {
	int mesCorrente = 0;
	List<Noticia> noticias = new ArrayList<>();
	
	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		Noticia noticia = new Noticia(textoNoticia , dia , mes , topico);
		if(mesCorrente == 0) {
			mesCorrente = mes;
			noticias.add(noticia);
		} else if (mesCorrente == mes ) {
			noticias.add(noticia);
		} else {
			System.out.println("Mudou o mes");
			noticias.forEach(c -> System.out.println(c));
			noticias.clear();
			mesCorrente = mes;
			noticias.add(noticia);
		}
		

	}

}
