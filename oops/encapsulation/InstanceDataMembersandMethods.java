package oops.encapsulation;
public class InstanceDataMembersandMethods {
  
  // If a data member of class is not static then by default they are 'Instance'
  String name;
  int salary;

  void get(String s1, int s2) {
    name = s1;
    salary = s2;
  }

  // RULE: All the methods of a class gets memory at class loading time.

  void show() {
    System.out.println(name);
    System.out.println(salary);
  }
  // Here 'get()', 'show()' and 'main()' are functions. But when function gets associated with ref. variable by '.', they are know as methods.
  public static void main(String[] args) {

    // get("shubham", 101); //run function without creating instance will not run as there will be no place in Heap to store thes values

    String ename = "ShubhamOOOO"; // readLine();
    int salary = 100; // readInt();

    InstanceDataMembersandMethods e1 = new InstanceDataMembersandMethods(); // object creation
    // get("shubham", 101) // rrunning function after creating instance but without using instance will not work as there will be be instance in hep but he get is not connected to instance and hence doesn't know its address.

    /*
      Object is nothing but just a buffer or a Memory Area in  Heap Area in which all the instance data member are taking the memory.
      In Java, Objects are runtime entitites that means they always take memory at runtime.
      In Java Only objects gets memory at runtime.
      'new' operator is only used for allocating a memory for an object only.

      RULE: The memory which has been allocated at runtime tat do not have any name.
      Java doesn't have concept of pointer, instead we use 'Reference IDs' for address in java
    */

    e1.get("Shubham", 101);
    e1.show();
    e1.get(ename, salary);
    e1.show();
    e1.name = "Hello"; // // can be access directly but not advisable as we can give wroing value to some variable like we can give 'name' as 124 which is an error as name is string
    System.out.println(e1.name); 
    // We can find the size of object in 'Heap by use of 'PreMain'
  }
}
