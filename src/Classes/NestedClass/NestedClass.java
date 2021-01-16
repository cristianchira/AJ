package Classes.NestedClass;

/*
A class that is defined within another class is called a nested class
 */

public class NestedClass {

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

            int snc = new NestedClass().x;
            new NestedClass().getText();
            System.out.println("Nested_Class.x = " + snc);
        }

    }
}