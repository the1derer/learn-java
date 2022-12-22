package basicsofprogramming.loops.whileloop.problems;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println("---starting from 1 and multiplying till N---");
        
        long factorial = 1;
        int i = 1;
        while (i <= N) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

        System.out.println("---Starting from N and decreasing till 1---");
        i = N;
        factorial = 1;
        while (i > 0) {
            factorial *= i;
            i--;
        }
        System.out.println(factorial);


        

        /*
         * Note: Even if defined as `long factorial`, it will overflow, 
         */
        System.out.println("---Using BigInteger---");
        BigInteger factorialBInt = BigInteger.valueOf(1);

        i = 1;
        while (i <= N) {
            factorialBInt = factorialBInt.multiply(BigInteger.valueOf(i));
            i++;
        }
        System.out.println(factorialBInt);
    }
}
