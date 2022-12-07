# RegEx

## Java RegEx classes

> To use regular expressions in Java, we don't need any special setup. The JDK contains a special package, java.util.regex, totally dedicated to regex operations. We only need to import it into our code.

### The `java.util.regex` package consists of three classes: `Pattern`, `Matcher`, and `PatternSyntaxException`:-

* `Pattern` object is a compiled regex. The Pattern class provides no public constructors. To create a pattern, we must first invoke one of its public static compile methods, which will then return a Pattern object. These methods accept a regular expression as the first argument.
* `Matcher` object interprets the pattern and performs match operations against an input String. It also defines no public constructors. We obtain a Matcher object by invoking the matcher method on a Pattern object.
* `PatternSyntaxException` object is an unchecked exception that indicates a syntax error in a regular expression pattern.

[**Demo**](./PatternClassDemo.java)

### Moreover, the java.lang.String class also has inbuilt regex support that we commonly use in our code

## Alternative matching

* `(Bob|Kevin|Stuart)` will match either Bob or Kevin or Stuart.
* `([a-f]|[A-F])` will match any of the following characters: a, b, c, d, e, f, A, B, C, D, E, or F.

## Matching same test again and again

* `(\d)\1`: It can match 00, 11, 22, 33, 44, 55, 66, 77, 88 or 99.

## Backreference to failed group
