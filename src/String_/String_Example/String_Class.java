package String_.String_Example;

public class String_Class {
    public static void main(String[] args) {

        String string = "Ma duc la plimbare";

        // substring----------------------------------------------------------------------------------------------------
            String substr = string.substring (2, string.length ());
                // System.out.print(substr);

        // charAt ------------------------------------------------------------------------------------------------------
            char charAt = string.charAt (5);
                // System.out.println(charAt);

        // concat ------------------------------------------------------------------------------------------------------
            String concat = string.concat (" prin capitala!");
                // System.out.println(concat);

        // StringBuilder -----------------------------------------------------------------------------------------------
            StringBuilder sBuilder = new StringBuilder("Ieri ").append("am cumparat ").append(45);
                sBuilder.append(" de gogosi!");
                    // System.out.println(sBuilder);

        //StringBuffer--------------------------------------------------------------------------------------------------
            StringBuffer stringBuffer = new StringBuffer("alltype").append(" de gogosi!");
                // System.out.println(stringBuffer);

        // contains(CharSequences)--------------------------------------------------------------------------------------
        //-- Returns true if and only if this string contains the specified sequence of char values.
        boolean contains = string.contains ("Ma duc");
        // System.out.println(contains);


        // getBytes()-------------------------------------------------------------------------------------------------------
        // Encodes this String into a sequence of bytes using the platform's default charset, storing the result into
        // a new byte array.

        byte[] charByte = string.getBytes ();
        for (byte b : charByte) {
            // System.out.println(b);
        }

        // replace(char oldChar, char newChar)--------------------------------------------------------------------------
        // Returns a string resulting from replacing all occurrences of oldChar in this string with  newChar

        String replace = string.replace ("a", "w");
        // System.out.println(replace);

        // toCharArray()------------------------------------------------------------------------------------------------
        // Converts this string to a new character array.

        char[] ch = string.toCharArray ();
        // System.out.println(ch);


        // valueOf(int i) ----------------------------------------------------------------------------------------------
        // Returns the string representation of the int argument.

        String strValueOf = String.valueOf (45);
        // System.out.println(strValueOf);

        // subSequence(int beginIndex, int endIndex)--------------------------------------------------------------
        // Returns a character sequence that is a subsequence of this sequence.

        CharSequence charSequence = string.subSequence (4, string.length ());
        //System.out.println(charSequence);

           // String val = "value one";
           // String val1 = "value one";
            // System.out.println (val == val1); //true because val1 reuse val 2
            //System.out.println (val.equals (val1)); // true same reason

        String fo = new String("Different object");
        String fo1 = new String("Different object");

        System.out.println (fo == fo1);  // false
        System.out.println (fo.hashCode ());
        System.out.println (fo1.hashCode ());
        System.out.println (fo.equals (fo1));  // true
        /**
         * Compares this string to the specified object.  The result is {@code
         * true} if and only if the argument is not {@code null} and is a {@code
         * String} object that represents the same sequence of characters as this
         * object.*/

        //Cast from base 2 to base 10
        Integer	seven	=
                Integer.valueOf("101",	2);
        System.out.println (seven);
    }
}
