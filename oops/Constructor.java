package oops;

// Constructors doesn't have any return type.
// Constructors in Java, are static by nature.
// They are special static F^n, as this is the only static F^n that uses 'this'.

// Contructors return 'this', see proof using program below
class ConstructorExample1 {

    int salary;
    ConstructorExample1() {
        salary = 15000;
    }

    void show() {
        System.out.println(salary);
    }

    public static void main(String[] args) {
        System.out.println(new ConstructorExample1().salary); // O/P: 15000

        // System.out.println(new ConstructorExample1().show());
    }
}

class ConstructorExample2 {
    int salary;

    ConstructorExample2() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        ConstructorExample2 ce2 = new ConstructorExample2(); // this and below lines have exact same O/P hence proving that constructor gets 'this'
        System.out.println(ce2);
    }
}

// No class can exist without any constructor.
// Rule: If there is no consturctor in a class then one non-parameterised constructor(Default) is inserted into the class by the compiler.
// class ConstructorExample3 { // Compilation of this will give error
//     void show() {
//         System.out.println("show");
//     }

//     ConstructorExample3(int x) { // parameterised constructor
//         System.out.println(x);
//     }

//     public static void main(String[] args) {
//         ConstructorExample3 c3= new ConstructorExample3(); // gives error
//         c3.show();
//     }
// }
/*
 * Above can be corrected by adding a non-parameterised contructor:
 * ConstructorExample3() {
 *   Sysout("default");
 * }
 */

// Note: If you want to initialize the data meember of each object with same values, then always use default constructor, and this concept is known as static initialisation of non-static data members.

// NOTE: Non-static data members can also be initialized at class level
/*
class Temp {
    int x =50;
    int y = 100;

    void show() {
        Sysout(x);
        Sysout(y);
    }

    psvm() {...}
}

After compilation above changes to:-

class Temp{
    int x;
    int y;

    Temp() {
        x=50;
        y=100;
    }
    ...
}

If more consturctors are present, compiler inserts initial values in all constructors
*/

// In Java, Methods can be called at class level
class ClassLevelMethodCall {
    int x = get();

    int get() {
        System.out.println("get");
        return 10;
    }

    ClassLevelMethodCall() {
        System.out.println("constructor");
        System.out.println(x);
    }

    public static void main(String[] args) {
        new ClassLevelMethodCall();
    }
    // O/P:
    // get
    // constructor
    // 10
}

// In Java we can also call methods at class level to initialise the data dethods.
// If data methods is static, method must be static. Same for non-static

class ClassLevelMethodCall1 {
    int x = this.get();

    int get() {
        System.out.println(x + "get");
        return 10;
    }

    ClassLevelMethodCall1() {
        System.out.println(this.x + "constructor");
    }

    public static void main(String[] args) {
        new ClassLevelMethodCall1();
    }
    // O/P:
    // get
    // constructor
    // 10
}

// Dynamic initialisation
// If you want to initialise data members of each object with a diff.- diff. valuew then always use Paremetersided constructors. This is known as Dynamic Initialisation of non-static data members
// Example:
class DynamicInitializtion {
    int x;
    int y;

    DynamicInitializtion(int x, int y) {
        this.x = x;
        this. y = y;
    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        DynamicInitializtion d1 = new DynamicInitializtion(10, 20);
        d1.show();
        DynamicInitializtion d2 = new DynamicInitializtion(1001, 200);
        d2.show();
    }
}

// NOTE: Java doesn't support call by reference(passing address of varable as an argument to F^n)

//-----------------------------------------------------


/*
 * In java we can also make a method with the same name as class name.
 * Java checks with program only that methods which have no return typ, if the method is with new and the method which is after '.' should have a return type.
 */
// Example:
class SameMethodandConstructorName {
    SameMethodandConstructorName() {
        System.out.println("default");
    }

    void SameMethodandConstructorName() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new SameMethodandConstructorName();// OP: default
        new SameMethodandConstructorName().SameMethodandConstructorName(); // OP: default, hello
    }
}

//------------------------------------------------------------------------------

/*
 * COPY CONSTRUCTOR [Parametersid]
 * Copy consturctor is used to create the duplicate copy of some existing object. It's like a photostate machine.
 */
class CopyConstrutor {
    int x;
    int y;

    CopyConstrutor(int x, int y) {
        this.x = x;
        this. y = y;
    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    CopyConstrutor(CopyConstrutor z) { // <--- this is the copy consturctor
        this.x = z.x;
        this.y = z.y;
    }

    public static void main(String[] args) {
        CopyConstrutor c1 = new CopyConstrutor(10, 20);
        c1.show();
        CopyConstrutor c2 = new CopyConstrutor(c1);
        c2.show();
    }
}

// ---------------------------------------------------------------------------------------------

/*
 * Constructor Chainging
 * Calling of one contructructor from another aconsturcotr with respect to a current object is known as constructor chainging.
 */
class ConstructorChaining {
    ConstructorChaining() {
        this(10);
        System.out.println("default");
    }

    ConstructorChaining(int x) {
        this(10, 20);
        System.out.println(x);
    }

    ConstructorChaining(int x, int y) {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        new ConstructorChaining(); // OP: 30, 10, default
    }
}

/*
 * Rules:
 * Whenever you are doing a constructor chainging using 'this()', then it must be the 1st line in any constructor.
 * Whenever you are doing a constructor chainging using a 'this()' there must be at least 1 constructor which is not having a 'this()' as a 1st argument. ---> will make a cycle otherwise
 * Constructor chaining can be achived in any order.
 */

// -------------------------------------------------------------------------------------

// TODO: class ConstructorChaining1 {
//     ConstructorChaining1() {
//         System.out.println("default");
//     }

//     ConstructorChaining1(int x) {
//         this(); // calls the default constructor above
//         System.out.println(x);
//     }

//     ConstructorChaining1(int x, inty) {
//         this(10); // calls the constructor just above
//         /* 
//         *   in the line above we could have written `ConstructorChaining1(10)`, instead of `this(10)`. Why not?
//         *   Because `ConstructorChaining1(10)` could have pointed to any 'ConstructorChaining' named F^n.
//         */
//         System.out.println(x+y);
//     }

//     public static void main(String[] args) {
//         new ConstructorChaining1(10, 20);
//     }
// }

/* 
 * We can also create this chainging when result of one constructor depends on result of another constructor.
 */

// -----------------------------------------------------------

// In-It block

/*
 * In-It block is always executed before every constructor.
 * You can have >1 In-It block in single class. And they are executed in the order in which they are defined in a class
 */

class InitBlock {
    int x;

    {
        x =10; // OR `this.x = 10`
        System.out.println("init block");
    }

    InitBlock() {
        System.out.println(x + " default");
    }

    InitBlock(int x) {
        System.out.println(x + " parameterzided constructor");
    }

    {
        System.out.println("Second init block");
    }

    public static void main(String[] args) {
        new InitBlock();
        new InitBlock(10);
        new InitBlock();
    }

}

/*
 * RULES:
 * 
 * No constructor chaining ---> complete code of 'IN-IT' block is inserted in every constructor as a first line by the compiler.
 * Constructor chaining ---> complete code of 'IN-IT' block is inserted in that constructor as 1st line in which there is no `this()` as a 1st line.
 */

// Note: If you want a common task in every constructor put the  task in 'IN-IT' block