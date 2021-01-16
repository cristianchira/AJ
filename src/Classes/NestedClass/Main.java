package Classes.NestedClass;

public class Main {

	public static void main(String[] args) {

		// Nested_Class nClass = new Nested_Class();

		NestedClass.FirstLevel ncfl = new NestedClass().new FirstLevel(5);

		int v = NestedClass.FirstLevel.V;
		//System.out.println(v);
		 //ncfl.methodInFirstLevel(23);

		NestedClass.Static_Nested_Class snc = new NestedClass.Static_Nested_Class();
		//snc.staticNestedClass(6);

		int d = NestedClass.Static_Nested_Class.st;
		//System.out.println(d);
		NestedClass.Static_Nested_Class.staticShow();
		snc.staticNestedClass(8);;

	}

}
