package util.interfaces.Collection.Collection_Example.Object_toArray;

import java.util.ArrayList;
import java.util.List;

public class Object_toArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("good ");
        list.add("program.");

        Object[] s1 = list.toArray();

        for (Object obj : s1 ) {
            System.out.print(obj);
        }
    }
}
