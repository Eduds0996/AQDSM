package aula05_ex_8_1E8_2ADSM;

public class Publicador implements ConsomeNoticia {

	@Override
	public void consomeNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Publicado: " + dia + "/" + mes + ":" + topico + " -> " + textoNoticia);
	}

}
