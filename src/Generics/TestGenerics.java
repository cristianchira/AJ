package Generics;

import stuff.GenericInterface;

import java.util.ArrayList;

public class TestGenerics {

    static int f = new Integer(544);
    static int g = new Integer("485");
    int h = Integer.valueOf(888);

    public TestGenerics(int h) {
        this.h = h;
    }

    public static void main(String[] args) {
        GenericInterface<String, Integer> gi = new GenericInterface<>();
        Integer sInteger = 55;
        gi.gm("jhsdc", sInteger);

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubles(items);
    }

    private static void printDoubles(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println( i * 2);
        }
    }

}
