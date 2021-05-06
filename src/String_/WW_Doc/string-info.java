package String_.WW_Doc;

/*                                               Strings(immutable class)

    Value of a String lang.classes.Object once created cannot be	modified.
    Any	modification on	a String object	creates	a new String object

                                  Where	are	string values stored in	memory?

    Approach 1:

    In the example	below we are directly referencing a	String	literal.

        String	str1 =	"value";

    This value will be stored	in a:

    	"String	constant pool"	– which	is inside the Heap memory. --------------------------------------------------

    If compiler finds a String literal,it checks if	it	exists	in	the	pool. If it	exists,	it is reused.
          String str5 =	"value";

        In	above example, when	str5 is	created	- the	existing	value	from	String	Constant Pool is reused.

    Approach 2:

        However, if	new	operator is	used to	create	string	object,	the	new	object is created on the heap. There
        will not	be	any	reuse	of	values.
    String lang.classes.Object	- created	on	the	heap

        String val = "value one";
        String val1 = "value one";
            System.out.println (val == val1); //true because val1 reuse val 2
            System.out.println (val.equals (val1)); // true same reason

        String fo = new String("Different object");
        String fo1 = new String("Different object");

            System.out.println (fo == fo1);  // false

            System.out.println (fo.equals (fo1));  // true

             Compares this string to the specified object.  The result is {@code
             true} if and only if the argument is not {@code null} and is a {@code
             String} object that represents the same sequence of characters as this
             object.

                               What	are	differences	between	String and StringBuffer?

     String
         are immutable.
     StringBuffer
         is used to represent values that can be modified.
         In situations where values	are	modified a number to times, StringBuffer yields	significant performance	benefits.
     Both
     	 String	and	StringBuffer are thread-safe.
    StringBuffer is	implemented	by using synchronized keyword on all methods.

                              What are differences between StringBuilder and StringBuffer?

    StringBuilder
    	is	not	thread	safe.
    	So,	it	performs better	in	situations	where thread safety	is	not	required.

*/