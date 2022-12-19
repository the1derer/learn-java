package java101;

public class MainExplicitCallDemo {
  public static void main (String... s) {
    System.out.println(s[0] + " from  MainExplicitCall");
  }
}

class ExplicitMainCaller {
  public static void main(String[] args) {
    System.out.println("Hello from ExplicitMainCaller");
    String[] z = {"Hello"};
    MainExplicitCallDemo.main(z);
  }
}
