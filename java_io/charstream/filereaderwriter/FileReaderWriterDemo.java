package java_io.charstream.filereaderwriter;
/*
 * same as FileIOStream of ByteStream
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fWriter = new FileWriter("FileReaderWriterDemo.txt");
                                            // ("FileReaderWriterDemo.txt", true); ]-> append mode
                                        // (new File("e:\\f2\\FileReaderWriterDemo.txt"), true{optional}) // to specific location

        String outputString = "India is a good country";

        System.out.println("-------write the whole string-----------");
        fWriter.write(outputString);

        System.out.println("-------write the char array-----------");
        char chArray[] = outputString.toCharArray();
        fWriter.write(chArray); // in one go

        System.out.println("-------write character by character-----------");
        for(char ch : chArray) {
            fWriter.write(ch); // one char at a time
        }

        fWriter.close();

        FileReader fReader = new FileReader("FileReaderWriterDemo.txt");
        int i=0;
        while((i=fReader.read())!=-1) {
            System.out.print((char)i);
            // System.out.println(i);
        }
        fReader.close();
    }    
}
