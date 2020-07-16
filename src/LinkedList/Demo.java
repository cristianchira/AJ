package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);
        // addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Eydney");

        //  printList(placesToVisit);

        visit(placesToVisit);

    }

    public static void printList(LinkedList<String> linkedList) {

//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(i + ": " + linkedList.get(i));
//        }

        Iterator<String> i = linkedList.iterator();
        System.out.println("We are going to visit:");
        int count = 0;
        while (i.hasNext()) {
            count++;
            System.out.println(count + ": " + i.next());
        }
        System.out.println("==========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //new City should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {
                // move on the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIerator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIerator.next());
            printMenu();
        }
        while (!quit) {
            System.out.println("Enter new key: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    System.out.println("Holiday (Vacantion) is over");
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIerator.hasNext()) {
                            listIerator.next();
                        }
                        goingForward = true;
                    }
                    if (listIerator.hasNext()) {
                        System.out.println("Now visiting " + listIerator.next());
                    } else {
                        System.out.println("Reach the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIerator.hasPrevious()) {
                            listIerator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIerator.hasPrevious()) {
                        System.out.println("Now visiting " + listIerator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printList(cities);
                    break;
                case 4:
                    printMenu();
                    break;
                default:
                    System.out.println("Key " + action + " are not defined yet");
                    break;
            }

        }

    }

    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to the previous city\n" +
                "3 - print cities's list\n" +
                "4 - print menu option");
    }

}

