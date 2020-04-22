package aula05_ex_8_1E8_2ADSM;

public class NoticiarioAssina extends Noticiario {
	ConsomeNoticia consumidor;
	public NoticiarioAssina(ConsomeNoticia consumidor) {
		this.consumidor = consumidor;
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("-------------------------------------------");
		System.out.println("Produzindo noticia...");
		System.out.println(dia + "/" + mes + ": " + topico + "->" + textoNoticia );
		System.out.println("-------------------------------------------");
		consumidor.consomeNoticia(textoNoticia, dia, mes, topico);
	}

}
