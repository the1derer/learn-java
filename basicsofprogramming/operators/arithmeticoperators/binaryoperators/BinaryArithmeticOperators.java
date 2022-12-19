package basicsofprogramming.operators.arithmeticoperators.binaryoperators;

public class BinaryArithmeticOperators {
    public static void main(String[] args) {
        
        System.out.println("-------Arithmetic operators----");
         
        // operands
        int x = 10, y = 23;

        int sum = x + y;
        System.out.println("Addition: " + sum);

        int diff = x - y;
        System.out.println("Subtraction: " + diff);

        int product = x * y;
        System.out.println("Multiplication: " + product);

        int quotient = y/x;
        System.out.println("Division: " + quotient);

        System.out.println("-------Division Operator in details-----");

        // if you do division on 2 integers then the O/P will only get the integral part of result(or quotient)
        int m = 22, n = 7;
        System.out.println(m/n); // OP: 3

        // As explained in 'CastOverflowPrecedence.java', `m/n` is evaluated first to `int` then assigned to float variable, so we don't get desired
        float wrongWayToFloat = m / n; // OP: 3.0 

        // if one/both of the operators are float/double then you can get the actual
        float actual1 = (float) m/n; // same as `(float (m)) / n;
        double actual2 = m / (double)n;
        System.out.println(actual1);
        System.out.println(actual2);

        // another way to get actual result is to multiply by 1.0
        double actual3 = (m * 1.0) / n; // result: 3.142857142857143
        System.out.println("Using multiply by 1.0 method: " + actual3);

        double a = 12398.4567, b = 456.123;

        double floatDivision = a/b;
        System.out.println(floatDivision);

        // int intCastedFloatDivision = (int)a/b; // will give error as 'b' is still double and compiler will cast to double
        int intCastedFloatDivision = (int) (a/b);
        System.out.println(intCastedFloatDivision);

        // division by zero
        try {
            int i = 89, j = 0;
            System.out.println(i/j); // ==> ArithmeticException
        } catch(ArithmeticException ae) {
            System.out.println("Don't divide by 0");
        }        
    }
}
