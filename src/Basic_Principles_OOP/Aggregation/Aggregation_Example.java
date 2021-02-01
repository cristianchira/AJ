package Basic_Principles_OOP.Aggregation;

public class Aggregation_Example {

    static class Publisher {

        String name;
        String publisherID;
        String city;

        Publisher(String name, String publisherID, String city) {
            this.name = name;
            this.publisherID = publisherID;
            this.city = city;
        }
    }

    static class Author {

        String authorName;
        int age;
        String place;

        // Author class constructor
        Author(String name, int age, String place) {
            this.authorName = name;
            this.age = age;
            this.place = place;
        }

        public void getSignature() {
            System.out.println ("Get : " + this.authorName + "'s signature ");
        }
    }

    static class Book {
        String name;
        int price;
        // author details
        private Author author;
        private Publisher publisher;

        Book(String n, int p, Author author, Publisher publisher) {
            this.name = n;
            this.price = p;
            this.author = author;
            this.publisher = publisher;
        }

        public static void main(String[] args) {
            Publisher publisher = new Publisher ("Sun Publication", "JDSR-III4", "LA");
            Author author = new Author ("John", 42, "USA");
            Book b = new Book ("Java for Beginners", 800, author, publisher);
            System.out.println ("Book Name: " + b.name);
            System.out.println ("Book Price: " + b.price);
            System.out.println ("------------Author Details----------");
            System.out.println ("Author Name: " + b.author.authorName);
            System.out.println ("Author Age: " + b.author.age);
            System.out.println ("Author place: " + b.author.place);
            System.out.println ("------------Publisher Details-------");
            System.out.println ("Publisher Name: " + b.publisher.name);
            System.out.println ("Publisher ID: " + b.publisher.publisherID);
            System.out.println ("Publisher City: " + b.publisher.city);
            b.author.getSignature ();
        }

    }
}
