package javaio.bytestream;

/*
 * To increase performance 'BufferedIOStream' class is used which is ahight level stream. That means it connects to other stream which enables our program program to take multiple bytes.
 * 
 * If we give size in BufferedIOStream it brinds data of 'size' in one go. If we don't give size it brinds defult data size in one go.
 * 
 * Low level Stream: connects directly to IO device
 * High level "     : connects to other streams. These are also known as 'Filtered' Stream.
 */

/*
 * FileOutputStream fout = new FileOPSteam("abc.txt");
 * BufferedOPStream bout = new BufferedOPStream(fout);
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIOStream {
    public static void main(String[] args) {
        String srcFile = "lallu.txt";
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile))) {
            // Read one byte at a time and display
            byte byteData;
            while((byteData=(byte)bis.read())!=-1) {
                System.out.println((char)byteData);
            }

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
