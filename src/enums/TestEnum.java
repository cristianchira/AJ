package enums;

import java.util.ArrayList;
import java.util.Collections;
import collections.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEnum {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws UnsupportedOperationException {

		EnumExample mobile = EnumExample.APPLE;
		EnumExample[] el = EnumExample.values();

		for (EnumExample e : el) {
			// e.print();
			// e.go();

			System.out.println(e.name() + " " + e.i + " " + e.type);
		}

		List<String> listA = Arrays.asList("S", "T", "S");
		List<String> listB = new ArrayList<>();
		listB.add("AS");
		listB.add("jhj");

		List<String> concat = Stream.concat(listA.stream(), listB.stream()).collect(Collectors.toList());

		// create array list object
		List<String> arrlist = new ArrayList<>();

		// populate the list
		arrlist.add("A");
		arrlist.add("B");
		arrlist.add("C");

		// System.out.println("Initial collection value: " + arrlist);

		// add values to this collection
		boolean b = Collections.addAll(arrlist, "SD");

		// System.out.println("Final collection value: " + arrlist);

	}
}
