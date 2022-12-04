package java101.datatypes;

class TypeCastingDemo {
  
  static void show( byte b) {
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

    // Implicit casting: smaller to bigger
    byte b =10;
    show(b);
    int x = b;
    show(x);

    // Explicit casting
    int i =10;
    show(i);
    byte j = (byte)i;
    show(j);

    //java introduced the concept of 

  }
}

class TypePromotionDemo {

  // static void show( byte b) {
  //   System.out.println("this is a byte");
  // }

  // static void show(short s) {
  //   System.out.println("this is a short");
  // }

  // static void show(int x) {
  //   System.out.println("this is a int");
  // }

  static void show(long l) {
    System.out.println("this is a long");
  }

  public static void main(String[] args) {

    //java introduced the concept of TypePromotion in Implicit TypeCastingPromotion of variable/constant to upper data type in absence of default data type
    // NOTE: It doesn't do TypeDemotion
    byte b =10;
    show(b);

  }

}
