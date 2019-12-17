package typesvaluevariable;

import java.util.ArrayList;
import java.util.Collection;

public class UnboundedWildcards {

	static void printCollection(Collection<?> c) {
		// a wildcard collection
		for (Object o : c) {
			System.out.print(o);
		}
	}

	public static void main(String[] args) {
		Collection<String> cs = new ArrayList<String>();
		cs.add("This is ");
		cs.add("a string collection");
		printCollection(cs);
	}
}
