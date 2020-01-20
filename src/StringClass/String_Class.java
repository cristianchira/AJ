package StringClass;

public class String_Class {
	public static void main(String[] args) {

		String string = "Ma duc la plimbare";
		// substring--------------------------------------------------------------------------------
		String substr = string.substring(2, string.length());
		// System.out.print(substr);
		// METHOD
		// charAt-----------------------------------------------------------------------------
		char charAt = string.charAt(5);
		// System.out.println(charAt);

		// METHOD
		// concat------------------------------------------------------------------------------
		String concat = string.concat(" prin capitala!");
		// System.out.println(concat);

		/*
		 * METHOD
		 * contains(CharSequences)------------------------------------------------------
		 * -- Returns true if and only if this string contains the specified sequence of
		 * char values.
		 */
		boolean contains = string.contains("Ma duc");
		// System.out.println(contains);
		/*
		 * METHOD
		 * getBytes()-------------------------------------------------------------------
		 * ----------------- Encodes this String into a sequence of bytes using the
		 * platform's default charset, storing the result into a new byte array.
		 */
		byte[] charByte = string.getBytes();
		for (byte b : charByte) {
			// System.out.println(b);
		}
		/*
		 * replace(char oldChar, char
		 * newChar)-------------------------------------------- Returns a string
		 * resulting from replacing all occurrences of oldChar in this string with
		 * newChar
		 */
		String replace = string.replace("a", "w");
		// System.out.println(replace);
		/*
		 * toCharArray()----------------------------------------------------------------
		 * -------- Converts this string to a new character array.
		 */
		char[] ch = string.toCharArray();
		// System.out.println(ch);

		/*
		 * valueOf(int
		 * i)-----------------------------------------------------------------------
		 * Returns the string representation of the int argument.
		 */
		String strValueOf = String.valueOf(45);
		// System.out.println(strValueOf);

		/*
		 * subSequence(int beginIndex, int
		 * endIndex)--------------------------------------------------------------
		 * Returns a character sequence that is a subsequence of this sequence.
		 */
		CharSequence charSequence = string.subSequence(4, string.length());
		//System.out.println(charSequence);

	}
}
