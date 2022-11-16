package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * JavaRegEx
 */
public class JavaRegEx {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foo");
        // matcher.find());

        Pattern pattern1 = Pattern.compile("foo");
        Matcher matcher1 = pattern.matcher("foofoo");
        int matches = 0;
        while(matcher.find()) {
            matches++;
        }
        // matches);

        /*---------------------------------------
            Meta Character
         */
        // runTest(".", "foo")); // '.' matches with any charcter
        // runTest("foo.", "foofoo"));

        // The API supports several other meta characters, <([{\^-=$!|]})?*+.>,

        /*----------------------------------------------
         * Character class
         */
        runTest("[abc]", "b"); // 1 --> OR class
        runTest("[abc]", "cab"); // 3 // order doesn't matter
        runTest("[bcr]at", "bat cat rat");

        // NOR class
        runTest("[^abc]", "g");
        runTest("[^bcr]at", "sat mat eat bat aat rat");

        /*-----------------------------------------------
         * Range Class
         */
        runTest("[A-Z]", "Two Uppercase alphabets 34 overall"); // matches ony upper case letter
        runTest("[a-z]", "Two Uppercase alphabets 34 overall"); // matches only lower case letter
        runTest("[a-zA-Z]", "Two Uppercase alphabets 34 overall"); // matches bother upper and lower case
        runTest("[1-5]", "Two Uppercase alphabets 34 overall"); // matching given range of numbers
        runTest("3[0-5]", "Two Uppercase alphabets 34 overall"); // matching another range of numbers
        runTest("3[0-3]", "Two Uppercase alphabets 34 overall"); // 0

        /*------------------------------------------------------------
         * Union class: combining >=2 character class
         */
        runTest("[1-3[7-9]]", "123456789"); // 6

        /*------------------------------------------------------------
         * Intersection class: similar to union, this class results from picking  common elements b/w two or more  
         */
        runTest("[1-6&&[3-9]]", "123456789"); // 4
        runTest("[1-6&&[3-9]]", "0000"); // 0

        /*------------------------------------------------------------
         * Subtraction class: Use subtraction to negate >=1 character classes
         */
        runTest("[0-9&&[^2468]]", "123456789"); // matches a set of odd decimal characters

        /*----------------------------------------------------
         * Predefined character classes
         */
        System.out.println("Predefined Character class");

        runTest("\\d", "123"); // digits
        runTest("\\D", "a6c"); // non-digits ~~ [^0-9]
        runTest("\\s", "a c"); // white space
        runTest("\\S", "a c"); // non-white space
        /*
         * \w --> word, equivalent to [a-zA-Z_0-9]
         * \W --> non-word
         */

        /*----------------------------------------------------
         * Quantifier
         */
        System.out.println("Quantifiers");

        runTest("\\a?", "hi"); // 3 // matches a text 0 or 1 time
        runTest("\\a{0,1}", "hi"); // Java regex API equivalant of above
        runTest("\\a*", "hi"); // to match a text >=0 times, "\\a{0,}" ==> Java RegEx API equivalant
        // "\\a+" or "\a{1,}" ==> matches >=1
        runTest("a{3}", "aaaaaa"); //2 ==> matches when 'a' comes 3 times in a row
        runTest("a{2,3}", "aaaa"); //1 // greedy
        runTest("a{2,3}?", "aaaa"); // 2 //lazy

        /* ------------------------------------------------------
         * TODO: Capturing Goups : treat multiple charaters as a single unit
         */
        System.out.println("Capturing groups");
        runTest("(\\d\\d)", "12"); // 1
        runTest("(\\d\\d)", "1212"); // 2
        runTest("(\\d){2,6}", "121212"); // 1

        // TODO
        runTest("(\\d\\d)\\1", "1212"); // 1 ==>
        runTest("(\\d\\d)(\\d\\d)", "1212"); // 1
        runTest("(\\d\\d)\\1\\1\\1", "12121212"); // 1
        runTest("(\\d\\d)\\1", "1213"); // > 0

        /*-----------------------------------------------------------
         * Boundry Matchers
         */
        System.out.println("Boundry Matchers");

        runTest("^dog", "dogs are friendly");// true only if found at beginning
        runTest("^dog", "are dogs are friendly?");

        runTest("dog$", "Man's best friend is a dog"); // true only if found at the last
        runTest("dog$", "is a dog man's best friend?");

        runTest("\\bdog\\b", "a dog is friendly"); // true only if found at a word boundry
        runTest("\\bdog\\b", "dog is man's best friend"); // empty  string at ethe beginning of a line is also a word boundry

        runTest("\\bdog\\b", "snoop dogg is a rapper");//gives flase
        runTest("\\bdog\\B", "snoop dogg is a rapper");// true since \B = ^(\b)

        /*--------------------------------------------------------------
         * Patter.compile(regex, flags)
         */


    }

    public static void runTest(String regex, String text) {
        Pattern patter = Pattern.compile(regex);
        Matcher matcher = patter.matcher(text);
        int matches = 0;
        while(matcher.find()) {
            matches++;
        }
        System.out.println(matches);
    }
    
}