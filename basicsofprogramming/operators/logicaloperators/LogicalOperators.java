package basicsofprogramming.operators.logicaloperators;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logic gates: AND, OR, NOT

        // Logical AND: &&
        // Logical OR: ||
        // Logic NOT: !

        // operands for Logical-Operators

        System.out.println("------Logical AND------");
        // E1 && E2 ==> both E1 and E2 is true then return true else false
        System.out.println((15 > 10) && (88 > 9));
        System.out.println(15 > 10 && 88 < 9); // logical operator has lower priority
        System.out.println(15 < 10 && 88 < 9);

        System.out.println("------Logical OR------");
        // E1 || E2 ==> either/both are true then returns true
        System.out.println((15 > 10) || (88 > 9));
        System.out.println(15 > 10 || 88 < 9);
        System.out.println(15 < 10 || 88 < 9);

        System.out.println("------Logical NOT------");
        // !(E3) ==> inverts the result
        // !(a > b && c < d || e == f)
        System.out.println(15 > 10);
        System.out.println(!(15 > 10) || !(88 > 9));
        System.out.println(15 > 10 || !(88 < 9));
        System.out.println(15 < 10 || !(88 < 9));
    }
}
