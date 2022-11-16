package javaio.bytestream;

import java.io.*;

/*
 * PrintStream is a high level class.
 * 
 * System class has 3 static data members:
 * public static PrintStream out = get___()
 *                           err = get___()
 *                           in  = get___()
 */

public class PrintStreamSystemRedirect {
    public static void main(String... s) throws IOException{
        /*
        * setOut and setErr
        */
        FileOutputStream fOut = new FileOutputStream("abc.txt");
        PrintStream ps = new PrintStream(fOut);
        System.setOut(ps); // overrides montor buffer in 'out' to PrintStream ==> goes to file
        System.out.println("hey");
        // same follows to setErr()

        /*----------------------------------------------------
         * redirecting value of println() to file
         */
        FileOutputStream file = new FileOutputStream("pss.txt");
        PrintStream pRedirect = new PrintStream(file);
        pRedirect.println("hello");
        pRedirect.println("hey");
        System.out.println("file created"); // this will also be redirected to "abc.tx" since we have used setOut() to override 'out' of System class
        pRedirect.close();
    }
}

/*---------------------------------------------
 Redirect input steam
 In System class:
 final public static InputStream in = get() ==> InputStream is topmost and abstract class
 int x = System.in.read() => searches for single character in keyboard buffer and returns its ASCII value

 Now, redirecting
 FileIPStream fin = ...("abc.tx")
 System.setIn(fin);
 int x = System.in.read() // reading from file not keyboard


 */
