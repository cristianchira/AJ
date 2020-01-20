package wildcards;

import java.util.Collection;
import java.util.ArrayList;

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

		Collection<Integer> ics = new ArrayList<Integer>();
		ics.add(22);
		ics.add(75);
		printCollection(ics);
	}

}
