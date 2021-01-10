package comparation.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAuthByNames {
	public static void main(String args[]) {
		// List of objects of Author class
		ArrayList<Author> al = new ArrayList<Author>();
		al.add(new Author("Henry", "Miller", "Tropic of Cancer"));
		al.add(new Author("Nalo", "Hopkinson", "Brown Girl in the Ring"));
		al.add(new Author("Frank", "Miller", "300"));
		al.add(new Author("Deborah", "Hopkinson", "Sky Boys"));
		al.add(new Author("George R. R.", "Martin", "Song of Ice and Fire"));

		/*
		 * Sorting the list using Collections.sort() method, we can use this method
		 * because we have implemented the Comparable interface in our user defined
		 * class Author
		 */
		/*
		 * Collections.sort(al); for (Author str : al) {
		 * System.out.println(str.firstName + " " + str.lastName + " " + "Book: " +
		 * str.bookName); }
		 */

		// Comparator<Author> normal = (a1, a2) -> a1.firstName.compareTo(a2.firstName);
		Comparator<Author> normal = Comparator.comparing(Author::getFirstName).thenComparing(Author::getLastName)
				.thenComparing(Author::getBookName);
		List<Author> fn = al.stream().sorted(normal).collect(Collectors.toList());
		for (Author str : fn) {
			System.out.println(str.firstName + " " + str.lastName + " " + "Book: " + str.bookName);
		}

	}
}
