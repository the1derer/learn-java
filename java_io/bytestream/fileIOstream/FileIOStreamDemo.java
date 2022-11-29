package java_io.bytestream.fileIOstream;

import java.io.*;

public class FileIOStreamDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("----------FileOutputStream creation------------");

        FileOutputStream fileWriter1 = new FileOutputStream("java_io/bytestream/fileIOstream/shubham.txt"); // creates file relative to where you are executing your program
        // ... = new FileOutPutStream("java_io/bytestream/fileIOstream/shubham.txt", true) // append mode

        //Windows
        // FileOutputStream fileWriter2 = new FileOutputStream(new File("e:\\f2\\lalu.txt")); 
        // new FileOutputStream(new File("e:\\f2\\lalu.txt"), true); // append mode

        String outStr= "India is a good country";
        byte[] outByteArr= outStr.getBytes(); // since FileOPStream is ByteStream, all data has to be converted to 'byte'
        for(byte b : outByteArr) {
            fileWriter1.write(b);
        }

        fileWriter1.close();

        System.out.println("---------FileInputStream creation-------");

        System.out.println("-----Reading bytes one by one------");
        FileInputStream fileReader = new FileInputStream("java_io/bytestream/fileIOstream/shubham.txt");
        // = new FileI/PStream("e:\\f2\\lalu.txt")

        int i =0;
        while((i=fileReader.read())!=-1) {
            System.out.println((char)i);
        }
        fileReader.close();

        System.out.println("-------Reading bytes all at once------");
        FileInputStream fileReader2 = new FileInputStream("java_io/bytestream/fileIOstream/shubham.txt");
        byte b[] = new byte[fileReader2.available()]; // `fr.available()` gives size of file in terms of number of bytes
        fileReader2.read(b);
        String input = new String(b);
        System.out.println(input);
        fileReader2.close();
    }
}