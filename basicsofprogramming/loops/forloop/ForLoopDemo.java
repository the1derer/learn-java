package basicsofprogramming.loops.forloop;

public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("I am happy");
        }

        for (int i = 0; i < 3; i++, System.out.println("from for-loop definition")) {
            System.out.println("Inside for loop");
        }

        for (int i = 0, j = -1; i < 4 || j < 5; i++, j++) {
            System.out.println(i + " " + j);

        }


        // TODO: Practice every scenarios where one of the conditions is missing
        
        // initialize >1 variables
        // for (int i = 0, j =1, double d = 1; ; i++, j++) { // can't define variable of >1 type
        // }



        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Happy!");
        }

        for (; i < 3;) { // infinite loop
            System.out.println("Happy!");
        }

        for (; i < 3;) { // infinite loop
            System.out.println("Happy!");
            i++; // incrementing here.
        }

        for (int k = 0; ;k++) { // infinite loop
            System.out.println("Happy!");
        }

        // for (int j = 0, i = 0; i < 5 && j < 7; i++, j+= 2) {
            
        // }


        // double d;
        // int i, j;
        // for (i = 0, j = 1, d = 4; ; i++, j++) {
        // }
    }
}
