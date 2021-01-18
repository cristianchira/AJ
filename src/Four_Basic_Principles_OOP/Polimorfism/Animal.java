package Four_Basic_Principles_OOP.Polimorfism;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	void animalEat() {
		System.out.println("Animal eat");
	}
	
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();;
		
		List<Animal> animals = new ArrayList();
		animals.add(animal1);
		animals.add(animal2);
		
		for(Animal animal : animals) {
		animal.animalEat();	

		}
	}
}
