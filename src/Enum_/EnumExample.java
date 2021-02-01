package Enum_;

public enum EnumExample  {

	APPLE(1, "Expensive"), SAMSUNG(2, "Good"), HTC(3, "Cheap");

	String type;
	int i;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	EnumExample(int i, String type) {
		this.type = type;
		this.i = i;
	}
	
//	@Override
//	public void print() {
//		System.out.println("this is interface method" + this.values());
//
//	}

}
