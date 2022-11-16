package javaio.bytestream;

/*
 * This is used to simultaneously read and write data.
 * We achive this by using threads.
 * 
 * First we make PipedIPStream object, then we make PipedOPStream object. Connect both these objects via 'connct()' method
 */

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// TODO: no output
public class PipedIOStream {

    public static void main(String[] args) throws Exception {
        PipedOutputStream pout = new PipedOutputStream();
        PipedInputStream pin = new PipedInputStream();

        pout.connect(pin);

        Thread t1 = new Thread(()-> {
                for(int i =65; i<91; i++) {
                    try {
                        pout.write(i);
                        Thread.sleep(1000);
                    }catch(Exception e) {}
                }
        }); // using lambda to implement runnable 
        
        Thread t2 = new Thread(() -> {
            int z = 0;
            try {
                z = pin.read();

            }catch(Exception e) {}
            System.out.println((char)z);
        }
        );

        t1.start();
        t2.start();
    }
    
}