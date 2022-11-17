package javaio.charstream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Same as PrintStream class
 * This also contains println() method
 */

import java.io.PrintWriter;
import java.io.FileWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("abc.txt"));
        pw.println("hello");
        pw.println("hey");
        pw.close();
        System.out.println("file created");
    }
}
