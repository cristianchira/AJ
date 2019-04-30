package classes.nested_class;

public class Nested_Class {

	public int x = 0;

	public void getText() {

		System.out.println("This is Nested_Class's method");
	}

	class FirstLevel {

		public int x = 1;
		static final int V = 55;

		public FirstLevel(int n) {

			x = n;

		}

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			getText();
		}
	}

	static class Static_Nested_Class {
		int n = 2;
		static int st;

		static void staticShow() {

			System.out.println("Staticshow from static nested class");
		}

		void staticNestedClass(int n) {
			System.out.println("n= " + n);
			System.out.println("this.n = " + this.n);

			int snc = new Nested_Class().x;
			new Nested_Class().getText();
			System.out.println("Nested_Class.x = " + snc);
		}

	}
}