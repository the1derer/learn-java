package basicsofprogramming.loops.whileloop.problems;

// TODO: reason for todo written below, don't loop at it before solving again first.

import java.util.Scanner;

public class LCMofTwoNums {
    // On observation found out that:
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(), b = input.nextInt();

        // without using GCD
        // Note: this will also demonstrate use of `break` keyword
        // max(a, b) <= LCM(a, b) <= a * b
        int max, lcm = -1;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        // int j = max; // no need to define separate 'j' just use max
        while (max <= a * b) {
            if ((max % a == 0) && (max % b == 0) && (lcm == -1)) { // TODO: see if you use `lcm == -1` check.(don't remember but understand)
            // we could have avoided `lcm == -1` check if we go in reverse direction of loop
                lcm = max;
            }
            max++;
        }

        System.out.println(lcm);


        // // using GCD
        // // LCM(a, b) = GCD(a, b) * (a / GCD) * (b / GCD) = a * b / gcd
        // int min, gcd = 1;
        // if (a < b) {
        //     min = a;
        // } else {
        //     min = b;
        // }

        // int i = 1;
        // while (i <= min) {
        //     if ((a % i == 0) && (b % i == 0))
        //         gcd = i;
            
        //     i++;
        // }

        // int LCM = (a * b) / gcd;
        // System.out.println(LCM);
    }
}
