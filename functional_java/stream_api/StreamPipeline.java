// https://www.baeldung.com/java-8-streams

package functional_java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * To perform a sequence of operations over the elements of the data source and aggregate their results, we need three parts: the source, intermediate operation(s) and a terminal operation.
 */

public class StreamPipeline {

    Stream<String> onceModifiedStream =
  Stream.of("abcd", "bbcd", "cbcd").skip(1); // returns stream with one few element


  // Chaingin
  List<String> list = Arrays.asList("abc1", "abc2", "abc3");
long size = list.stream().skip(1)
  .map(element -> element.substring(0, 3)).sorted().count();
    
}
