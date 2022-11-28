# Java Pros and Cons (These are my personal opinion and will change as I learn more or experience other paradigms)

* 

## Note: Some critique can easily be solved by using different libraries and using a more extensive

## Pros

1.  

## Cons

0. Not at all beginner friendly. There should be some abstract layer where I could at least print "Hello world" without having to write `public static void main(String[] args)`
1. A lot, like a lot of boilerplate code. Like when I started learning it there was not even `jshell` so to test even some fundamental concept you have to write a test class.
2. Some implicit type conversion could have been nice like

```java
public String toString() {
    return 1; // will give error as Java will not convert int to String implicitly. TODO: research why Java made this trade-off
}
```

3. I am going to contradict my last point by saying that Java should be more strongly typed.
    (i) As seen in my GSoC period, the problem of Java and NullPointerException is really a mess.
    (ii) Checker Framework solves this issue to much extent. But integrating it to legacy code is still a pain.

4. `String.char()` produces `IntStream`, as there is no `CharStream`. WTF!!!
    Why not just provide a CharStream which just returns IntStream.mapToObj(c -> (char) c)