package aula04_ex_7_1ADSM;

public abstract class LerStringConsole {
	
	public final void console(String string) {
		formatarTexto(string);
	}
	
	protected abstract void formatarTexto(String string);
}
