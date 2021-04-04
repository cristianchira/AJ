package Packages.Package_Example.packages_challenges;

import Packages.Package_Example.packages_challenges.series.Series;

public class Main {

    public static void main(String[] args) {
	    for(int i=0; i <=10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("*****************************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("*****************************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
