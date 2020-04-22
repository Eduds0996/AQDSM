package aula05_ex_9_2ADSM;

public class Handler {
	private Handler handler;
	private String nome;
	private long ultimo;
	
	public Handler(String nome) {
		super();
		this.nome = nome;
	}

	public Handler(Handler handler, String nome) {
		super();
		this.handler = handler;
		this.nome = nome;
	}


	public void processa() {
		long tempo = System.currentTimeMillis();
		if ((tempo - this.ultimo) < 200 ) {
			System.out.println(tempo + " , " + this.ultimo);
			System.out.println("Handler " + nome + " ocupado... ------>  Enviando para Handler " + this.handler.getNome());
			this.handler.processa();
		} else {
			this.ultimo = tempo;
			System.out.println("---------------- Handler " + nome + " processou. ----------------");
		}
	}
	
	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
