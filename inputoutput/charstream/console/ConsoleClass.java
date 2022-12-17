package inputoutput.charstream.console;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class ConsoleClass {
    /*
     * best way to interact with console coz it is fastest for console based program
     */

    //TODO: Clean code with better spaces, indents and variable names
    public static void main(String[] args) throws IOException {
        Console cs = System.console(); // static method of System class gives 'Console' class

        if(cs!=null) // checks if program is executing in console
            System.out.println("console is available");
        
        System.out.println("enter the line");
        String s1 = cs.readLine();
        System.out.println(s1);
        String s2 = cs.readLine("Enter the name(%d chars):", 5); // use to print and take value simultaneously
        System.out.println(s2);
        System.out.println("Enter the password");
        char[] ch = cs.readPassword();
        char ch1[] = cs.readPassword("Enter the password(%d chars)", 5);
        System.out.println(new String(ch));
        System.out.println(new String(ch1));
        Reader r = cs.reader(); // gives Reader class object
        int x = r.read(); // reads single character
        System.out.println(x);
        PrintWriter pw = cs.writer(); // returns PrintWriter object connected to console
        pw.println("console via PrintWriter"); // prints to console without Sysout
    }
        
}
