package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LinkedHashMap_Class {

	public static void main(String[] args) {
		Map<Integer, String> ef = new TreeMap<>();

		ef.put(3, "BANANA");
		ef.put(1, "APPLE");
		ef.put(2, "PEAR");
		// ef.put(null, null);

		// ef.put(null, "GRAPES");

		// System.out.println(ef.get(0));
		// key set
		/*
		 * for (Integer i : ef.keySet()) { System.out.println(ef.get(i)); }
		 */
		long first = System.currentTimeMillis();

		for (Entry<Integer, String> i : ef.entrySet()) {
			int size = ef.size();
			System.out.println(i.getKey() + " " + i.getValue());
		}
		long last = System.currentTimeMillis();
		System.out.println(last-first);

	}

}
