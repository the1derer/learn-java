import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i == 1) throw new Exception();
    }
}
