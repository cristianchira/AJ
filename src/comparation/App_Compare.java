package comparation;

import java.util.ArrayList;
import java.util.Collections;
import collections.List;

public class App_Compare {
	public static void main(String args[]) {
		
	List<Employees> empList = new ArrayList<>();
	empList.add(new Employees("Ioan", "Chirila", 55));
	empList.add(new Employees("Vasile", "Moldovan", 55));
	empList.add(new Employees("Narcis", "Dobra", 55));
	empList.add(new Employees("Adela", "Modoran", 55));
	empList.add(new Employees("Cristian", "Chira", 55));
	
	Collections.sort(empList);
	
	for(Employees e:empList) {
		
		System.out.println(e.firstname + " " + e.lastname + " " +e.age);	
	}
	
	}

}
