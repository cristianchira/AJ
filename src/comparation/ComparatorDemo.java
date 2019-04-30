package comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ComparatorDemo {

	public static void main(String[] args) {
		int[] array = { 142, 55, 142, 75, 89 };

		ArrayList<String> list = new ArrayList<>();
		list.add("Delhy");
		list.add("Colcata");
		list.add("Delhy");
		list.add("Colcata");
		list.add("Hyderabad");
		list.add("Colcata");

		// sum of elements-------------------------------------------------------------
		// int sum =Arrays.stream(array).sum();
		
		// min max of elements-------------------------------------------------------------
		/*int min = Arrays.stream(array).min().orElse(0);
		System.out.println(min);*/
         // sum in range -------------------------------------------------------
	    int sum=	IntStream.range(2,50).sum();	;
		System.out.println(sum);
		/*.
		 * List<String> strings= list.stream().filter(x->
		 * x.contains("De")).distinct().sorted().collect(Collectors.toList());
		 */

		/*
		 * List<Integer> list2= Arrays.stream(a).boxed().collect(Collectors.toList());
		 * System.out.println(list2);
		 */

		/*
		 * sort method with index for primitive array----------------------------------
		 * Arrays.sort(a,0,a.length); for (int i : a) { System.out.println(i); }
		 */

		/*
		 * using Comparator interface foor
		 * list------------------------------------------- 
		 * list.sort(new StringCompare()); System.out.println(list);
		 */

	}

}
