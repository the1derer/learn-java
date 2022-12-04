package oops.inheritance.constructors;

public class InheritanceInConstructorsDemo {
    
}

// Inheritance in constructors

/*
 * RULE: Constructors are never inherited.
 */

/*
 * Java compiler insert 'super()' at every constructor of every child as 1st line of constructor.
 */

class BB {
    BB(int x) {
        System.out.println(x);
    }
    BB() {System.out.println("default");}
}
class C extends BB {
    // C() {// error as there is no BB() constructor
    //     System.out.println("C");
    // }
    C(int x) {System.out.println(x);}
}
