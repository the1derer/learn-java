package basicsofprogramming.operators.arithmeticoperators.unaryoperators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

        int a = 8;

        // unary increment: +1
        // a++ ==> a = a + 1
        a++;
        System.out.println(a);

        // unary decrement: -1
        // a-- ==> a = a - 1
        a--;
        System.out.println(a);

        // unary increment/decrement operators can be post-increment/decrement(as shown above) or pre-increment/decrement

        ++a;
        System.out.println(a);

        --a;
        System.out.println(a);

        // difference b/w post-increment/decrement and pre-increment/decrement unary operators
        int i = 10;
        System.out.println(i);
        
        System.out.println("---Post-Increment/Decrement: current value is first returned and then value is changed---");
        System.out.println(i++);
        int j = i++;
        System.out.println(j);
        System.out.println(i);
        
        System.out.println();
        System.out.println(i--);
        System.out.println(i);

        System.out.println("---Pre-Increment/Decrement: current value is first changed and then the changed value is returned---");
        System.out.println(++i);
        int k = ++i;
        System.out.println(k);
        System.out.println(i);

        System.out.println();
        System.out.println(--i);
        System.out.println(i);
    }
}
