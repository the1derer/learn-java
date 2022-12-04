package oops.constructor.this_keyword;
class Temp {
    int x =10;

    void show(int y) {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Temp t = new Temp();
        t.show(20);
        // O/P:
        // 10
        // 20
    }
}



// NOTE: Whernver a class level variable and local variable both have smae name then this concept is known as DATA SHADOWING

/**
 * DataShadowing
 */
class DataShadowing {

    int x = 10;

    void show(int x) {
        System.out.println(x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        DataShadowing dShadowing = new DataShadowing();
        dShadowing.show(20); // O/P: 20, 20
        // NOTE: As shown here Priority always goes to Local Variable
    }
}

// Now we want to print (10, 20) using show F^n only

class Temp1 {

    int x = 10;

    void show(int x, Temp1 z) {
        System.out.println(z.x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        Temp1 t1 = new Temp1();
        t1.show(20, t1); // O/P: 10, 20
        System.out.println(t1.x); // O/P: 10
    }
}

/*
 * GOLDEN RULE
 * 
 * 1. The value of Object(value in its box) can only be accessed using '.' of referenceID.
 * 2. Object is neither local, global, privat, public. It always goes in 'Heap'.
 */

class ThisExample {
    int x = 10;

    void show(int y) { // 'this' is passed implicityly like: void show(int y, ThisExample this) 
        System.out.println(x); // 'this' is passed implicitly here like Sysout(this.x)
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisExample tExample = new ThisExample();
        System.out.println(tExample.x); // O/P: 10
        tExample.show(20); // O/P: 10, 20 -- compiler itself passes 'tExample' varialbe in `t.show(20)` and 'this' operator catches the RefID.
    }
}

// RULE: This cannot be used in any static F^n

// ----------------------------------------------------------

class ThisExample1 {
    int x = 10;

    void show(int y) {
        // System.out.println(x);s
        System.out.println(this);
    }

    public static void main(String[] args) {
        ThisExample1 tExample1 = new ThisExample1();
        System.out.println(tExample1); // this and below line gives exact same result proving 'this' contains same object and refrence of current object is passed in 'this'
        tExample1.show(20);         
    }
}

// Rule if you pass 'this' as an argument in any non-static F^n then it must be the first(1st) argument

class ThisExample2 {
    int x = 10;

    void get(ThisExample2 this, int y) {
        System.out.println(this+" get");
        System.out.println(this.x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        ThisExample2 tExample2 = new ThisExample2();
        System.out.println(tExample2+" main");
        tExample2.get(16);
    }
}
