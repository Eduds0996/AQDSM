package aula05_ex_8_1E8_2ADSM;

import java.util.ArrayList;
import java.util.List;

public class AgregadorTopico implements ConsomeNoticia {
	String topico;
	List<Noticia> noticias = new ArrayList<>();
	
	public AgregadorTopico(String topico) {
		this.topico = topico;
	}
	
	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		if (this.topico.equals(topico)) {
			Noticia noticia = new Noticia(textoNoticia , dia , mes , topico );
			noticias.add(noticia);
		}
		if(noticias.size() >= 10) {
			System.out.println("Já temos 10 noticias");
			noticias.forEach(c -> System.out.println(c));
			noticias.clear();
		}

	}

}
