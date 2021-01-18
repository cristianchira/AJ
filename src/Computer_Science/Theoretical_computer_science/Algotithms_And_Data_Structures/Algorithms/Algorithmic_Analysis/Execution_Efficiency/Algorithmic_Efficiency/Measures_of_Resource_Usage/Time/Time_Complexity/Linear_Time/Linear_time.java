package Computer_Science.Theoretical_computer_science.Algotithms_And_Data_Structures.Algorithms.Algorithmic_Analysis.Execution_Efficiency.Algorithmic_Efficiency.Measures_of_Resource_Usage.Time.Time_Complexity.Linear_Time;
/*
                             An algorithm is said to take linear time, or O(n) time

        if its time complexity is O(n). Informally, this means that the running time increases at most linearly with
        the size of the input. More precisely, this means that there is a constant c such that the running time is at
        most cn for every input of size n. For example, a procedure that adds up all elements of a list requires time
        proportional to the length of the list, if the adding time is constant, or, at least, bounded by a constant.


 */

public class Linear_time {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 7, 12, 99, 45};
        foo (arr);
        System.out.println (Math.round (Math.log (16)));
    }

    static void foo(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }
        System.out.println (sum + " " + product);
    }
}
