package arrays;

public class SumClass {
	public static void main(String[] args) {
		int[] ia = new int[10];

		int max = ia[0];

		for (int i = 4; i < ia.length; i++) {
			ia[i] = i;
			System.out.println(ia[i]);
			// max--------------------------------------------------------------
			if (max > ia[i]) {
				max = ia[i];
			}

		}
		System.out.println(max);

		// sum-----------------------------------------------------------------
		/*
		 * int sum = 0; /*for (int e : ia) sum += e; System.out.println(sum);
		 */

		// Arrays sort -------------------------------------------------
		/*
		 * Arrays.sort(ia); int max =ia[ia.length-1]; System.out.println(max);
		 */

		// stream max-------------------------------------------------
		/*
		 * int max=Arrays.stream(ia).max().orElse(0); System.out.println(max);
		 */
		// stream sum--------------------------------------------------
		/*
		 * int sum =Arrays.stream(ia).sum(); System.out.println(sum);
		 */
	}
}
