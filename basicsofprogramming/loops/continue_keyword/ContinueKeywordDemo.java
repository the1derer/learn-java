package basicsofprogramming.loops.continue_keyword;

/**
 * ContinueKeywordDemo
 */
public class ContinueKeywordDemo {

    public static void main(String[] args) {
        // all the natural nos: 1 to 50 except the multiples of 7
        for (int i = 1; i <= 50; i++) {
            if (i % 7 != 0) {//if (!(i % 7 == 0)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("---Using continue keyword---");

        // continue keyword
        // the control immediately transfers to the next iteration of the loop
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                continue; // everything below `continue` keyword will be skipped and next iteration starts
            }
            System.out.print(i + " ");
        }

        for (int i = 0; i < 4; ) {
            continue;
            // i++; // will give compilation error, unreachable code
        }
    }
}