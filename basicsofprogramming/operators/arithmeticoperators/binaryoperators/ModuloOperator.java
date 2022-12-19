package basicsofprogramming.operators.arithmeticoperators.binaryoperators;

/**
 * ModuloOperator
 */
public class ModuloOperator {

    public static void main(String[] args) {
        System.out.println("------Modulo operator in detail-------");
        int dividend = 22, divisor = 7;

        // getting reminder without using modulo operator, using equation -> dividend = quotient * divisor + remainder
        int remainderWithoutModulo = dividend - ((dividend/divisor) * divisor);
        System.out.println(remainderWithoutModulo);

        // using modulo operator
        int reminder = dividend % divisor;
        System.out.println("Modulo: " + reminder);

        // just as `/` operator don't divide by 0 in case of % operator too
        try {
            int moduloZero = 10 % 0;  
        } catch(ArithmeticException ae) {
            System.out.println("Don't modulo by zero");
        }

        // TODO: Learn about using modulo operator on float and negatives
        System.out.println("------modulo on decimals(float/double)-----");
        double floatDividend = 19.9, floatDivisor = 6.78;

        System.out.println(floatDividend % floatDivisor);

        System.out.println("------modulo on negatives-----");
    }
}
