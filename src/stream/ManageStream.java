package stream;

import java.util.Collections;
import collections.Comparator;
import collections.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ManageStream {

	public static void main(String[] args) {

		Integer[] intg = { 1, 2, 147, 2,10,5,6, 69, 17 };		
		int[] integers = { 1, 2, 5, 6, 6, 6};
		
        // Array to list
		List<Integer> intList = Arrays.stream(integers).boxed().collect(Collectors.toList());
		
		List<Integer> listInt = Arrays.asList(intg);
		//List<int[]> list = Arrays.asList(integers);
		
//		Iterator iterator =listInt.iterator();
//		
//		while(iterator.hasNext()) {
//			
//			System.out.println(iterator.next());
//			
//		}
		
	///	listInt.forEach(System.out::println);
		
		
// sum
		// method 1
		int s = 0;
		for (int i : integers) {
			s += i;
		}
		//System.out.println(s);
		
// sum IntStream		
		
	Integer isum =IntStream.of(integers).sum();
	//System.out.println(isum);
	
	
// filtered sum
		
		// method 2
		//Integer filteredSum = IntStream.of(integers).filter(x -> x > integers[7]).sum();
		//System.out.println(filteredSum);
		
// range sum
		
		Integer rangeSum = IntStream.range(2, 5).sum();
        //System.out.println(rangeSum);
		
// sum from list
		
		int sumInteger = intList.stream().mapToInt(Integer::intValue).sum();	
		//System.out.println(sumInteger);
		
// max using for  	

		int max  = integers[0];
		for (int i = 0; i <  integers.length; i++) {
			if(integers[i] >= max ) {
				max = integers[i];
			}
		}
	//	System.out.println(max);


// max using Arrays
		
		Integer maxNumber = Arrays.stream(integers).boxed().max(Comparator.comparing(Integer::valueOf)).get();
		// int intr = maxNumber.intValue();
		//System.out.println(maxNumber);
		
// max using Collections
		
	    Integer maxColInteger =	Collections.max(intList);
     // System.out.println(maxColInteger);
      
        
// sorted list using stream
		List<Integer> sortedList = intList.stream().distinct().sorted().collect(Collectors.toList());
	//	System.out.println(sortedList);
		

		// sorted list using Collections    
	    
	    	Collections.sort(intList);
		// Collections.reverse(sortedList);
		// int f = Collections.frequency(intList, 6);
//		System.out.println(f);
		
	int  li= intList.stream().reduce(0 , (c,e) ->(c+ e));
		
		System.out.println(li);

}}
