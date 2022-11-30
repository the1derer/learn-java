package java_io.charstream.stream_and_string_tokenizer;

/*
 * Hight level stream.
 * Can take both Character and Byte Stream
 * This StreamToken divides stream into small parts.
 * These  small parts are called tokens.
 * We have to give the 'delimiters'
 * We can give one >=1 delimiters.
 * 
 * Default delimiters: Space, tab, new-line character
 */

import java.io.*;

public class StreamTokenizerDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("StreamTokenDemo.txt");
        InputStreamReader ir = new InputStreamReader(fin);
        StreamTokenizer streamTokenizer = new java.io.StreamTokenizer(ir);

        streamTokenizer.eolIsSignificant(true); // accept or reject new-line character
        streamTokenizer.wordChars(33, 225); // using this we tell the range of ASCII value of character in the Tokens generated
        streamTokenizer.whitespaceChars(0, 32); // using this we give delimiters, '32' is space

        int token =0;
        int count =0;

        while(true) { // infinite loop
            token = streamTokenizer.nextToken();
            if(token == StreamTokenizer.TT_EOF) // TT_EOF => type of token, represents end of file
                break;
            if(token == StreamTokenizer.TT_NUMBER)
                System.out.println(streamTokenizer.nval + " number");
            if(token == StreamTokenizer.TT_WORD)
                System.out.println(streamTokenizer.sval+" word");
            count++;
        }
        System.out.println("no of words in files="+--count); // (--)decrease because it was incremented 1 more

        /*----------------------------------------
         * Converting String to 'Stream Tokens'
         */
        String str = "This is a test, 200 which is simple 50";
        StringReader sr = new StringReader(str); // converts String to stream
        StreamTokenizer sToken = new StreamTokenizer(sr);
        // here since we didn't give delimiter, 'space' will be treated as default

        try {
            while(sToken.nextToken()!=StreamTokenizer.TT_EOF) { // can use static import to directly use 'TT_EOF', 'TT_WORD' etc.
                switch(sToken.ttype) {
                    case StreamTokenizer.TT_WORD:
                        System.out.println("String value:"+ sToken.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Number value: "+sToken.nval);
                        break;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
