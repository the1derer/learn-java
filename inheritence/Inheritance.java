package inheritence;
// By default, all the data members and F^ns of a paret class available to child class. If they are not private
// Eg:
class Base1 {
    int x;
    int y;

    void show() {
        System.out.println(x);
        System.out.println(y);
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

// Imp Note: Inheritance happens at run times

// Creating a object in child class object doesn't explicity creates a object of parent class.


// Child class object is always treated as parent class object as all parent class things get copied to parent class.

//-------------------------------------------------------------------------
// Now for Private Data members
class Base2 {
    private int x =10;
    
    void show() {
        System.out.println(x);
    }
}

class Child2 extends Base2 {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.show();
        // System.out.println(c2.x); ---> Not allowed
    }
}

//-----------------------------------------------
class Base3 {
    int x = 50;
}

class Child3 extends Base3 {
    int x =20;
    void show() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Child3 c3 = new Child3();
        c3.show();
    }
}
// NOTE:Wherever a parent class and child class both are having same data member, then this concept is known as Data Hinding.

//--------

/* 
    But if we want to give priority to parent class 'x' we use 'super' keyword. eg: `Sysout(super.x)`
    If we try to use `Sysout(super)` i.e. try to print 'super', it will give a compilation error.
    If we usse super without Data Hinding, it will work.
    It means 'super' is always precent implicitly.
*/

/*
    If hinding is not present , we can access parent data member in child class as
    1. Sysout(super.x)
    2. Sysout(x)   ----> direct
    3. Sysout(this.x)   ---> also by this coz 'x' of child class is not present.
*/

// If Hinding is present we can access only by using 'super'.

//------------------------------------------------------------------------

// Data Hinding in MultiLevel inheritance

class Dadaji {
    int x =100;
}

class Base4 extends Dadaji {
    int x =10;
}

class Child4 extends Base4 {
    int x = 1;

    void show() {
        System.out.println(x);
        System.out.println(super.x);  //]--> immidiate parent
        System.out.println(((Dadaji)this).x);
        System.out.println(((Base4)this).x); // equivalant to using super
    }

    public static void main(String[] args) {
        Child4 c4 = new Child4();
        c4.show();
        System.out.println(((Dadaji)c4).x); // this shows that x of 'Dadaji' and 'Base4' calss has been copied into Child4's object.
        System.out.println(((Base4)c4).x);
    }
}

// ---------------------------------------------------------------------------------

// Member F^n in Inheritence

class Base5 {
    void show() {
        System.out.println("Base5");
    }
}

class Child5 extends Base5 {
    void show() {  // <---- Function overriding i.e. parent and child have same function. Priority goes to child. Use super to give priority to parent method
        System.out.println("child");
        super.show(); // ---> For Priority to parent class.
    }

    public static void main(String[] args) {
        Child5 c5 = new Child5();
    }
}

// F^n overriding is made to achive Dynamic binding


//-------------------------------------------------------------------------------------
// Some Rules


// Rule-2
/*
class Base6 {
    void show() {
        System.out.println("Base");
    }
}
class Child6 extends Base6 {
    int show() {  // ---> will give compilation error coz parent and child fn have different return type.
        System.out.println("child");
    }

}
*/

// To correct this return type should have parent child relation, as shown below
class Base7 {
    A show() {
        System.out.println("Base");
        return new A();
    }
}
class Child7 extends Base7 {
     B show() {  // ---> 
        System.out.println("child");
        return new B();
    }
}
class A {}
class B extends A {}

// ------------------------------------------------
// Rule-3: Parent class should return parent class object and child class should return child class object
class Base8 {
    Base8 show() {
        System.out.println("Base");
        return new Base8();
    }
}
class Child8 extends Base8 {
    Child8 show() {  // ---> 
        System.out.println("child");
        return new Child8();
    }
}

// --------------------------------------------------------------
// Rule-4: Effect of modifiers on overriding

// (i) Private --> No overriding, wcan prove using `super.show()` in child class
/*
 * Stronger to weaker:
 * public > protected > default > private
 * can only work with (weaker) parent and (stronger) child
 */


 //----------------------------------------------------------------

 // (ii): Using static modifier
 /* 
  * combination of static and non-static will not work.
  * only static-static combination will work. But it will not be fn overriding but it is fn hinding as it will happen during compile time, instead of fn overriding which happens during runtime
  */

  // --------------------------------------------------------------

  // (iii) Using final modifier
  // If a parent class has made any fn 'final' it can't be overridden by child class.
/*
class Base9 {
    final void show() {
        System.out.println("Base");
    }
}
class Child9 extends Base9 {
    final void show() {  // ---> 
        System.out.println("child");
    }
}
*/
//----------------------------------------------------------

// DYNAMIC BINDING by Fn overriding
class Base10 {
    void show() {
        System.out.println("Base");
    }
}

class Child10 extends Base10 {
    void show() {
        System.out.println("child");
    }

    void display() { // private method of child
        System.out.println("Display");
    }

    public static void main(String[] args) {
        Base10 b = new Child10(); // UPCASTING: Ref. Id of child can be put into Ref. variable of parent class. vice versa is not true.
        b.show();
        // b.display(); ---> ERROR: access of private method of child class is not allowed from the ref. variable of parent class.
    }
}

/*
 * Compile time process: The compiler checks(only checks not binds) for Fn in that class to which Ref variable belongs to
 * Like --> in `b.show()` compiler will check show() Fn in Base10 class
 * 
 * Runtime process: If a child class has overridden any method of parent class then always the child method is called with the child class object. It doesn't matter if Ref. Variable is of parent class or child class.
 */

 // -----------------------------------------------------------------------------------------------------

// DOWNCASTING
class Base11 {
    void show() {
        System.out.println("Base");
    }
}

class Child11 extends Base11 {
    void show() {
        System.out.println("child");
    }

    void display() { // private method of child
        System.out.println("Display");
    }

    public static void main(String[] args) {
        Base11 b = new Child11(); // UPCASTING
        b.show();
        Child11 c = (Child11)b; // DOWNCASTING: The process of getting back the Ref. ID of the child class object from Ref. Varialble of parent class into ref. varialbe of child class.
        c.display();
        // b.display();
    }
}

// ---------------------------------------------------
// Now,

class Base12 {
    int x = 50;

    void show() {
        System.out.println("Base");
    }
}

class Child12 extends Base12 {
    int x =20;

    void show() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Base12 b = new Child12();
        b.show();
        System.out.println(b.x); // always binds to parent class
    }
}

// Inheritance in contructors

/*
 * Java compiler insert 'super()' at every constructor of every child as 1st line of consturctor.
 */

class BB {
    BB(int x) {
        System.out.println(x);
    }
    BB() {System.out.println("default");}
}
class C extends BB {
    // C() {// error as ther is no BB() constructor
    //     System.out.println("C");
    // }
    C(int x) {System.out.println(x);}
}