package comparation.comparator;

public class Author {

	  String firstName;
	  String lastName;
	  String bookName;
	  Author(String first, String last, String book){
		this.firstName = first;
		this.lastName = last;
		this.bookName = book;
	  }
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
		
	
	 /* @Override
	  
	   * This is where we write the logic to sort. This method sort 
	   * automatically by the first name in case that the last name is 
	   * the same.
	   
	  public int compareTo(Author au){
	      
	      * Sorting by last name. compareTo should return < 0 if this(keyword) 
	      * is supposed to be less than au, > 0 if this is supposed to be 
	      * greater than object au and 0 if they are supposed to be equal.
	      
	     int last = this.lastName.compareTo(au.lastName);
	     //Sorting by first name if last name is same d
	     return last == 0 ? this.firstName.compareTo(au.firstName) : last;
	  }*/
	  
	  
	}