package java_io.bytestream.printstream;

import java.io.*;

public class PrintStreamSystemRedirect {
    public static void main(String... s) throws IOException{

        System.out.println("---------------setOut and setErr-------------");
        FileOutputStream fOut = new FileOutputStream("abc.txt");
        PrintStream ps = new PrintStream(fOut);

        System.setOut(ps); // overrides monitor buffer in `out` to PrintStream ==> goes to file

        System.out.println("hey"); // this will be redirected to 'abc.txt' since we have used setOut() to override `System.out`
        // same follows to setErr()

        /*----------------------------------------------------
         * redirecting value of println() to file
         */
        FileOutputStream file = new FileOutputStream("pss.txt");
        PrintStream pRedirect = new PrintStream(file);

        pRedirect.println("hello");
        pRedirect.println("hey");
        System.out.println("file created"); // this will also be redirected to 'abc.txt' since we have used setOut() to override `System.out`

        pRedirect.close();
    }
}


