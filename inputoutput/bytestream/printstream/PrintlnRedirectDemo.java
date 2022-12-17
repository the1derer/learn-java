package inputoutput.bytestream.printstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintlnRedirectDemo {
    public static void main(String[] args) throws IOException {
        /*----------------------------------------------------
         * redirecting value of println() to file
         */
        FileOutputStream file = new FileOutputStream("printlnRedirect.txt");
        PrintStream pRedirect = new PrintStream(file);

        pRedirect.println("hello");
        pRedirect.println("hey");
        System.out.println("file created");  // goes to console as PrintStream in 'out' still points to console

        pRedirect.close();
    }
}
