package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value wan not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was 3, 4 5");
                break;
            default:
                System.out.println("Value wan not 1 or 2");
                break;
        }

        char charValue = 'E';

        switch (charValue) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found " + charValue);
                break;
            default:
                System.out.println("Didn't found any value of A,B,C,D,E");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("June");
                break;
            default:
                System.out.println("Irrelevant");
                break;
        }

    }
}

