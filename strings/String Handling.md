# String Handling

* A string is a sequence of characters.
* We implement strings by using array of characters as only array can provide contiguous memory locations.
* Strings has a lot of application in GUI, Web-Apps as all data transferred is in form of String.

---

**In Java, strings are represented via objects.**

## Following 6 classes represent string

1. String Handing
    * java.lang.String       ]--> Immutable(values of this class can't be changed)
    * java.lang.StringBuffer ]--> Mutable

2. Threading
    * java.lang.StringBuilder

3. I/O
    * java.util.StringTokenizer
    * java.io. StringReader
    * java.io.StringWriter

Java has made these many classes to provide different types of manipulation on string.

----

### We can change/modify a string by following ways/operations:-

1. Append
2. Insert
3. Replace
4. Delete

### Note:-

* But we can't apply any of these operations on 'string' objects as they are immutable.
* If we want to do changes or above operation then we hav to use `StringBuffer` class.
