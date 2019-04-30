package classes;

public class Bicycle {

	// the Bicycle class has
	// three fields
	public int cadence;
	public int gear;
	public int speed;
	public String string;
	static final String word = "word";
	// the Bicycle class has
	// two constructor

	public Bicycle() {
	};

	public Bicycle(String startstring, int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
		string = startstring;
	}

	public Bicycle(int startCadence, String startstring, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
		string = startstring;
	}

	// the Bicycle class has
	// four methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	public static String staticMethod() {

		return word;
	}

	static {

		System.out.println("This is static block");

	}
	
	{

		System.out.println("This initialization block");

	}

}