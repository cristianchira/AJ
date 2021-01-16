package Comparable_Comparator.Comparator_Multiple_Criteria;

public class Author {

    String firstName;
    String lastName;
    String bookName;

    Author(String first, String last, String book) {
        this.firstName = first;
        this.lastName = last;
        this.bookName = book;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}