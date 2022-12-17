package inputoutput.bytestream.printstream;

import java.io.*;

public class PrintStreamSetOutErrDemo {
    public static void main(String... s) throws IOException{

        System.out.println("---------------setOut and setErr-------------");
        FileOutputStream fOut = new FileOutputStream("setOutErrDemo.txt");
        PrintStream ps = new PrintStream(fOut);


        System.out.println("----before using setOut--------");
        System.out.println("hello from out"); // prints "hello" to monitor

        PrintStream psMonitor = System.out; // copying ref. in System.out to `ps1`

        /*
         * In 'System' class 'out' and 'in' are defined as follows:
         * public final static PrintStream out...
         * public final static PrintStream err...
         */
        System.setOut(ps); // overrides monitor buffer in `out` to PrintStream ==> goes to file
        // This means we can change value of `final` variable in Java.

        System.out.println("----after using setOut--------");
        System.out.println("hey from out"); // this will be redirected to 'abc.txt' since we have used setOut() to override `System.out`

        // setErr()
        System.err.println("hello from err"); // goes to monitor
        System.setErr(ps);
        System.err.println("hey from from err");


        //------------Changing value of 'out' back to original------------------
        // System.out = psMonitor; // will give error
        System.setOut(psMonitor);
        psMonitor.println("after changing back, println of psMonitor");
        System.out.println("via actual out");
        
    }
}


