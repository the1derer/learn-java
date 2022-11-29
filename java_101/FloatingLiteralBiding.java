package java_101;

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
  }
}
