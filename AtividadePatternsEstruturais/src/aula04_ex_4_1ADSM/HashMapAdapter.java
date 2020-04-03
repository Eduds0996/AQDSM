package aula04_ex_4_1ADSM;

import java.util.HashMap;

public class HashMapAdapter extends HashMap <Integer , Integer>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static HashMap<Integer, Integer> matrixToHashMap(int[][] m) {
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int[] i : m) {
			h.put(i[0], i[1]);
		}
		return h;
	}
}
