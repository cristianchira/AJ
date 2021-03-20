package Computer_Science.Theoretical_computer_science.Algotithms_And_Data_Structures.Algorithms.Algorithmic_Analysis.Execution_Efficiency.Algorithmic_Efficiency.Measures_of_Resource_Usage.Time.Time_Complexity.Constant_Time;

/*                                            Constant Time Algorithms – O(1)

    An algorithm is said to be constant time (also written as O(1) time) if the value of T(n) is bounded by a value that
    does not depend on the size of the input.
        For example:
             accessing any single element in an array takes constant time as only one operation has to be performed to locate it. In a similar manner, finding the minimal value in an array
    sorted in ascending order; it is the first element.


*/   //Constant Time Algorithms – O(1)

public class Constant_Time_Example {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 12, 99, 45};
        int el = arr[2];
        System.out.println (el);
    }


}

