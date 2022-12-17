package inputoutput.bytestream.dataIOstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStreamFlushAndUTFDemo {
    public static void main(String[] args) throws IOException {

        DataInputStream dinKb = new DataInputStream(System.in); // keyboard buffer

        FileOutputStream fout = new FileOutputStream("DataIOFlushDemo.txt");
        DataOutputStream dout = new DataOutputStream(fout);

        String str =""; 
        while(!str.equals("stop")) {
            str = dinKb.readLine();
            System.out.println(str);
            // dout.writeChars(str); // write single string without space
            dout.writeUTF(str); // and .writeBytes(str); ==> unicode text format writes in encrypted form in file, can be accessed by readUTF()
            dout.flush(); // without flush() we can't write
        }
        
        dinKb.close();
        dout.close();
        fout.close();
    }
}
