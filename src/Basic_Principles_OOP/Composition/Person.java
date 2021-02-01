package Basic_Principles_OOP.Composition;

public class Person {
    //composition has-a relationship
    private Job job;

    public Person() {
        this.job = new Job ();
        job.setSalary (1000L);
    }

    public long getSalary() {
        return job.getSalary ();
    }
}
  class TestPerson {

    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println (salary);
    }

}