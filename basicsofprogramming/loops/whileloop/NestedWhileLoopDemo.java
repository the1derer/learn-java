package basicsofprogramming.loops.whileloop;

public class NestedWhileLoopDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) { // outer loop
            int j = 0;
            while (j < 5) { // inner loop
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}
