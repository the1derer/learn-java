package abstraction;

// interfaces are implicityly abstract, so that they can't be instantiated.
// If the interface's methods are not 'static' and 'default' then by default they are 'public' and 'abstract'

// abstract method has to be public in abstract class.
// all methods of inheritence to achive dynamic binding.

// a child class has to override all the abstract method of an interface.


interface My1 {
    void show();    
}
class Temp1 implements My1 { // no need to make this class if we go shorter route
    public void register(My1 M) {
        M.show();
    }
}

class Child implements My1 {
    public void show() {
        System.out.println("show");
    }

    public static void main(String[] args) {

        // long process
        Child c1 = new Child();
        Temp1 t1 = new Temp1();
        t1.register(c1);

        // shorter
        My1 M = new Child();
        M.show();
    }
}

// ----------------------------------------------

// A child class can implement more than one interfaces simultaneously

// If a child class is getting same method from more than 1 interfaces, then has to override that method only once.
// If you want 

// -----------------------------------------------

// One interface can extend another interface
// one interface acan extend more than 1 interaces simultaneously. And here is the situation where java supports multiple inheritance in case of interfaces.
// Eg.

interface My2 { void show();}
interface My3 { void display();}
interface My4 extends My2, My3 { void xyz();}
// Here Child class that implements My4 has to override all 3 methods.

//---------------------------------------------

// Non-Static methods with Body in an interface
interface My5 {
    default void show() {
        System.out.println("My5");
    }
}

/*
 * RULES:
 * If you want to make any non-static method in an interface with body then you have to qulify that method with 'default' keyword.
 * 'default' keyword can only be used withoin a interface.
 */

// Need for non-static methods
class Child5 implements My5 {
    public static void main(String[] args) {
        My5 M = new Child5();
        M.show();
    }
}

class Child6 implements My5 {

    public void show() {
        System.out.println("child");
    }
    public static void main(String[] args) {
        My5 M = new Child6();
        M.show();
    }
}
// if overriden then child, if not overriden then interfaces' method.

//---------------------------
// Now for multiple implements, if a child class is getting same 'default' method form >=1 interfaces, then it is mandatory to override that method. Otherwise compilation error.


//-------------------------------------------------------------------------------------

// STATIC METHODs in Interfaces
interface My7 {
    static void show() {
        System.out.println("My7");
    }
}

class Child7 {// using `class Child7 implements My7` will give compilation error.
    public static void main(String[] args) {
        My7.show(); // Direct access WITHOUT using implementiona
    }
}

// Now since static method are introduces, interfaces can also be executable
interface My8 {
    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}

//----------------------------------------------------------
