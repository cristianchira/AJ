package Comparable_Comparator.Comparator_Multiple_Criteria;

public class Author {

    String firstName;
    String lastName;
    String bookName;
    int pageNumber;

    Author(String first, String last, String book, int pageNumber) {
        this.firstName = first;
        this.lastName = last;
        this.bookName = book;
        this.pageNumber = pageNumber;
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

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}