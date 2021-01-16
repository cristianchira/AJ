package Arrays_;

/*
                                                                        Declares an Array of integers.
                    int[] arr;

                                                                        Allocating memory for 5 integers.
                  arr = new int[5];

                                                                    Initialize elements of the array -first way -
                  arr[0] = 10;
                  arr[1] = 20;
                  arr[2] = 30;
                  arr[3] = 40;
                  arr[4] = 50;

                                                                   Initialize elements of the array  -second way -

                 int[] arr = new int[5] {10,20,30,40,50};

                                                                    Arrays of Objects



class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

                                                                 Elements of the array are objects of a class Student.

          The studentArray contains seven memory spaces each of size of student class in which the address of seven
          Student objects can be stored.The Student objects have to be instantiated using the constructor of the
          Student class and their references should be assigned to the array elements in the following way.

         Student[] arr = new Student[7]; //student is a user-defined class



public class GFG
{
	public static void main (String[] args)
	{
		// declares an Array of integers.
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[5];

		// initialize the first elements of the array
		arr[0] = new Student(1,"aman");

		// initialize the second elements of the array
		arr[1] = new Student(2,"vaibhav");

		// so on...
		arr[2] = new Student(3,"shikar");
		arr[3] = new Student(4,"dharmesh");
		arr[4] = new Student(5,"mohit");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " +
						arr[i].roll_no +" "+ arr[i].name);
	}
}







* */