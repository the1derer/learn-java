package math_class;

/**
 * JavaMath
 */
public class MathClassDemo {
    
    public static void main(String[] args) {

        // Constants
        double d = Math.E;
        double d2 = Math.PI;
        

        /*
         * Basic maths functions
         */
        System.out.println("---Math.abs()---");
        int x = Math.abs(-5); // OP:5 returns absolute value
        double f = Math.abs(-2.5);
        int modOfDifference = Math.abs(10 - 20); // same as |x - y|


        System.out.println("---Math.pow()---");
        System.out.println(Math.pow(5, 2)); // first argument raised to the power of second

        
        System.out.println("---Math.sqrt()---");
        System.out.println(Math.sqrt(25)); // square root


        System.out.println("---Math.max()---");
        System.out.println(Math.max(5, 10)); // returns maximum of two values

        System.out.println(Math.max(2, 2.5));


        System.out.println("---Math.min()---");
        System.out.println(Math.min(5, 10)); // returns minimum between 2 values


        System.out.println("---Math.random()---");
        double random = Math.random(); // return a pseudorandom double > 0.0 & < 1.0
        System.out.println(random);


        System.out.println("---Math.signum()---");
        System.out.println(Math.signum(-5)); // return 1.0 if argument > 0, -1 otherwise.


        System.out.println("---Math.copySign()---");
        System.out.println(Math.copySign(5, -1)); // return the 1st argument with the sign of 2nd argument


        /*----------------------------------------
         * Exponential & Log Funtions
         */
        System.out.println("Exponential and log funtions------------------------");
        System.out.println(Math.exp(1)); // return e^(arg)

        System.out.println(Math.expm1(1)); // returns -1(e^(x)-1)

        System.out.println(Math.log(Math.E)); // returns natural log of argument, here 'Math.E' is exponential constant

        System.out.println(Math.log10(10)); // returns log in base 10

        System.out.println(Math.log1p(Math.E)); // like log() but it adds 1 to the argument ln(1+x)

        /*---------------------------------------
         * 
         */
        System.out.println("Trignomatry----------------------");

        System.out.println(Math.sin(Math.PI/2)); // 'Math.PI' is a constant

        System.out.println(Math.cos(0));

        System.out.println(Math.tan(Math.PI/4));

        /*
         * Math.sinh()
         * Math.cosh()
         * Math.tanh()
         * 
         * 
         * Math.asin()
         * Math.acos()
         * Math.atan()
         * 
         */

        System.out.println(Math.toDegrees(Math.PI)); //returns 180
        System.out.println(Math.toRadians(180)); // returns pi

        /*---------------------------------------
         * Rounding & other fns
         */
        System.out.println(Math.ceil(Math.PI)); // 4
        System.out.println(Math.floor(Math.PI)); // 3


        System.out.println(Math.getExponent(333.3)); // 8 // returns an unbiased exponent of the argument
        System.out.println(Math.getExponent(222.2f)); // 7

        System.out.println(Math.IEEEremainder(5, 2)); // computes division b/w 1st and 2nd argument and returns the reminder

        Math.nextAfter(1.95f, 1);
        Math.nextAfter(1.95f, 2);
        Math.nextUp(1.95f);

        System.out.println(Math.rint(1.49));
        System.out.println(Math.rint(1.5));

        int result = Math.round((1.45f)); // same as above method but returns 'int'
        System.out.println(result);

        System.out.println(Math.scalb(3, 4)); // returns 3*2^4

        System.out.println(Math.hypot(4, 3)); // returns hypotnuse of 2 number


        /*---------------------------------------
         * Methods to prevent overflow
         */
        Math.addExact(100, 5);
        Math.addExact(Integer.MAX_VALUE, 1); // throws arithmatic exception
        // Math.subtractExact()
        /*
         * Math.incrementExact(100); // 101
         * Math.decrementExact(100); // 99
         * 
         * Math.multiplyExact(100, 5)
         * 
         * Math.negateExact(100) // -100
         */

        /*--------------------------------------
         * Math.floorDiv(7, 2) // floor(7/2)
         * Math.modDiv(5,3)
         * 
         * Math.nextDown(3) // 2.9999998
         */
    }
}