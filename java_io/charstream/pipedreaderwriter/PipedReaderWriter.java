package java_io.charstream.pipedreaderwriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReaderWriter {
    public static void main(String[] args) throws IOException {
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader();

        pipedWriter.connect(pipedReader);

        Thread threadWrite = new Thread(() -> {
            for(int i = 65; i < 91; i++) {
                try {
                    pipedWriter.write(i);
                    Thread.sleep(1000);
                } catch(Exception e) {e.printStackTrace();}
            }
        });

        Thread threadRead = new Thread(() -> {
            int z = 0;
            for(int i = 65; i < 91; i++) {
                try {
                    z = pipedReader.read();
                } catch(Exception e) {e.printStackTrace();}
                System.out.println((char)z);
            }
        });

        threadWrite.start();
        threadRead.start();
    }
}
