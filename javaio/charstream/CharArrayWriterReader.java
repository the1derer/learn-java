package javaio.charstream;

/*
 * Connect to multiple locations or devices
 */

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayWriterReader {
    public static void main(String[] args) throws IOException {
        CharArrayWriter fileWriter = new CharArrayWriter();
        String outString = "India is a good country";

        fileWriter.write(outString);
        char ch[] = outString.toCharArray();
        // fileWriter.write(ch)

        fileWriter.writeTo(new FileWriter("abc1.txt"));
        System.out.println(fileWriter.toString());
        char[] z = fileWriter.toCharArray();
        
        CharArrayReader fileReader = new CharArrayReader(z);
        int i =0;
        while((i=fileReader.read())!=-1) {
            System.out.print((char)i);
        }
    }
    
}
