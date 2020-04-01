package aula04_ex_6_2ADSM;

public class Ordem {
	/*
	 * Bubble sort
	 */
	public static void bolha(int v[]) {
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
	/*
	 * Insertion sort
	 */
	public static void insercao(int v[]) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
			x = v[j];
			for (i = j - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			v[i + 1] = x;
		}
	}
	/*
	 * Selection sort
	 */
	public static void selecao(int v[]) {
		int i, j, min, x;
		for (i = 0; i < v.length - 1; ++i) {
			min = i;
			for (j = i + 1; j < v.length; ++j) {
				if (v[j] < v[min])
					min = j;
			}
			x = v[i];
			v[i] = v[min];
			v[min] = x;
		}
	}
	/*
	 * Quicksort - particionamento
	 */
	public static int particao(int vet[], int ini, int fim) {
         int pivo = vet[ini]; int esq = ini+1; int dir = fim; int aux;
         while (esq <= dir) 
         {
            while (esq <= dir && vet[esq] <= pivo) esq++;
            while (vet[dir] > pivo) dir--;
            if (esq < dir) 
            {
            aux = vet[esq]; vet[esq] = vet[dir]; vet[dir] = aux;
            esq++; dir--;
            }
         }
         vet[ini] = vet[dir]; vet[dir] = pivo;
         return dir;
   }
	/*
	 * Quicksort - principal (chama o metodo separa)
	 */
	public static void quicksort(int vet[], int ini, int fim) {
       if (ini < fim)
       {
          int pivo = particao(vet, ini, fim);
          quicksort(vet, ini, pivo-1);
          quicksort(vet, pivo+1, fim);
       }
    }
}
