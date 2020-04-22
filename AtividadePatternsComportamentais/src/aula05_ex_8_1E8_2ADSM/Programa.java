package aula05_ex_8_1E8_2ADSM;

public class Programa {

	public static void main(String[] args) {
		
		ConsomeNoticia agregadorTopico = new AgregadorTopico("TopicoJogo1");
		Noticiario noticiario = new NoticiarioAssina(agregadorTopico);
		System.out.println("---------------- Agregador por Topico -----------------");
		noticiario.notificaNoticia("Jogo1", 1 , 1 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo2", 2 , 1 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo3", 3 , 2 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo4", 24 , 4 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo5", 13 , 5 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo6", 16 , 1 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo7", 20 , 6 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo8", 15 , 9 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo9", 9 , 10 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo10", 12 , 9 , "TopicoJogo1");
		noticiario.notificaNoticia("Jogo11", 21 , 1 , "TopicoJogo2");
		
		System.out.println("\n\n------------------ Agregador Mensal --------------------");
		ConsomeNoticia agregadorMensal = new AgregadorMensal();
		noticiario = new NoticiarioAssina(agregadorMensal);
		noticiario.notificaNoticia("Jogos12", 1 , 1 , "TopicoJogo3");		
		noticiario.notificaNoticia("Jogos13", 3 , 1 , "TopicoJogo2");		
		noticiario.notificaNoticia("Jogos14", 4 , 1 , "TopicoJogo3");
		noticiario.notificaNoticia("Jogos15", 10 , 1 , "TopicoJogo1");		
		noticiario.notificaNoticia("Jogos16", 11 , 1 , "TopicoJogo1");		
		noticiario.notificaNoticia("Jogos17", 15 , 1 , "TopicoJogo3");
		noticiario.notificaNoticia("Jogos18", 19 , 1 , "TopicoJogo2");		
		noticiario.notificaNoticia("Jogos19", 20 , 1 , "TopicoJogo3");		
		noticiario.notificaNoticia("Jogos20", 28 , 1 , "TopicoJogo3");
		noticiario.notificaNoticia("Jogos21", 1 , 2 , "TopicoJogo3");		
		
	}

}
