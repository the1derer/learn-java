package java101.datatypes;

public class IntegerLiteralTypeBinding {
  
  static void show(byte b) {
    System.out.println("this is a byte");
  }

  static void show(short s) {
    System.out.println("this is a short");
  }

  static void show(int x) {
    System.out.println("this is a int");
  }

  static void show(long l) {
    System.out.println("this is a long");
  }

  public static void main(String[] args) {

    show(10); // will output 'int' as all integer literals are 'int' by default
    show(1000000L); // will output 'long' we can change default bindings by defining long explicitly

    byte b = 10;
    show(b); // it will bind automatically with correct data type

    // ------------------------------------
    byte x = 10;
    byte y = 20;
    // byte d = b+c; // this will give compilation error as in java all integer
    // literals belong to 'int' and java will allow lossy conversion

    // solution
    byte d = (byte) (x + y);
  }
}

// char ----> int -----> long
// | |
// |-------> float
// |-------> double
