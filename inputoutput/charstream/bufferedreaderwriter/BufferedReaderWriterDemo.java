package inputoutput.charstream.bufferedreaderwriter;

/*
 * Same as BufferedIOStream
 */

import java.io.*;

public class BufferedReaderWriterDemo {

    // TODO: not writing in file
    public static void main(String[] args) throws IOException {
        
        InputStreamReader inputStreamReaderKB = new InputStreamReader(System.in);
        BufferedReader bufferedReaderKB = new BufferedReader(inputStreamReaderKB);

        FileWriter fileWriter = new FileWriter("BufferedReaderWriterDemo.txt");

        BufferedWriter bufferedWriterFile = new BufferedWriter(fileWriter);
        PrintWriter printWriterFile = new PrintWriter(fileWriter);

        String readStr = "";
        while(!readStr.equals("stop")) {

            readStr = bufferedReaderKB.readLine();
            
            bufferedWriterFile.write(readStr + " "); // will write in same line.
            bufferedWriterFile.write(readStr);
            // bufferedWriterFile.flush();

            // printWriterFile.println(s); // writes in separate line
        }

        bufferedReaderKB.close();
        bufferedReaderKB.close();
        fileWriter.close();

        //------------------------------------------------------
        FileReader fr = new FileReader("BufferedReaderWriterDemo.txt");
        BufferedReader br1 = new BufferedReader(fr);
        String s1 = "";
        while(s1!=null) {
            s1 = br1.readLine();
            if(s1 != null)
                System.out.println(s1);
        }
        br1.close();
    }
    
}
