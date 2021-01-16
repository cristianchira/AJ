package Classes;

public class Final_Method {

	int first = 5;
	int last = 2;

	private int myVar = initializeInstanceVariable();

	protected final int initializeInstanceVariable() {
		return first + last;
	}

	public static void main(String[] args) {
		Final_Method myVar2 = new Final_Method();
		myVar2.initializeInstanceVariable();

		System.out.println(myVar2.myVar);
	}
}
