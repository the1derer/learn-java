package java_io.bytestream;

import java.io.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileWriter1 = new FileOutputStream("lallu.txt"); // creates this file parallel to class file
        // new FileOutPutStream("lallu.txt", true) // append mode
        // FileOutputStream fileWriter2 = new FileOutputStream(new File("e:\\f2\\lalu.txt"));
        // new FileOutputStream(new File("e:\\f2\\lalu.txt"), true); // append mode
        String output = "India is a good country";
        byte ch[] = output.getBytes(); // since FileOPStream is ByteStream, all data has to be converted to 'byte'
        for(byte b : ch) {
            fileWriter1.write(b);
        }
        fileWriter1.close();


        FileInputStream fileReader = new FileInputStream("lallu.txt");
        // = new FileI/PStream("e:\\f2\\lalu.txt")
        int i =0;
        while((i=fileReader.read())!=-1) {
            System.out.println((char)i);
        }
        fileReader.close();

        
        FileInputStream fileReader2 = new FileInputStream("lallu.txt");
        byte b[] = new byte[fileReader2.available()]; // 'fr.available()' gives size of file in terms of number of bytes
        fileReader2.read(b);
        String input = new String(b);
        System.out.println(input);
        fileReader2.close();
    }
}

/*
 * While performing any operation on File like counting freq. of characters etc. don't perform directly on file, but instead export file datat to a string and perform operatn on this string. And then override the file. This will make things easier.
 */