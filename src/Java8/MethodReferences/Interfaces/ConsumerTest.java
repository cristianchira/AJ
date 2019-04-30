package Java8.MethodReferences.Interfaces;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {

		Consumer<String> consumer = ConsumerTest::printNames;
		
		consumer.accept("Jeremy");
		consumer.accept("Paul");
		consumer.accept("Richard");
	}

	private static void printNames(String name) {
		System.out.println(name);
	
	}
}