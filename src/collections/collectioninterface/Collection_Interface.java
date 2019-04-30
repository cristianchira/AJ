package collections.collectioninterface;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection_Interface {

	private static int SIZE = 100;

	public static void main(String[] args) {

		List<Byte> bytes = new ArrayList<>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			bytes.add((byte) i);
		}
		
		System.out.println(bytes);
		Collection<String> list = new ArrayList<>();
		list.add("Gold");
		list.add("Silver");
		list.add("Copper");
		list.add("Silver");
		list.add("Nichel");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {

			String str = itr.next();
			//System.out.println(str);
		}

		List<String> in = Arrays.asList("Gold", "Nichel", "Silver");

		Collection<Integer> intL = Arrays.asList(45, 55, 2, 58, 55, 6554, 8);
		Collection<Integer> ic = Arrays.asList(55, 58, 6554, 8);

		// intL.clear();
		list.removeAll(Collections.singleton("Silver"));

		//System.out.println(list.size());

	}

}
