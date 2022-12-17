package inputoutput.charstream.chararrayreaderwriter;

/*
 * Same as 'ByteArrayIOStream' of ByteStream, i.e. connect to multiple locations or devices
 */

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayWriterReaderDemo {
    public static void main(String[] args) throws IOException {

        CharArrayWriter charArrayWriter = new CharArrayWriter();

        String outString = "India is a good country";

        char outCharArr[] = outString.toCharArray();

        charArrayWriter.write(outCharArr);
        charArrayWriter.write(outString);

        charArrayWriter.writeTo(new FileWriter("CharArrayWriterReaderDemo.txt"));

        System.out.println(charArrayWriter.toString());

        char[] charArray = charArrayWriter.toCharArray();
        

        // Reading file
        CharArrayReader charArrayReader = new CharArrayReader(charArray);
        int i = 0;
        while((i = charArrayReader.read()) != -1) { // since here 1st we converted char to byte & then byte to char it is useless to use 'CharArrayReader'
            System.out.print((char)i);
        }
    }
    
}
