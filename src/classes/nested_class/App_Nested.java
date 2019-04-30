package classes.nested_class;

public class App_Nested {

	public static void main(String[] args) {

		// Nested_Class nClass = new Nested_Class();

		Nested_Class.FirstLevel ncfl = new Nested_Class().new FirstLevel(5);

		int v = Nested_Class.FirstLevel.V;
		//System.out.println(v);
		 //ncfl.methodInFirstLevel(23);

		Nested_Class.Static_Nested_Class snc = new Nested_Class.Static_Nested_Class();
		//snc.staticNestedClass(6);

		int d = Nested_Class.Static_Nested_Class.st;
		//System.out.println(d);
		Nested_Class.Static_Nested_Class.staticShow();
		snc.staticNestedClass(8);;

	}

}
