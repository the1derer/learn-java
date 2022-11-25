package programming101;

public class IntegerLiteralTest {
  public static void main(String[] args) {
    byte b = 10;
    byte c = 20;
    // byte d = b+c; // this will give compilation error as  in java all integer literals belong to 'int' and java will allow lossy conversion
    
    //solution
    byte d = (byte) (b+c);
    System.out.println(d);
  }
}
