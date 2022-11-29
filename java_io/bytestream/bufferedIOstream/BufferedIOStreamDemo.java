package java_io.bytestream.bufferedIOstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIOStreamDemo {
    public static void main(String[] args) {
        String srcFile = "shubham.txt";

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile))) { // autoclose `try`

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
