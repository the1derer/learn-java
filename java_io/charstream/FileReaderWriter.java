package java_io.charstream;
/*
 * same as FileIOStream of ByteStream
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fWriter = new FileWriter("ducat.txt");
                                            // ("ducat.txt", true); ]-> append mode
                                        // (new File("e:\\f2\\ducat.txt"), true{optional}) // to another location
        String outputString = "India is a good country";
        fWriter.write(outputString); // write the whole string
        char chArray[] = outputString.toCharArray();
        fWriter.write(chArray); // in one go
        for(char ch : chArray) {
            fWriter.write(ch); // one by one
        }
        fWriter.close();

        FileReader fReader = new FileReader("ducat.txt");
        int i=0;
        while((i=fReader.read())!=-1) {
            System.out.print((char)i);
            // System.out.println(i);
        }
        fReader.close();
    }    
}
