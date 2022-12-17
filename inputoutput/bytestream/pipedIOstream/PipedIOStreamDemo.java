package inputoutput.bytestream.pipedIOstream;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedIOStreamDemo {

    public static void main(String[] args) throws Exception {
        PipedOutputStream pout = new PipedOutputStream();
        PipedInputStream pin = new PipedInputStream();

        pout.connect(pin); // connecting threads

        Thread t1 = new Thread(()-> { // anonymous class of `Runnable` interface
                for(int i = 65; i < 91; i++) {
                    try {
                        pout.write(i); // writes ASCII values to buffer
                        Thread.sleep(1000);
                    }catch(Exception e) {e.printStackTrace();}
                }
        }); // using lambda to implement runnable 
        
        Thread t2 = new Thread(() -> {
            int z = 0;
            for(int i = 65; i < 91; i++) {
                try {
                    z = pin.read();
                } catch(Exception e) {e.printStackTrace();}
                System.out.println((char)z);
            }
        }
        );

        t1.start();
        t2.start();
    }
    
}