package strings;

public class CharAndByteArrayDemo {
    public static void main(String[] args) {
        char[] cArr = new char[10];

        cArr[0] = 'H';
        cArr[1] = 'E';
        cArr[2] = 'L';
        cArr[3] = 'L';
        cArr[9] = 'O';

        char c = '\u0000'; // represents null character

        for (int i = 0; i < 10 && cArr[i] != '\u0000'; i++) {
            System.out.print(cArr[i]);
        }

        System.out.println();

        char[] cArr2 = {'H', 'E', 'L', 'L', 'O', '\u0000', 'W', 'O'};
        for (int i = 0;cArr2[i] != '\u0000'; i++) {
            System.out.print(cArr2[i]);
        }

        char[] cArr3 = new char[100];
        // cArr = "Hello world!" // compilation error, don't work as c/c++

    }
}
