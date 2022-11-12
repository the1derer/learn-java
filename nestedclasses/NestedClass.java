package nestedclasses;

/*
 * 4 categories of Nested class
 * a. Static Nested class       ____ 
 * b. Non-Static  Nested class      |
 * c. Local                         |----> Inner Nested class (can't be used withot creating  object of outer class)
 * d. Anonymous                 ____|
 */


// ------------------------------------------


// HOW TO MAKE NESTED CLASSES

// 1. Static and Non-Static nested class

// Static and Non-static nested class are both treated as data members of that class in which they are defined.
// A normal class can't be static only nested class can be static

class Outer1 {
    int x =10;
    static int y=20;

    static class Inner { // here class is static & 'show()' fn is non-static. Making class static doesn't make member fn static automatically.
        void show() {
            // System.out.println(x); // will give compiler error as we can't use non-static without creating object
            System.out.println(y);
        }

        public static void main(String[] args) { // this inner class main can be executed by running `java Outer1$Inner`
            System.out.println("Hello from main");
        }
    }

    public static void main(String[] args) {
        System.out.println(y); // Here we have used 'static' member 'y' without creating object.

        Inner i = new Inner(); // same as static D.M.(data member), we us 'Inner class' directly without object as it is treated as DM of outer class
        // We can create object of Inner class i.e. here Inner class is still DM but is diff. class of DM
        i.show();
    }
}

// Rule: Static nested class can access all the static DM and Static Fn of its outer class(No INheritance occurs)

// --------------------------------
/*
 * Wen compiled separate byte code or separte .class file of nested class
 * 
 * Names of '.class' file
 *  Outer.class ---> '.class' of OUter class
 *  Outer$Inner.class ---> '.class' of inner class
 */


 // using static 