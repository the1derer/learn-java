package basicsofprogramming.datatypes.overflow;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class OverflowUnderflowDemo {
    public static void main(String[] args) {

        // Java doesn't allow integer overflow while assigning constant value > MAX_VALUE or
        // constant-value < MIN_VALUE
        // int x = 2147483648; // Integer.MAX_VALUE+1, compilation error
        // int y = -2147483649;
        // int z = 2147483648 * 2147483648;
        // System.out.printf("%d %d %d", x, y, z);

        // But java doesn't check if we are assigning value after performing any operation
        int x = 2147483647;
        int y = 2;
        // here integer overflow will occur
        int z1 = x * y;
        int z2 = x + y;
        System.out.println(z1 + " " + z2);

        System.out.println("-----------integer-wraparound-----------");
        int valueMax = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++, valueMax++) {
            System.out.println(valueMax);
        }

        System.out.println("Subtracting from Integer.MIN_VALUE");

        int valueMin = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++, valueMin--) {
            System.out.println(valueMin);
        }


        // ------------------------------
        byte b1 = 2;
        byte b2 = 100;
        // byte b3 = b1 * b2; // compilation error, possible lossy conversion


        System.out.println("----Handling underflow and overflow-----------");

        System.out.println("Method-1: Use different data type");
        // use `long`(can also overflow, but sufficient in most situations) or `BigInteger`(is not
        // restricted hence shouldn't overflow)
        // NOTE: There is also `BigDecimal` class for decimal values
        BigInteger largeValue = BigInteger.valueOf(Integer.MAX_VALUE);

        // TODO: find out why this gives error
        // IntStream.range(0, 4)
        // .forEach(i -> {
        // System.out.println(largeValue);
        // largeValue = largeValue.add(BigInteger.ONE);
        // });

        for (int i = 0; i < 4; i++) {
            System.out.println(largeValue);
            largeValue = largeValue.add(BigInteger.ONE);
        }

        System.out.println("Method-2: Throw Exception using `Math.addExact()` method");

        int value = Integer.MAX_VALUE - 1;
        for (int i = 0; i < 4; i++) {
            System.out.println(value);
            // value = Math.addExact(value, 1);
        }

        /*
         * In addition to addExact(), `Math` class also provides exact method for all arithmetic
         * operation.
         */

        // There are exact conversion methods, which throw an exception if there is an overflow during the conversion to another data type
        long longValue = 10000000000L;
        int intValue = Math.toIntExact(longValue);


        // TODO: Read about overflow and underflow in non-integer data types: https://www.baeldung.com/java-overflow-underflow#non-integer-data-types

    }
}
