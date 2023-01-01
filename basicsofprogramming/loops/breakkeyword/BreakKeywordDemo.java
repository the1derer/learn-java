package basicsofprogramming.loops.breakkeyword;

public class BreakKeywordDemo {
    public static void main(String[] args) {

        int i = 0;
        while (true) {
            System.out.println("I am happy");

            if (i == 3) {
                break;
                // System.out.println("Broken"); // compilation error: unreachable code. It is a design decision by Java compiler developer to give error on encountering unreachable code
            }
        }
    }
}
