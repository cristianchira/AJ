package java_.lang_;

import java.util.Scanner;

public class System_Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Printing the file passed in:");

		/*
		 * while (sc.hasNextLine()) { // System.out.println(sc.nextLine());
		 * System.err.println(sc.nextLine());
		 */

		/*
		 * METHOD arraycopy(Object src, int srcPos, Object dest, int destPos, int
		 * length)-----------------------
		 * 
		 * Copies an array from the specified source array, beginning at the specified
		 * position, to the specified position of the destination array.
		 */

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
		//String log_dir = System.getProperty("log_dir","/tmp/log");
		//System.out.println(log_dir);
		
		/*System.getenv().forEach((k, v) -> {
		    System.out.println(k + ":" + v);
		});*/
		
		/*String log_dir = System.getenv("log_dir");
		System.out.println(log_dir);*/
		System.out.println(System.getProperty("os.name"));
	}

}
