package oops;
public class Polymorphism {

  // Polymorphism is always achive via behaviour of an object
  // Properties of an object don't play any role in case of Polymorphism.

  // Compile time polymorphism ---> F^n overloading  &  Operator overloading
  // Runtime Polymorphism ---> F^n overriding

  // Changes made by Java
  // Java doesn't support operator overloading explicitly. But suports implicitly
  // Eg: 
  //     20 + 30  = 50                       -| Here '+' is overloadid because '+' is performing many fuctionality
  //     "good" + "morning" = "good morning" -|
  
  // RULE:
  // Java doesn't support compile time polymorphism.
  // In java in F^n overloading case binding occurs in Runtime polymophism
  // IN other OOPS languages there are virtual F^ns. But in Java by default, all the instance F^n are implicitly virtual.
  // But in Static F^ns, the bindings happens in compile time(only case of compile time in Java). But Binding is to 'class' not 'object'. The Static F^n is only present in Java. So, it's not a concept of OOPS.
}
