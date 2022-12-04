package oops.encapsulation;
public class StaticDataMembersandMethods {

  static String companyName = "tcs";
  // using static variables we can same memovry because these are loaded only once at load time of class.
  // static goes to class information area.

  // keep those properties of an objects as a static data member of a class, whose values are same for each object.
  // all the static members get memory at class loading time that means befor the execution o fmain function.
  // all the static data members get the memory only once in the life cycle of class

  /*
  * Here the memory is wasted in crating instance as the function does not use value of instance
  int add(int x, int y) {
    return x+y;
  }
  psvm() {
    Class c1  = new class();
    int z = e.add(10, 20);
    Sysout(z);
  }
  */
  static int add(int x, int y) {
    return x+y;
  }


  public static void main(String[] args) {
    // since static data members are constructed before the creation of object so they don't need object and are not connected to ojbect and can be use without creation of object
    System.out.println(companyName);
    System.out.println(StaticDataMembersandMethods.companyName); // NOTE: Static DataMembers are properties of class in 'Java' and should be accesssed by using class name


    int z = StaticDataMembersandMethods.add(10, 20);
    System.out.println(z);
  }

  // NOTE: NEVER use static things of a class via objects.
}

/*
 * NOTE: Why main function is kept as public, static and void?
 * 1. public---> coz it is called from outside
 * 2. static ---> coz it is not doing any task related to an object
 * 3. void ---> Not returning any value to JVM.
 */

// RULE: INstance data members & F^n of a class can't be used directly into the static F^n of same class, but they can be used after creating the object in static function
// Static things of a class be used dirctly in any F^n of the same class.