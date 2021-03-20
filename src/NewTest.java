import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.Stack;
import java.util.Vector;

import Map_.Util_Map_Classes.HashMap_Example.forEach_Method;

public class NewTest {

	public static void main(String[] args) {
//
//		Collection<String> collections = new ArrayList<String>();
//
//		collections.add("Ma");
//		collections.add("duc");
//		collections.add("la");
//		collections.add("plimbare ");
//		collections.add("seara");

		List<String> aList = new ArrayList<String>();
		aList.add("Apple");
		aList.add("Mango");
		aList.add("Guava");
		aList.add("Aprange");
		aList.add("Peach");
		
       aList.forEach(System.out::println);
        
        
//      for (String s: aList) {
//         System.out.println(s);
//      }

	
	}

}
