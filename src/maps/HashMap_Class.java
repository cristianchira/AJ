package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMap_Class {

	static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;

	public enum Fruits {
		APPLE, PEAR, BANANA
	}

	public static void main(String[] args) {
		Map<Integer, String> ef = new HashMap<>();

		ef.put(1, "APPLE");
		ef.put(3, "BANANA");
		ef.put(2, "PEAR");
		ef.put(4, "PEACH");
		ef.put(5, "GRAPES");
		ef.put(null, null);
		// ef.clear();
		SortedMap<Integer, String> sMap = new TreeMap<>();
		NavigableMap<Integer, String> nMap = new TreeMap<>();
		// System.out.println(ef);
		// key set

		// for (Integer i : ef.keySet()) { System.out.println(ef.get(i)); }

		for (Map.Entry<Integer, String> i : ef.entrySet()) {
			int size = ef.size();
			System.out.println(i.hashCode() + " " + i.getValue());

		}

		Iterator<Integer> ief = ef.keySet().iterator();

		while (ief.hasNext()) {

			System.out.println(ef.get(ief.next()));
		}

		// java8

		// Stream.of(dataMap);
		// System.out.println(l);
	}
}
