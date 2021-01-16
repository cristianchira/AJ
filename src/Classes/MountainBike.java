package Classes;

public class MountainBike extends Bicycle {
	// the MountainBike subclass has
	// one field
	public int seatHeight;

	public MountainBike(String startString, int startCadence, int startSpeed, int startGear) {

		super(startString, startCadence, startSpeed, startGear);
	};

	// the MountainBike subclass has
	// three constructors

	public MountainBike() {
	};

	public MountainBike(int startHeight, String startString, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startString, startSpeed, startGear);
		seatHeight = startHeight;
	}

	// the MountainBike subclass has
	// one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	public int draw(String str, int in) {
		System.out.println("String first");
		return in;
	}

	public int draw(int in, String str) {
		System.out.println("String second");
		return in;
	}

}
