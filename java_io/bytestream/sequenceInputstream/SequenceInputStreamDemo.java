package java_io.bytestream.sequenceInputstream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;

public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
        
        /*
            SequenceInputStream sequenceInputStream = new SequenceInputStream( // use this constructor if you have exactly 2 InputStream
                new FileInputStream("shubham.txt"),
                new FileInputStream("shubham123.txt")
            );
        */

        SequenceInputStream sequenceInputStream = new SequenceInputStream(new MyEnum()); // 2nd constructor if we have >= 2 InputStream

        DataInputStream din = new DataInputStream(sequenceInputStream);

        String str = "";

        while(str != null) {
            str = din.readLine();
            if(str != null) System.out.println(str);
        }

        din.close();
    }
}

class MyEnum implements Enumeration {
    InputStream in[];
    int i = -1;

    MyEnum() {
        try {
            in = new InputStream[] { // create these 3 files first before executing this code
                new FileInputStream("shubham.txt"),
                new FileInputStream("shubham123.txt"),
                new FileInputStream("pss.txt")
            };
            System.out.println("printing in value: " + in);
        } catch(Exception e) {e.printStackTrace(); System.exit(1);}
    }

    @Override
    public boolean hasMoreElements() {
        System.out.println("hasMoreElements");

        return ++i < in.length;
    }

    @Override
    public Object nextElement() {
        System.out.println("next element" + i);
        return in[i];
    }
}
