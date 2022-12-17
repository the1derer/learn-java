package basicsofprogramming.datatypes.casting;

public class CastingOverflowPrecedence {
    public static void main(String[] args) {
        int intX = 1000000000;
        int intY = 1000000000;

        // integer overflow will occur here
        int intZ = intX * intY;
        System.out.println(intZ); // O/P: -1486618624

        // trying to solve overflow simply by changing the variable type to 'long' or another datatype will
        // not work as `x * y` is evaluated first and then the resulting `int`(as both 'x' & 'y' are 'int') value is stored in `longZ`.
        // '*' operator has higher precedence than '=' operator
        long longZ = intX * intY;
        System.out.println(longZ); // O/P: -1486618624

        // To overcome this, explicitly type cast to desired type

        /*
         * cast operator (`(type)`)  has higher precedence than '*' operator, so:
         * (long) intX * intY == ((long)intX) * intY
         */
        long explicitlyCastedZ = (long) intX * intY;
        System.out.println(explicitlyCastedZ); // OP: 1000000000000000000

        /* 
         * (long)(intX * intY) will give overflow as it is will be same as writing
         * long longZ = intX * intY;
         */
        long longZ1 = (long)(intX * intY);
        System.out.println("longZ1: " + longZ1);

        // Had 'x' and 'y' been already long we didn't need to typecast
        long longX = 1000000000;
        long longY = 1000000000;

        long Z = longX * longY; // no need to cast
        System.out.println(Z); // OP: 1000000000000000000

        long longIntMultiplyZ = intX * longY; // no need to typecast as largest type is already `long` so compiler will evaluate as `long`
        System.out.println(longIntMultiplyZ); // OP: 1000000000000000000

    }
}
