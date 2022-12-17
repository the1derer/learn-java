package basicsofprogramming.datatypes.precision;

public class FloatPrecisionDemo {
    public static void main(String[] args) {

        float floatVariable = 1.123456789f;
        System.out.printf("%f \n", floatVariable); // OP: 1.123457, only 6 digits after decimal, so float has precision of 6

        System.out.println("--------range of `float`--------");
        System.out.println("Size of float(in bytes): " + Float.SIZE/8);
        System.out.println("Min value: " + Float.MIN_VALUE);
        System.out.println("Max value: " + Float.MAX_VALUE);


        System.out.println("--------range of `double`--------");
        System.out.println("Size of double(in bytes): " + Double.SIZE/8);
        System.out.println("Min value: " + Double.MIN_VALUE);
        System.out.println("Max value: " + Double.MAX_VALUE);
        
        System.out.println("--------Precision--------");
        double doubleVariable = 1.123456789;
        System.out.printf("%f \n", doubleVariable);
    }
}
