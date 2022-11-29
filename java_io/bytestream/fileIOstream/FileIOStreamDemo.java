package java_io.bytestream.fileIOstream;

import java.io.*;

public class FileIOStreamDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("----------FileOutputStream creation------------");

        FileOutputStream fileWriter1 = new FileOutputStream("./shubham.txt"); // creates file parallel to class file
        // new FileOutPutStream("./shubham.txt", true) // append mode

        // FileOutputStream fileWriter2 = new FileOutputStream(new File("e:\\f2\\lalu.txt"));
        // new FileOutputStream(new File("e:\\f2\\lalu.txt"), true); // append mode

        String output = "India is a good country";
        byte ch[] = output.getBytes(); // since FileOPStream is ByteStream, all data has to be converted to 'byte'
        for(byte b : ch) {
            fileWriter1.write(b);
        }

        fileWriter1.close();

        System.out.println("---------FileInputStream creation-------");
        FileInputStream fileReader = new FileInputStream("shubham.txt");
        // = new FileI/PStream("e:\\f2\\lalu.txt")

        int i =0;
        while((i=fileReader.read())!=-1) {
            System.out.println((char)i);
        }
        fileReader.close();

        
        FileInputStream fileReader2 = new FileInputStream("shubham.txt");
        byte b[] = new byte[fileReader2.available()]; // 'fr.available()' gives size of file in terms of number of bytes
        fileReader2.read(b);
        String input = new String(b);
        System.out.println(input);
        fileReader2.close();
    }
}