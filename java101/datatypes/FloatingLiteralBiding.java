package java101.datatypes;

public class FloatingLiteralBiding {

  static void show(float f) {
    System.out.println("float");
  }

  static void show(double d) {
    System.out.println("double");
  }


  public static void main(String[] args) {
    show(2.4); // in Java all floating literals are treated as double
    show(2.4f); // explicit float

    
    //----------------------java weird-----------------------
    byte b =10; // should give error but does not give error
    // float z = 2.4; // gives error
    float f = 2.4f; // to store float we use suffix 'f'
  }
}
