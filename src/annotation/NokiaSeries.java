package annotation;



@Smartphone(os ="Android", version=6)
public class NokiaSeries {
	String model;
	int size;

	public NokiaSeries(String model, int size) {
		super();
		this.model = model;
		this.size = size;
	}

}
