package basicsofprogramming;

class LocalVariableInitialize {
  public static void main(String[] args) {
    int a; // no default value will be given here, if we try to access it without any value it will give error
    int x = 40;
    int y = 20;
    int z = x + y;
    System.out.println('z'); // will output z
    System.out.println("z"); // will output z
    System.out.println(z); // will output 60

    //
    // int a = b = 0; // gives compilation error
  }
}