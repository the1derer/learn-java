package oops.constructor.static_block;
// Need explained(see example blow)

class Temp100 {
    static int x =10; // static initialization of static data member.
}

class Temp101 {
    public static void main(String[] args) {
        System.out.println(Temp100.x);
    }
}

class Temp102 {
    public static void main(String[] args) {
        // System.out.println(Temp.x);
    }
}

//------------------------------------------------------------

// For Dynamic(having diff. values every time) initialisation of static data members.
class StaticDynamicTest {
    static int x;

    static {
        try {
            x = System.in.read(); // this will read in byte
        } catch (Exception e) {System.out.println(e);}
    }
}

class Temp9104 {
    public static void main(String[] args) {
        System.out.println(StaticDynamicTest.x);
        System.out.println(StaticDynamicTest.x);
    }
}

class Temp9105 {
    public static void main(String[] args) {
        System.out.println(StaticDynamicTest.x);
    }
}

// NOTE: 
// Static Block is used to initialise the static data members dynamically
// Static block is always executed at clss loading time i.e. before execution of main fucntion.
// Static block is always executed only once in the life cycle of a class.
// If you want to perform any task only once in the life-cycle of the class, then put the code of that task in a static block.


// Imp. Note:- No class can be executed in Java without main function

//-----------------------------------------------------------------------------------------------

class StaticC {
    static int x;
    static {
        System.out.println("static block");
        try {
            x = System.in.read();
        } catch (Exception e) {}
    }
}

class StaticTest1 {
    public static void main(String[] args) {
        System.out.println(StaticC.x);
    }
}

class StaticTest2 {
    public static void main(String[] args) {
        System.out.println(StaticC.x);
    }
}


//------------------------------------------------------------------------------------------------------

class Temp201 {
    static Demo d;
    static {
        d = new Demo();
    }
}

class Demo {
    void show(int x) {
        System.out.println(x);
    }
}

class Temp202 {
    public static void main(String[] args) {
        Temp201.d.show(10);
        System.out.println(10);
    }
}

// ------------------------------------------------------------------------------

// IMPORTANT: How `System.out.println` combination is made?
// Similar to example above:
// System ---> it is a class
// out ---> It is a static data member of 'System' class and ref. variable of 'PrintStream' class.
// println ---> It is a F^n of 'PrintStream' class.