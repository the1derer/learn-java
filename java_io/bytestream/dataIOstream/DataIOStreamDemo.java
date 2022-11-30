package java_io.bytestream.dataIOstream;

import java.io.*;

public class DataIOStreamDemo {

    public static void main(String[] args) throws IOException {

        System.out.println("---------DataOPStream-------");
        FileOutputStream fOut = new FileOutputStream("DataIOStreamFileDemo.txt");
        DataOutputStream dOut = new DataOutputStream(fOut);

        dOut.writeInt(10);
        dOut.writeLong(10l);
        dOut.writeBoolean(true);
        dOut.writeDouble(10.9);

        dOut.close();


        System.out.println("------------DataIOStream(reading from file)---------");
        FileInputStream fin = new FileInputStream("DataIOStreamFileDemo.txt");
        DataInputStream dinFile = new DataInputStream(fin);

        int i = dinFile.readInt();
        long l = dinFile.readLong();
        boolean b = dinFile.readBoolean();
        double d = dinFile.readDouble();
        System.out.println(i + " " + l + " " + b + " " + d);


        System.out.println("------------DataIOStream(reading from keyboard)---------");
        DataInputStream dinKb = new DataInputStream(System.in); // keyboard buffer

        FileOutputStream fout = new FileOutputStream("DataInputStreamKeyboardDemo.txt");
        PrintStream pout = new PrintStream(fout);

        String readStr = "";
        while(!readStr.equals("stop")) { // continues till we type "stop"
            /* deprecated */ readStr = dinKb.readLine(); // reading line from keyboard and putting in 's'
            pout.println(readStr); // writing in file ==> for writing line by line use `println()`, to write in same line use `print()`
        }


        System.out.println("---------------Reading data from File line-by-line-------------");
        String s = "";
        dinKb = new DataInputStream(new FileInputStream("DataIPStreamLineReadDemo.txt"));
        while(s!=null) {
            s= dinKb.readLine();
            if(s!=null)
                System.out.println(s);
        }

        dinFile.close();
        dinKb.close();
    }
    
}
