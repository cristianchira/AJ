package collections;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class List_Class {


	public void sortingList() {
		Human h1 = new Human("Sarah", 10);
		Human h2 = new Human("Jack", 12);

		List<Human> humans = Arrays.asList(h1, h2, new Human("Bob", 14));

		Collections.sort(humans, new Comparator<Human>() {
			@Override
			public int compare(Human h1, Human h2) {
				return h1.getName().compareTo(h2.getName());
			}
		});
		for (Human o : humans) {
			//System.out.println(o.getName());
		}
		//assertEquals(humans.get(0), new Human("Jack", 12));
	}

	public static void main(String[] args) {
		new List_Class().sortingList();
		List<Integer> intl = Arrays.asList(4, 88, 94, 66, 954);
		Random rnd = new Random();
		shuffle(intl, rnd);

		for (ListIterator<Integer> it = intl.listIterator(intl.size()); it.hasPrevious();) {
			Integer t = it.previous();
			
			//System.out.print(t+" ");

		}
	}

	public static void shuffle(List<?> list, Random rnd) {
		for (int i = list.size(); i > 1; i--)
			swap(list, i - 1, rnd.nextInt(i));
		System.out.print(list+" ");
	}

	public static <E> void swap(List<E> a, int i, int j) {
		E tmp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, tmp);
	}

}
