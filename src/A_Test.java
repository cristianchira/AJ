import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class A_Test {

    public static void main(String[] args) {

        Collection<Integer> arr = Arrays.asList (44, 59,7, 621, 777, 7, 11, 15);

        Set<Integer> nd = new TreeSet<> (arr);



        System.out.println (nd);

    }

    public static int getFactorial(int n) {
       int f = 1;
        for( int i = 1;i <=n;i++)
    {
        f *= i;
    }
       return f;
}

    public static void ascSorted(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {      //swap elements if not in order
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

}







