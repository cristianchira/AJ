package stream;

import collections.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {

		// Integer stream

		/*
		 * IntStream--------------------------------------------------------------------
		 * --------
		 * 
		 * .range(10,24) .forEach(System.out::print);
		 */

		// Integer stream with
		// skip----------------------------------------------------------------

		/*
		 * IntStream .range(2, 10) .skip(5).forEach(e-> System.out.print(e));
		 */

		// IntStream with
		// sum---------------------------------------------------------------------

		/*
		 * Integer sum =IntStream.range(2, 10).filter(x->x>=7).sum();
		 *  int s=Integer.parseInt(sum.toString()); System.out.println(s);
		 */

		// Sorted
		// streams------------------------------------------------------------------------------

		 List<String> list =Stream.of("Aurica","Ioana","Angela","Ioana").sorted().distinct().collect(Collectors.toList());
		 System.out.println(list);

		// 5.Stream from array filtered,sorted,remove
		// duplicate------------------------------------------------------------------------

		/*
		 * String[] names = { "Vasile", "Ion", "Marcel", "Ion", "Cristi", "Ioana" };
		 * List<String> list = Arrays.stream(names).filter(e ->
		 * e.startsWith("I")).distinct().sorted()
		 * .collect(Collectors.toCollection(LinkedList::new)); System.out.println(list);
		 */

		// Long[] is= {new Long(444),new Long(88),new Long(88),new Long(8)};
		// Arrays.sort(is);
		int[] as = { 52, 557, 1, 96, 1, 745 };
		// System.out.println(is);

		// List<Integer> list2
		// =Arrays.stream(as).boxed().distinct().sorted().collect(Collectors.toList());
		// System.out.println(list2);
		List sum = Arrays.stream(as).boxed().collect(Collectors.toList());
		
		System.out.println(sum);
		String[] names = { "Vasile", "Ion", "Marcel", "Ion", "Cristi", "Ioana" };
		List<String> ls = Stream.of(names).distinct().sorted().collect(Collectors.toList());
		
	}

}