package javaio.bytestream;

/*
 * DataOPStream dout = new DataOPStream(fout/bout); // DataOPStream has a methoid readLine() which reads line by line
 * 
 * we can connect this DataIOStream to keyboard, network to read line from keyboard
 * 
 * write methods:
 * writeInt(int i)
 * writeLong(long l)
 * writeBoolean(boolean b)
 * writeChar(char c)
 * 
 * read methods:
 * int readInt()
 * long readLong()
 * boolean readBoolean()
 * char readChar()
 * 
 * We can use these methods to auto convert byte to desired type.
 */
import java.io.*;

public class DataIOStream {

    public static void main(String[] args) throws IOException {

        FileOutputStream fOut = new FileOutputStream("ducat.txt");
        DataOutputStream dOut = new DataOutputStream(fOut);
        dOut.writeInt(10);
        dOut.writeLong(10l);
        dOut.writeBoolean(true);
        dOut.writeDouble(10.9);
        dOut.close();

        FileInputStream fin = new FileInputStream("ducat.txt");
        DataInputStream din = new DataInputStream(fin);
        int i = din.readInt();
        long l = din.readLong();
        boolean b = din.readBoolean();
        double d = din.readDouble();
        System.out.println(i+" "+l+" "+b+" "+d);


        DataInputStream din1 = new DataInputStream(System.in); // keyboard buffer
        FileOutputStream fout = new FileOutputStream("ducat4.txt");
        PrintStream pout = new PrintStream(fout);
        String s = "";
        while(!s.equals("stop")) { // continues till we don't type "stop"
            s= din1.readLine(); // reading line from keyboard and putting in 's'
            pout.println(s); // writing in file ==> for writing line by line use 'println()' to write in sameline use writeLine()
        }

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
        din1 = new DataInputStream(new FileInputStream("ducat4.txt"));
        while(s!=null) {
            s= din1.readLine();
            if(s!=null)
                System.out.println(s);
        }


        din.close();
        din1.close();
        dout.close();
    }
    
}
