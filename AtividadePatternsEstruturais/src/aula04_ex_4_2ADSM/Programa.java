package aula04_ex_4_2ADSM;

public class Programa {
	public static void main(String [] args) {

		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
