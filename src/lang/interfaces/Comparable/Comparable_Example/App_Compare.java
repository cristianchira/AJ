package lang.interfaces.Comparable.Comparable_Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App_Compare {
	public static void main(String args[]) {
		
	List<Employees> empList = new ArrayList<>();
	empList.add(new Employees("Ioan", "Chirila", 55));
	empList.add(new Employees("Vasile", "Moldovan", 55));
	empList.add(new Employees("Narcis", "Dobra", 55));
	empList.add(new Employees("Adela", "Modoran", 55));
	empList.add(new Employees("Cristian", "Chira", 55));

	//sort employee  by last name based on natural order ---------------------------------------------------------------
    	Collections.sort(empList);
	
	for(Employees e:empList) {
		
		System.out.println(e.firstname + " " + e.lastname + " " +e.age);	
	}
	
	}

}