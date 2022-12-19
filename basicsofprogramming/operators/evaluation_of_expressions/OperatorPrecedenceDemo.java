package basicsofprogramming.operators.evaluation_of_expressions;

public class OperatorPrecedenceDemo {
  public static void main(String[] args) {

    // Operation precedence might vary by language and platform

    // (*, /, %) > (+ , -)

    System.out.println(5 + 3 % 4); // `%` > `+`
    // if we want to perform `+` before `%`
    System.out.println((5 + 3) % 4);

    System.out.println("----Associativity in case of same precedence-----");
    // (*, /, %, +, -) | Associativity: L -> R
    System.out.println(5 * 4 / 3); // == (5 * 4) / 3



    System.out.println(5 + 9 % 4 * 3 - 2 + 6 /4);

    // (post ++, --)[L->R] > (pre ++, --)[R->L] > (*,-, *, /, %)

    int y1;

    /*
     * NOTE: Brackets are our biggest helpers.
     * If we use brackets in correct and intended manner, we don't have to remember all the precedence
     */

    // `+` operator in string concatenation
    System.out.println("1 + 2 = " + 1 + 2); // 1+2=12
    System.out.println("1 + 2 = " + (1 + 2)); // 1+2 = 3

    System.out.println(1 + 2 + "abc"); // 3abc
    System.out.println("abc" + 1 + 2); // abc12

    // year % 4 == 0 && year % 100 != 0 || year % 400 == 0 // add parenthesis to make it more understandable
    // ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)

    boolean a = false;
    boolean b = false;
    boolean c = true;
    System.out.println(a == b == c);

    // Example taken from: https://introcs.cs.princeton.edu/java/11precedence/
    int x = 5;
    int y = 10;
    int z = ++x * y--;
    System.out.println(x + " " + y + " " + z);

    int a1 = 5;
    int b1 = ++a1 * --a1;
    System.out.println(a1 + " " + b1);

    int y11 = 4;
    int x11 = y11++ * ++y11;
    System.out.println(y11 + " " + x11);


    int m = 10;
    int n = m+++m;
    System.out.println(n + " " + m);

    // int x = 10;
    // ++++x; // will give error as it will be evaluated as ``
  }
}
