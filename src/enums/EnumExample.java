package enums;

public enum EnumExample implements IEnum {

	APPLE(1, "Expensive"), SAMSUNG(2, "Good"), HTC(3, "Cheap");
	String type;
	int i;

	    EnumExample(int i, String type) {
		this.type = type;
		this.i = i;
	}
	
	@Override
	public void print() {
		System.out.println("this is interface method"+this.values());

	}

}
