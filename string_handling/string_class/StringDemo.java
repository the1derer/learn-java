package string_handling.string_class;



// Creating string using 'literal' and 'new'
class StringEx1 {

    public static void main(String[] args) {
        String s1 = "hello";// literal
        String s2 = "hello";

        String s3 = new String("hello");

        if(s1==s2)  System.out.println("s1 s2 same"); // will work as they are in same are for all string literals known as "String Constant Pool"
        if(s1==s3) System.out.println("s1 s3 same"); // will not work as s3 is allocated 'new' memory.

        System.out.println("--------String constructor-----");

        String s1 = new String("hello");
        String s2 = s1.intern(); // links object of SCP to s2, if not present in SCP it will create duplicate in SCP
        String s3 = new String("Hello");
        String s4 = s3.intern();

        System.out.println(s2 == s4);
    }
}


// String Constructors

// 1. Default constructor: String() --> useless as it creates array of zero length.

/*
    * 2. String(string literal) -->  Eg. 
    * String s1 = String("hello") --> will crate 2 objects. ONe is passed in SCP, one goes in heap(created by 'new'). Here s1 will contain referece of one in Heap.
    * But we can pass ref. of object in SCP using intern()
    String s1= new String("hello");
    String s2 = s1.intern()

    s1.equals(s2) ==> True(compares literal values)
    s2 == s1  ==> False (compares reference)
*/

/*
 * 3.
 * a. String(Char ch[]) ---> char []ch = {'d', 'u', 'c', 'a', 't'}; String s = new String(ch);
 * b. String(char ch[], int position, int no. of elemets)  ---> String s = new String(ch, 2, 3); O/P= "cat"
 */

 /*
  * 4.
  * a. String(byte b[])  ----> String s = new String({65, 66, 61, 68})
  * b. String(byte b[], int position, int no. of elements)
  */

// ---------------------------------------------------
// Methods/Operations on String

/*
 * Sting s = "India is a good country."
 * 
 * 1. char ch[] = s.toCharArray();
 * 2. byte b[] = s.getBytes()
 * 3. char charAt(int index)
 * 4. String s1 = s.toUpperCase()
 * 5. String s2 = s.toLowerCase()
 * 6. String s3 = s.trim() ---> removes leading and trailing whitespace.
 * 7. Strnig s4 = s.substring(startIndex) --> return a substring of 's' from 'index' to last position
 *    String s5 = s.substring(startIndex, endIndex)
 * 8. int index = s.indexOf(char) ---> s.indexOf('o') ==> returns 1st positon, return -1 if noot found
 *    int index = s.indexOf(char, startPosition) ==> starts searching from 'startPosition' --> s.indexOf('i', 2)
 *    int indexOfString = s.indexOf(String s) ==> s.indexOf("good")
 *    int indexOfString = s.indexOf(String s, startPosition)
 * 9. Similar to above we have 'lastIndexOf()' which searches from right to left
 * 10. String.valueOf(10)  ---> static method of String class. ===> converts to String
 *      Eg. Sting s = String.valueOf(10)
 *                          .valueOf(2.4)
 *                          .valueOf(true)
 *                          .valueOf('a')
 */


//-----------------------------------------------------------------------------------

// String Concatination

/*
 * 1. Using '+'
 * 2. Using concat()
 *      String s1 = "good".concat("morning")
 * 
 * '+' uses less memory than 'concat()'. '+' can be used between String and any datatype
 */

// ------------------------------------------------------------------------

// String Comparision

/*
 * 1. equals() ==> Object class fn overridden by String class. this compares values of String not the ref. ID.
 * 
 * 
 * Comparable:- INterface of 'lang' package. String has implemented it
 * 
 * 2. compareTo() ==> int z = string1.compareTo(string2)
 * This method will start from frist character of both strings, subtract the ASCII value of 1st character of s2 from s1. If zero moves to next character and so on. If not zero return difference.
 * If diff. is (+)ve ---> string1 > string2
 *             (-)ve ---> string1 < string2
 * 
 * 3. If you want non-case sensitive----> compareToIgnoreCase()
 */

//--------------------------------------------------------------

// String formatting
// String.format()


// Methods of String class

/*
 * 1. concat()
 * 
 * 2. contentEquals() ==> compares a String and StringBuffer object
 *      boolean result = s2.contentEquals(StringBuffer s3);
 * 
 * 3. copyValueOf() ==> copy value from Char array to string
 *      copyValueOf(char[] data) OR copyValueOf(char[] data, offset count)
 * 
 * char[] data = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' }
 * String str = "";
 * str = String.copyValueOf(data)
 * str = String.copyValueOf(data, 2, 6)
 * 
 * 
 * 4. endsWith() ==> checks if a given string ends with desired characters
 * 
 * String str = new String("This is really not immutable!!");
 * boolean retVal = str.endsWith("immutable")
 * 
 * 5. equalsIgnoreCase():
 *          boolean equalsIgnoreCase = "Hello".equals("hello")
 * 
 * 6. getBytes()==> takes String & convert all characters to their ASCII values.
 *      byte[] str2 = "Welcome to tutorial of string".getBytes();
 *      try {
 *              for(bye b: str2) {
 *                  Sysout(str2[i]);
 *              }
 *          } catch(Exception e) {Sysout("Unsupported chararcter set");}
 * 
 *
 * 7. getChars() ==> public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) ==> Copies characters from this string into the destination character-array.
 * 
 *
 * 8. indexOf()==> finds the index of desired character/String in a given String
 *      public int indexOf(int ch)
 *      public int indexOf(int ch, int fromIndex)
 *      public int indexOf(String str)
 *      public int indexOf(String str, int fromIndex)
 * 
 * 9. lastIndexOf() ==> same as 'indexOf()' but searches from right.
 * 
 * 10. replace() ==> replace some character with another character in the entire string
 * 
 * 11. split() ==> splits a string from desired point
 * 
 * 12. startsWith ==> checks if a string starts with a given String.
 *      String str = "Welcome to tutorial of Strings."
 *      boolean startWith = str.startsWith("Welcome")
 *      boolean startWith = str.startsWith("tutorial")
 *      boolean startsWith = str.startsWith("tutorial", 11)
 * 
 * 13. subString ==> creates a substring from a given index position till last unless upper limit is defined
 * 
 * 14. toUpperCase()/toLowerCase()
 * 
 * 15. trim()
 * 
 * 16 valueOf ==> see up
 */