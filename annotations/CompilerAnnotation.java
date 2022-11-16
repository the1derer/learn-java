package annotations;

// Annotations provide data about a program that is not part of the program itself. They have no direct effect on the operation of the code they annotate.

// Annotations used by Compiler

/*
 * 1. @Deprecated and @SuppressWarning
 */

import java.lang.annotation.*;

class DeprecatedAndSuppressWarning {

    @Deprecated
    static void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {
        new DeprecatedAndSuppressWarning().doSomeTestNow();
    }

    public void doSomeTestNow() {

        @SuppressWarnings({"unchecked", "deprecated"})
        display();
    }
}


// @Override

class Base {
    void show(int x[]){}
}

class Child extends Base {

    @Override
    void show(int z[]) {
        System.out.println("child show");
    }

    /* below will give error as there is now show(int z) fn in parent class to override.
    @Override
    void show(int z) {

    }
    */
}
