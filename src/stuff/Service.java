package stuff;

public class Service implements IStatic {

	String service="String from Service";
	
public void process() {
		System.out.println("Processed stuff");
	}

@Override
public void abstractMethod() {
	System.out.println("This is abstract IStatic method");
	
}

}
