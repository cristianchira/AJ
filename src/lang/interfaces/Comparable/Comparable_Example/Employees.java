package lang.interfaces.Comparable.Comparable_Example;

public class Employees implements Comparable<Employees> {

	String firstname;
	String lastname;
	int age;

	public Employees(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employees o) {
		int last = this.lastname.compareTo(o.lastname);
		return last;
	}

}
