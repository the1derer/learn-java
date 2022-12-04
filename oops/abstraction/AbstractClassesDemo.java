package oops.abstraction;

// Not mandatory to have at least 1 abstract method in a abstract class. Example below.
abstract class Base1 {
    int x;
    int y;

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) { // abstract classes can have main
        System.out.println("Hello");
    }
}


class Child1 extends Base1 {
    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.get(10, 20);
        c1.show();
    }
}

// Child class has to override all the abstract method of an abstract class otherwise it has to make
// itself as a abstract too.

// ------------------------------------------------------------------------

// REGISTRATION
// in case of abstraction, a child class has to register itself with a parent class by passing its
// reference to a parent class.
// for registration, a parent class has to provide a method in which child is going to pass their
// reference.


abstract class Base2 {
    int x;
    int y;

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    abstract void display();

    void register(Base2 b) {
        b.display();
    }
}


class Child2 extends Base2 {
    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.register(c2);
    }
}

// We can't make private methods as abstract coz they are copied to child class.
// can't make 'static' method as abstract as ther will be no dynamic binding. Static members are not
// overriden they show fn hiding.
// We can keep a constructor in a abstract call but without 'new'.
