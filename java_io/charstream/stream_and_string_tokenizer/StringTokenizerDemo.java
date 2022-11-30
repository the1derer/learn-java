package java_io.charstream.stream_and_string_tokenizer;

/*
 * Tokenizing strings **without** converting to Stream.
 */

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    
    public static void main(String[] args) {
        String s = "country = india; capital = delhi; country  = japan; capital = tokyo";

        StringTokenizer st = new StringTokenizer(s, ";="); // two delimiters
        // StringTokenizer st = = new StringTokenizer(s, ","); // one delimiter
        
        while(st.hasMoreTokens()) { // checks if there is more token remaining
            System.out.println(st.nextToken()); // returns String
        }
    }
}
