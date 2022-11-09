class LocalVariableInitialize {
  public static void main(String[] args) {
    // int x; // this will give error as local variable always need to be initialize.
    int x = 40;
    int y = 20;
    int z = x+y;
    System.out.println('z'); // will output z
    System.out.println("z"); // will output z
    System.out.println(z); // will output 60
  }
}