package classes;

class BicycleDemo {
	public static void main(String[] args) {

		// Create two different
		// Bicycle objects
		Bicycle bike1 = new Bicycle(45,"whc", 62, 5);
		Bicycle bike2 = new Bicycle("gdc",62,22, 4);
		Bicycle bicycle =new Bicycle();
		Bicycle bicycle2= new MountainBike();
		MountainBike bD=new MountainBike(45,"hjh", 62, 5,5);
		
		bD.draw(2, "String after");
		
		bD.draw("String firs", 2);
		
		//System.out.println(hc + " " + hc1);

	}
}