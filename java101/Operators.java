package java101;

public class Operators {
  public static void main(String[] args) {
    int i = 10;
    System.out.println(i++); // adds after the printing
    System.out.println(i);
    System.out.println(++i); // adds before printing

    System.out.println("1 + 2 = " + 1 + 2); // 1+2=12
    System.out.println("1 + 2 = " + (1 + 2)); // 1+2 = 3

    System.out.println(1 + 2 + "abc"); // 3abc
    System.out.println("abc" + 1 + 2); // abc12

    // year % 4 == 0 && year % 100 != 0 || year % 400 == 0 // add paranthesis to make it more understandable
    // ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)

    boolean a = false;
    boolean b = false;
    boolean c = true;
    System.out.println(a == b == c);

    // int x = 5;
    // int y = 10;
    // int z = ++x * y--;


    int x = 10;
    int y = x+++x;
    System.out.println();

    // TODO:  https://introcs.cs.princeton.edu/java/11precedence/
  }
}
