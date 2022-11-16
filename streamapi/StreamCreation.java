package streamapi;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        Stream<String> streamEmpty = Stream.empty(); // creates empty string

        /*
         * public Stream<String> streamOf(List<String> list) {
                return list == null || list.isEmpty() ? Stream.empty() : list.stream();
            }
         */

        // Stream of Collection
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        // Stream of Array
        Stream<String> streamOfArray = Stream.of("a", "b", "c");

        // creating stream out of existing array
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr,1 , 3);

        // Stream.builder()
        // Stream.generate()
        // Stream.iterate()

        // Stream of Primitives (only int, long & double)
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);

        // Stream of String
        IntStream streamOfChars = "abc".chars();
        // following breaks a String into sub-string according to specified RegEx
        Stream<String> streamOfString = Pattern.compile(",").splitAsStream("a, b, c");

        // Stream of file
        Path path = Paths.get("C:\\file.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        // Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
    }
}
