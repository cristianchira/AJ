package collections.miscelanous;

import collections.Comparator;
import collections.List;
import java.util.stream.Collectors;

import comparation.Person;

public class Lambda_List_Class {

	public static void main(String[] args) {
		List<Person> persons = Person.createRoster();
		// persons.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

		// Comparator<Person> comparator = (h1, h2) ->
		// h1.getName().compareTo(h2.getName());
		// persons.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
		Comparator<Person> normal = Comparator.comparing(Person::getName).thenComparing(Person::getAge);
		Comparator<Person> reversed = normal.reversed();
		List<Person> processesList = persons.stream().sorted(normal).collect(Collectors.toList());
		Double processed = (double) persons.stream().mapToInt(Person::getAge).average().orElse(0);
		Integer maxAge = persons.stream().mapToInt(Person::getAge).max().orElse(0);
		int number = persons.size();
		for (Person p : processesList) {
			System.out.println(p.getName() + " " + p.getAge());
		}
		System.out.printf("Total number of persons %d%n", number);
		System.out.printf("Average age is: %.2f years.%n", processed);
		System.out.printf("Maximun age is: %d years.", maxAge);
	}

}
