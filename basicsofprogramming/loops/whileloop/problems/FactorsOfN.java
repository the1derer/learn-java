package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int i = 1;
        int fCount = 0;
        while (i <= N) {
            if (N % i == 0) {
                System.out.print(i + " ");
                fCount++;
            }
            i++;
        }
        
        System.out.println();

        System.out.printf("No of factors: %d\n", fCount);
    }    
}
