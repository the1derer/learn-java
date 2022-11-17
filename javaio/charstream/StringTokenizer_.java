package javaio.charstream;

import java.util.StringTokenizer;
import java.io.IOException;

public class StringTokenizer_ {
    
    public static void main(String[] args) {
        String s = "country = india; capital = delhi; country  = japan; capital = tokyo";
        StringTokenizer st = new StringTokenizer(s, ";="); // two delimiters
        while(st.hasMoreTokens()) { // checks if there is more token remaining
            System.out.println(st.nextToken()); // returns String
        }
    }
}
