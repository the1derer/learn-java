class MainExplicitCall {
  public static void main (String... s) {
    System.out.println("Hello from  MainExplicitCall");
  }
}

class Caller {
  public static void main(String[] args) {
    System.out.println("Hello from caller");
    String z[] = {"Hello"};
    MainExplicitCall.main();
  }
}
