package strings.formatedstring;

import java.util.stream.IntStream;

// TODO: https://dzone.com/articles/java-string-formatting
public class FormattedStringDemo {
    public static void main(String[] args) {
        int x = 109, y = 9;
        x = x + 1;
        System.out.printf("Value// of x = %d and y = %d", x, y);


        System.out.println("-----Result when using wrong format specifier");
        long longValue = 9999999999L;
        float floatValue = 9.9999f;
        
        System.out.printf("%d%n", longValue);
        // System.out.printf("%d", floatValue);

        System.out.printf("My birth date is %d-%d-%d\n", 11, 12, 1998);

        IntStream.range(1, 10).forEach(i -> {
            System.out.printf("2 %c %d = %d\n", 'x', i, 2 * i);
        });
    }
}
