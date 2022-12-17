package basicsofprogramming.datatypes.overflow;

public class FindSizeOfTypesDemo {
    public static void main(String[] args) {
        /*
         * Note that size of primitive types in Java is always the same. It is not platform
         * dependent. Also, all primitive data types in Java are signed. Java does not support
         * unsigned types.
         */
        System.out.println(Byte.SIZE / 8);
        System.out.println(Short.SIZE / 8);
        System.out.println(Integer.SIZE / 8);
        System.out.println(Long.SIZE / 8);
        System.out.println(Character.SIZE / 8);
        System.out.println(Float.SIZE / 8);
        System.out.println(Double.SIZE / 8);
    }
}
