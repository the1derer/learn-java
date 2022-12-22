package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class PrimeTesting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int cFactor = 0;   
        int i = 1;
        while (i <= N) {
            if (N % i == 0){
                System.out.print(i + " ");
                cFactor++;
            }
            i++;
        }

        System.out.println();

        if (cFactor == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
