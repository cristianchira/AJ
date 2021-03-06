package Generics.Wldcards;

import java.util.ArrayList;
import java.util.Collection;

public class Unbounded_Wildcards {

	static void printCollection(Collection<?> c) {
		// a wildcard collection
		for (Object o : c) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		Collection<String> cs = new ArrayList<String>();
		cs.add("hello");
		cs.add("world");
		printCollection(cs);

		Collection<Character> ics = new ArrayList<Character>();
		ics.add('D');
		ics.add('G');
		printCollection(ics);
	}

}
