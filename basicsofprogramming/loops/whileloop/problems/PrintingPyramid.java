package basicsofprogramming.loops.whileloop.problems;

// For N = 5
//    *  
//   * * 
//  * * *
// * * * * 
//* * * * *

// observation => rules
// code on basis of rules


import java.util.Scanner;

public class PrintingPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int i = 1;
        while (i <= N) {
            int j = 1;
            while (j <= N - i) {
                System.out.print(" ");
                j++;
            }

            j = 1;
            // while (j <= (2 * i - 1)) {
            //     if (j % 2 != 0)
            //         System.out.print("*");
            //     else
            //         System.out.print(" ");

            //     j++;
            // }

            // using even-odd to figure out spaces and star is not elegant as we ca just use '*<space>'
            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            // this loop is redundant as it spaces at last which will not be visible
            // j = 1;
            // while (j <= N - i) {
            //     System.out.print(" ");
            //     j++;
            // }


        //  // combining to one loop
        //  // TODO: getting incorrect answer
        //     while (j <= N - 1) {
        //         if (j <= N - i) {
        //             // System.out.println("if");
        //             System.out.print(" ");
        //         // } else if (j > (N - i) && j <= (N + i - 1)) {
        //         } else {
        //             // System.out.println("elif");
        //             if (j % 2 != 0)
        //                 System.out.print("*");
        //             else
        //                 System.out.print(" ");

        //         // } else {
        //         //     // System.out.println("else");
        //         //     System.out.print(" ");
        //         }

        //         j++;
        //     }

            System.out.println();
            i++;
        }
    }
}
