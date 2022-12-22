package basicsofprogramming.loops.whileloop;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int c = 0;
        while (c < 5) {
            System.out.println("I am happy");
            c++; // updating loop-control variable
        }

        System.out.println("---in this example instead of comparing we can make use of equality too---");
        c = 0;
        while (c++ != 3) { // updating loop-control variable here only
            System.out.println("I am happy");
        }

        System.out.println("---infinite loop---");
        // Note: where you write infinite loop make sure you are  write loop termination logic.
        while (c != -1) {
            System.out.println(c != -1);
        }

        while(true) {
        }
    }
}
