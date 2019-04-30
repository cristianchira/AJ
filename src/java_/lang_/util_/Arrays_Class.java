package java_.lang_.util_;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arrays_Class {

	public static void main(String[] args) {

		// METHOD asList create list from array of
		// objects---------------------------------------------
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		Integer[] inAr = { 545, 6546, 1, 2, 77, 96 };

		List<Integer> lis = Arrays.asList(inAr);
		List<Integer> sorted = lis.stream().sorted().collect(Collectors.toList());
		for (int i : sorted) {
			// System.out.print(i + " ");
		}

		// create List of obj from primitive
		// array----------------------------------------------------

		int[] array = { 56, 47, 2, 88, 47, 2, 1, 9998 };

		List<Integer> listInt = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());

		for (int i : listInt) {
			// System.out.print(i + " ");
		}

		// create objects array from primitive Array----------------------------------------------------
		int[] iarr = { 456, 747, 22, 988, 47, 22, 1, 9998 };

		Integer[] tarr = Arrays.stream(iarr).boxed().distinct().sorted().toArray(Integer[]::new);
		Integer max =tarr[tarr.length-1];
		//System.out.println(max);
		int sum=0;
		for (Integer i : tarr) {
			
			sum += i;
			//System.out.println(i);
		}
		//System.out.println(sum);
		// METHOD Arrays.copyOfRange(copyFrom, 2, cfl)copy an array to another---------------------------
		
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		int cfl = copyFrom.length;

		// System.out.println(cfl);
		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, cfl);
		Arrays.sort(copyTo);
		// System.out.println(new String(copyTo));

		// METHOD
		// binarySearch--------------------------------------------------------------------------
		int ser = Arrays.binarySearch(copyTo, 'a');
		int[] is = { 1, 55, 7, 55, 647 };

		Integer[] copyInt = Arrays.stream(is).boxed().toArray(Integer[]::new);
		// System.out.println(copyInt);

		/*
		 * public static int hashCode(int[]
		 * a)------------------------------------------------------------- Returns a
		 * hash code based on the contents of the specified array. For any two non-null
		 * int arrays a and b such that Arrays.equals(a, b), it is also the case that
		 * Arrays.hashCode(a) == Arrays.hashCode(b).
		 */
		int[] arr = { 2165, 5648, 21, 77, 2, 66, 8 };
		int[] arr1 = { 2165, 5648, 21, 77, 2, 66, 8 };

		int arrHashCode = Arrays.hashCode(arr);
		int arr1HashCode = Arrays.hashCode(arr1);
		if (arrHashCode == arr1HashCode) {
			// System.out.println("Arrays are equal " + arrHashCode + " = " + arr1HashCode);
		} else {
			// System.out.println("Arrays are not equal " + arrHashCode + " = " +
			// arr1HashCode);
		}

		if (arr.equals(arr1)) {
			// System.out.println("Arrays are equal");
		} else {
			// System.out.println("Arrays are not equal");
		}
		
		/*copyOf(boolean[] original, int newLength)-----------------------------------------
		Copies the specified array, truncating or padding with false (if necessary) 
		so the copy has the specified length.*/
		
		int[] copyArr= Arrays.copyOf(arr, arr.length);
		Arrays.sort(copyArr);
		int sum1 =0;
		for(int c:copyArr) {
		sum1 +=c;	
		System.out.print(c+" ");
		}
		System.out.println(sum1);
	}

}
