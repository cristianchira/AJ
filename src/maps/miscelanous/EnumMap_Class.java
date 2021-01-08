package maps.miscelanous;

import java.util.EnumMap;
import java.util.Map.Entry;

import maps.miscelanous.HashMap_Class.Fruits;

public class EnumMap_Class {
	public static void main(String[] args) {

		EnumMap<Fruits, String> ef = new EnumMap<>(Fruits.class);
		ef.put(Fruits.APPLE, "APPLE");
		ef.put(Fruits.PEAR, "PEAR");
		ef.put(Fruits.BANANA, "BANANA");
		// ef.put(null, "GRAPES"); null key is not permitted here
		for (Entry<Fruits, String> f : ef.entrySet()) {
			System.out.println(f);
		}
		
//System.out.println(ef);
	}
}
