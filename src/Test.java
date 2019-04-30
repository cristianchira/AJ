import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	int e;

	public static void main(String[] args)  {
		
		
		int[] a = { 4, 8, 6, 7,-4,45,95,41,9798 };

		List<Integer> list = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());
		Integer maxim = Arrays.stream(a).max().getAsInt();
		
		int max=a[a.length-1];
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println("Maxim "+ maxim);
	}	

}