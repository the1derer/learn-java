package javaio.charstream;

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

public class StreamTokenizerEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("abc11.txt");
        InputStreamReader ir = new InputStreamReader(fin);
        StreamTokenizer st = new java.io.StreamTokenizer(ir);

        st.eolIsSignificant(true); // accept or reject new-line character
        st.wordChars(33, 225); // using this we tell the range of ASCII value of character in the Tokens generated
        st.whitespaceChars(0, 32); // using this we give delimiters, '32' is space

        int token =0;
        int count =0;

        while(true) { // infinite loop
            token = st.nextToken();
            if(token == StreamTokenizer.TT_EOF) // TT_EOF => type of token, represnts end of file
                break;
            if(token == StreamTokenizer.TT_NUMBER)
                System.out.println(st.nval + " number");
            if(token == StreamTokenizer.TT_WORD)
                System.out.println(st.sval+" word");
            count++;
        }
        System.out.println("no of words in files="+--count); // (--)decrease because it was incremented 1 more

        /*----------------------------------------
         * Convertin String to 'Stream Tokens'
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
