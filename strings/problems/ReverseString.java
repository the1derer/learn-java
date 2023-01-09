package strings.problems;

public class ReverseString {
    public static void main(String[] args) {
        char[] word = "This is awesome!!".toCharArray();
        // System.out.println(word);

        // printing in reverse
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.printf("%c", word[i]);
        }
    }
}
