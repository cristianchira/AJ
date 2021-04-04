package Exceptions.Try_With_Resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Try_With_Resource_Example {
    public static void main(String[] args) {

        //To be auto-closed, a resource must be both declared and initialized inside the try, as shown below:

//        try (PrintWriter writer = new PrintWriter (new File ("test.txt"))) {
//            Scanner scanner = new Scanner (System.in);
//            System.out.println ("Start writing: ");
//            writer.println (scanner.nextLine ());
//
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace ();
//        }

        // ATest.A typical try-catch-finally block

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File ("test.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

         //using an equivalent try-with-resources block:

        try (Scanner scanner1 = new Scanner(new File("test.txt"))) {
            while (scanner1.hasNext()) {
                System.out.println(scanner1.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


    }
}