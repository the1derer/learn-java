package oops.inheritance.member_functions;


public class ModifiersEffectsDemo {
}

// --------------------------------------------------------------
// Rule-4: Effect of modifiers on overriding
/*
 * Stronger to weaker:
 * public > protected > default > private
 * can only work with (weaker) parent and (stronger) child
 */

//-----------------------------------------------------------------
// (i) Private --> No overriding, we can prove using `super.show()` in child class

class PrivateBase {
    private void show() {
        System.out.println("Base");
    }
}

class PrivateChild extends PrivateBase {
    private void show() {
        System.out.println("child");
        // super.show(); // will give compilation error
    }

    public static void main(String[] args) {
        PrivateChild c1 = new PrivateChild();
        c1.show();
    }
}


 //----------------------------------------------------------------

 // (ii): Using static modifier
 /* 
  * combination of static and non-static will not work.
  * only static-static combination will work. But it will not be fn overriding but it is fn hiding as it will happen during compile time, instead of fn overriding which happens during runtime
  */

  // --------------------------------------------------------------

  // (iii) Using final modifier
  // If a parent class has made any fn 'final' it can't be overridden by child class.

class Base9 {
    final void show() {
        System.out.println("Base");
    }
}
class Child9 extends Base9 {
    // final void show() {  // ---> will give compilation error
    //     System.out.println("child");
    // }
}
