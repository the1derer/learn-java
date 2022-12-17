package basicsofprogramming.datatypes.casting;

public class TypePromotionDemo {
    /*
     * Instructions: uncomment fns one-by-one and see which if `show(b)` binds to that fns in absence of `show(byte b)`
     */

    // static void show( byte b) {
    // System.out.println("this is a byte");
    // }

    static void show(short s) {
    System.out.println("this is a short");
    }

    // static void show(int x) {
    // System.out.println("this is a int");
    // }

    // static void show(long l) {
    //     System.out.println("this is a long");
    // }

    public static void main(String[] args) {

        // java introduced the concept of Type-Promotion in Implicit TypeCastingPromotion of
        // variable/constant to upper data type in absence of default data type
        // NOTE: It doesn't do TypeDemotion
        byte b = 10;
        show(b);

    }
}
