package Computer_Science.Theoretical_computer_science.Algotithms_And_Data_Structures.Algorithms.Algorithmic_Analysis.Execution_Efficiency.Algorithmic_Efficiency.Measures_of_Resource_Usage.Time.Time_Complexity.Logarithmic_Time;

/*                               Logarithmic running time  T(n) = O(log n)

        essentially means that the running time grows in proportion to the logarithm of the input size - as an example,
        if 10 items takes at most some amount of time x , and 100 items takes at most, say, 2x , and 10,000 items takes
        at most 4x , then it's looking like an O(log n) time ..

        Specifically, we’ll use the Binary Search algorithm and its logarithmic time complexity – O(log n).
        Algorithms taking logarithmic time are commonly found
            in operations on binary trees or when using binary search.--------------------------------------------------

        The input n grows, the time complexity is O(log n).

            In each iteration, we can see that the relation between: the input and the number of operations is a logarithm:

        2 -> => log(2)  = 1 (number of operations / iteration
        5 -> => log(5)  = 2 (number of operations / iteration
        12 -> => log(12)  = 1 (number of operations / iteration
*/


public class Logarithmic_Time {
    public static void main(String[] args) {

     double logarithmicComplexity = (int) Math.log ( (int) 16);
        System.out.println (Math.round (logarithmicComplexity));
    }


}
