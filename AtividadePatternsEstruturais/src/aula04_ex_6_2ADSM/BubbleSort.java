package aula04_ex_6_2ADSM;

import java.util.Arrays;

public class BubbleSort implements Sort{

	@Override
	public void sort(int[] v) {
		bubbleSort(v); 
		System.out.println("Metodo escolhido para ordena��o Bubble Sort: " +Arrays.toString(v));
		
	}

	public void bubbleSort(int v[]) {
		for (int i = v.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j + 1];
					v[j + 1] = v[j];
					v[j] = aux;
				}
			}
		}
	}
}
