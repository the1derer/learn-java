package basicsofprogramming.datatypes.ascii;

public class AsciiDemo {
    public static void main(String[] args) {
        int x = 'A', y = 'Z';
        System.out.println(x + " " + y);

        char c1 = '(', c2 = '@';
        System.out.println(c1+c2);
        System.out.println(c1-c2);

        System.out.println(Character.MAX_VALUE-1);

        char c3 = 910;
        System.out.println(c3);

        int x1 = Character.MAX_VALUE;
        System.out.println(x1);
    }
    
}
