package generics;

import stuff.GenericInterface;

public class TestGenerics {

	static int f = new Integer(544);
	static int g = new Integer("485");
	int h = Integer.valueOf(888);

	public TestGenerics(int h) {
		this.h = h;
	}

	public static void main(String[] args) {
		GenericInterface<String, Integer> gi = new GenericInterface<>();
		Integer sInteger = 55;
		gi.gm("jhsdc", sInteger);

	}

}
