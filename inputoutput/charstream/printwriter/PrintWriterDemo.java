package inputoutput.charstream.printwriter;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Same as PrintStream class
 * This also contains println() method
 */

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("PrintWriterDemo.txt")); // connect to file

        pw.println("hello");
        pw.println("hey");

        pw.close();

        System.out.println("file created");
    }
}
