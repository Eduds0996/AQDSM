package aula05_ex_8_1E8_2ADSM;

public class Noticia {
	String textoNoticia;
	int dia;
	int mes;
	String topico;
	
	public Noticia(String textoNoticia, int dia, int mes, String topico) {
		this.textoNoticia = textoNoticia;
		this.dia = dia;
		this.mes = mes;
		this.topico = topico;
	}
	
	public String getTextoNoticia() {
		return textoNoticia;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public String getTopico() {
		return topico;
	}

	@Override
	public String toString() {
		return "Noticia: [ " + textoNoticia + " lançou em: " +  dia + "/" + mes + ", topico=" + topico + "]";
	}
}
