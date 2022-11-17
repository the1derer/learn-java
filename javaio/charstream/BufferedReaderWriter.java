package javaio.charstream;

/*
 * Same as BufferedIOStream
 * 
 * BufferedReader br = new BufferedReader(System.in); ==> will give DataType Mismatch error as BufferedReader only takes Reader class object
 * CharacterStream don't have any stream which is connected to keyboard, so to convert ByteStream to CharacterStream we do as follows:
 *      InputStreamReader(InputStream in)
 *      OutputStreamReader(OutputStream o) 
 */

import java.io.*;

public class BufferedReaderWriter {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        FileWriter fw = new FileWriter("abc11.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(fw);
        String s="";
        while(!s.equals("stop")) {
            s = br.readLine();
            bw.write(s+" "); // will write in same line.
            // pw.println(s); // prints in separate line
            // bw.flush();
        }
        br.close();
        bw.close();
        fw.close();

        FileReader fr = new FileReader("abc11.txt");
        BufferedReader br1 = new BufferedReader(fr);
        String s1 = "";
        while(s1!=null) {
            s1 = br1.readLine();
            if(s1 != null)
                System.out.println(s);
        }
        br1.close();
    }
    
}
