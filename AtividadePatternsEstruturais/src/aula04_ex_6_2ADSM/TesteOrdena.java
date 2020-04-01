package aula04_ex_6_2ADSM;

import java.util.Arrays;
import java.util.Random;

public abstract class TesteOrdena {

	public static void main(String[] args) {

		int v[] = {5, 3 , 1 , 4 , 2 , 7 , 8 , 10 , 6 , 9 };
		Random random =  new Random();
		int numero = random.nextInt(4);
		
		if(numero == 0) {
			Ordem.bolha(v);
			System.out.println("Metodo escolhido para ordenação Bubble Sort: ");
			System.out.println(Arrays.toString(v));
		}
		if(numero == 1) {
			Ordem.insercao(v);
			System.out.println("Metodo escolhido para ordenação Insertion Sort: ");
			System.out.println(Arrays.toString(v));
		}
		if(numero == 2) {
			Ordem.selecao(v);
			System.out.println("Metodo escolhido para ordenação Selection Sort: ");
			System.out.println(Arrays.toString(v));
		}
		if(numero == 3) {
			Ordem.quicksort(v, 0, 9);
			System.out.println("Metodo escolhido para ordenação Quick Sort: ");
			System.out.println(Arrays.toString(v));
			
		}
		System.out.println("\n" + numero);

	}

}
