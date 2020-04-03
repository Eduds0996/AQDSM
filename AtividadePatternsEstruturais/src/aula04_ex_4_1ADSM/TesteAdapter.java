package aula04_ex_4_1ADSM;

import java.util.HashMap;

public class TesteAdapter {
	public static void main(String[] args) {
		int i[][] = {{1,2},{3,4},{5,6}};
		HashMap<Integer, Integer> m = HashMapAdapter.matrixToHashMap(i);

		System.out.println(m.toString());
	}

}
