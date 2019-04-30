package stuff;

@FunctionalInterface
public interface IStatic {

	int t=8;
	static void go() {
		
	System.out.println("This is IStatic static method");	
	}

	default void defaultMethod() {
	System.out.println("This is IStatic default method");
	}
	
	void abstractMethod();
	
	
}

