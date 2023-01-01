import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a = 0;

        int b = 1;

        int c;

        for (int i = 0; i <= n; i++) {

            System.out.println(a);

            c = a + b;

            a = b;

            b = c;

        }


    }
}
