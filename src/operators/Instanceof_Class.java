package operators;

public class Instanceof_Class {
	public static void main(String[] args) {

		int i = 10;
		//int n = i++ % 5;
		int v = ++i % 5;

		System.out.println(v);
		int bitmask = 0x000F;
		int val = 0x2222;
		// prints "2"
		// System.out.println(val & bitmask);
		Parent obj1 = new Parent();
		Parent obj2 = new Child();

		/*System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
		System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
		System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
		System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));*/
		Child mInterface = new Child();
		mInterface.smile();
		if (mInterface instanceof Child) {
			System.out.println(mInterface.toString() + "Is instance Child");
		} else {
			System.out.println(mInterface + "Is not instance Child");
		}
	}
}
