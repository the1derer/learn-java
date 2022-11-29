package java_io.bytestream.bytearrayIOStream;

import java.io.*;

public class ByteArrayIOStreamDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("--------ByteArrayOPStream created----------");
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();

        String output = "India is a good country";
        byte ch[] = output.getBytes();

        bOut.write(ch);

        // writing to 1st output
        bOut.writeTo(new FileOutputStream("shubham.txt"));

        // writing to 2nd output
        bOut.writeTo(new FileOutputStream("shubham123.txt"));

        System.out.println(bOut.toString());

        byte z[] = bOut.toByteArray();

        System.out.println("-------ByteArrayIPStream------");
        ByteArrayInputStream fileReader = new ByteArrayInputStream(z);

        int i =0;
        while((i=fileReader.read())!=-1){
            System.out.println((char)i);
        }

    }
}