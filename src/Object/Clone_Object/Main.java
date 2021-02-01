package Object.Clone_Object;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s3 = new Student ();

        //creating a object using the object class clone()
        Student s4 = (Student)  s3.clone ();
        System.out.println (s3.hashCode ());
        System.out.println (s4.hashCode ());
    }


}
