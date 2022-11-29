package java_io.bytestream.dataIOstream;

import java.io.*;

public class DataIOStreamDemo {

    public static void main(String[] args) throws IOException {

        System.out.println("---------DataOPStream-------");
        FileOutputStream fOut = new FileOutputStream("shubham.txt");
        DataOutputStream dOut = new DataOutputStream(fOut);

        dOut.writeInt(10);
        dOut.writeLong(10l);
        dOut.writeBoolean(true);
        dOut.writeDouble(10.9);

        dOut.close();


        System.out.println("------------DataIOStream(reading from file)---------");
        FileInputStream fin = new FileInputStream("shubham.txt");
        DataInputStream dinFile = new DataInputStream(fin);

        int i = dinFile.readInt();
        long l = dinFile.readLong();
        boolean b = dinFile.readBoolean();
        double d = dinFile.readDouble();
        System.out.println(i + " " + l + " " + b + " " + d);


        System.out.println("------------DataIOStream(reading from keyboard)---------");
        DataInputStream dinKb = new DataInputStream(System.in); // keyboard buffer

        FileOutputStream fout = new FileOutputStream("shubham123.txt");
        PrintStream pout = new PrintStream(fout);

        String readStr = "";
        while(!readStr.equals("stop")) { // continues till we type "stop"
            /* deprecated */ readStr = dinKb.readLine(); // reading line from keyboard and putting in 's'
            pout.println(readStr); // writing in file ==> for writing line by line use `println()`, to write in same line use `writeLine()`
        }

        
        //-------------------------------------
        /*
        DataOutputStream dout = new DataOutputStream(fout);

        s=""; 
        while(!s.equals("stop")) {
            s = din1.readLine();
            System.out.println(s);
            dout.writeChars(s); // write all in same line
            //  .writeUTF(s) and .writeBytes(s) ==> unicodetext format writes in encrypted form in file, can be accessed by readUTF()
            dout.flush(); // without flush() we can't write
        }

        s = "";
        dinKb = new DataInputStream(new FileInputStream("ducat4.txt"));
        while(s!=null) {
            s= dinKb.readLine();
            if(s!=null)
                System.out.println(s);
        }
        */


        dinFile.close();
        dinKb.close();
        // dout.close();
    }
    
}
