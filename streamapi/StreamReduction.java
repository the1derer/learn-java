package streamapi;
/*
 * The API has many terminal operations which aggregate a stream to a type or to a primitive: count(), max(), min(), and sum(). However, these operations work according to the predefined implementation. So what if a developer needs to customize a Stream's reduction mechanism? There are two methods which allow us to do this, the reduce() and the collect() methods.
 */

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduction {


    // reduce()
    int reducedTwoParams =
  IntStream.range(1, 4).reduce(10, (a, b) -> a + b);

  int reducedParams = Stream.of(1, 2, 3)
  .reduce(10, (a, b) -> a + b, (a, b) -> {
     log.info("combiner was called");
     return a + b;
  }); // no login because combiner wasn't called

  int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
    .reduce(10, (a, b) -> a + b, (a, b) -> {
       log.info("combiner was called");
       return a + b;
    });
    
}
