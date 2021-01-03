package collections.Interfaces.Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Interface {

    public static void main(String[] args) throws InterruptedException {

        // use boolean add(Object obj) method to add elements in the list-----------------------------------------------------------------

        Collection<String> collection = new ArrayList<>();
        collection.add("element1");
        collection.add("element2");
        collection.add("element3");
        // printList(collection);

        // using boolean addAll(Collection c) method---------------------------------------------------------------------------------------

        Collection<String> newColl = new ArrayList<>();
        newColl.add("last");
        newColl.add("elements");
        newColl.add("added");
        boolean added = collection.addAll(newColl);
        if (added) {
            // System.out.println("New elements added: " + newColl);
            // printList(collection);
        } else {
            System.out.println("Elements not added");
        }

        // using void clear() method ------------------------------------------------------------------------------------

//        collection.clear();
//        System.out.println(collection);
//        printList(collection);

        // using boolean contains(Object obj) method---------------------------------------------------------------------

        boolean result = collection.contains("element2");
        // printing the result
        // System.out.println("Is element2 present in the List: " + result);

        // using boolean containsAll(Collection c) method---------------------------------------------------------------

        Collection<String> partial = new ArrayList<>();
        partial.add("element1");
        partial.add("element2");
        boolean resultAll = collection.containsAll(partial);
        // printing the result
        // System.out.println("is collection included: " + resultAll);

        //using boolean equals(Object obj)------------------------------------------------------------------------------

        Collection<String> partial1 = new ArrayList<>();
        partial1.add("element1");
        partial1.add("element2");
//        System.out.println(partial.equals(partial1));

        // using int hashCode()------------------------------------------------------------------------------------------

//        System.out.println("Partial hashcode: " + partial.hashCode());
//        System.out.println("Partial1 hashcode: " + partial1.hashCode());

        // using boolean isEmpty()--------------------------------------------------------------------------------------
        // collection.clear();
//        if (collection.isEmpty()) {
//            System.out.println("Collection is empty");
//        } else {
//            System.out.println("Collections is not empty");
//        }

        // using Iterator iterator()------------------------------------------------------------------------------------

//        Iterator<String> iterator = collection.iterator();
//        System.out.println("Collection's elements are: ");
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }

        // using boolean remove(Object obj)-----------------------------------------------------------------------------

//        if (collection.remove("element11")) {
//            System.out.println();
//            System.out.println("++++++++++++++++++++++++++++++");
//            System.out.println("Element1 was removed");
//            printList(collection);
//        } else {
//            System.out.println();
//            System.out.println("Collections is intact");
//            printList(collection);
//        }

        //using boolean removeAll(Collection c)-------------------------------------------------------------------------

//        if (collection.removeAll(partial)) {
//            System.out.println();
//            System.out.println("++++++++++++++++++++++++++++++");
//            System.out.println("Collection partial was removed");
//            printList(collection);
//        } else {
//            System.out.println();
//            System.out.println("Collections is intact");
//            printList(collection);
//        }

        //using boolean retainAll(Collection c)-------------------------------------------------------------------------

//        if (collection.retainAll(partial)) {
//            System.out.println();
//            System.out.println("++++++++++++++++++++++++++++++");
//            System.out.println("Collection partial was retained");
//            printList(collection);
//        } else {
//            System.out.println();
//            System.out.println("Collections is intact");
//            printList(collection);
//        }

        //using int size()----------------------------------------------------------------------------------------------

//        System.out.println();
//        System.out.println("Collection's size is: " + collection.size());

        // using Object[] toArray()-------------------------------------------------------------------------------------

//        Object[] arr = collection.toArray();
//        Iterator iter = Arrays.stream(arr).iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        // Object[] toArray(Object array[])------------------------------------------------------------------------------

        Object[] arrRetained = collection.toArray(partial.toArray());
        for (Object arr : arrRetained) {
            System.out.println(arr);
        }

    }

    public static void printList(Collection<?> elements) {
        if (!elements.isEmpty()) {
            for (Object element : elements) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("Collection is empty");
        }
    }

}


