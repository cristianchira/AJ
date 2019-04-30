package classes;

public class Private_Static_Method {

	static int first;
	static int last;
	public static int myVar = initializeClassVariable();

	private static int initializeClassVariable() {
		int avg = (first + last) / 2;
		return avg;
	}
}
