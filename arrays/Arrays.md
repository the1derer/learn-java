# Array

Collection of data of same types.

## Syntax in java

### For single Array

* `int x[];`
* `int[] x;`

### For >1 arrays

* `int x[] , y[], z[];`
* `int[] x, y, z;` --> More convenient for >1 array

Now,

```java
int x[];
x = readInt();
```

To give memory at runtime, we use `new`

* In Java, Arrays are represented via object.

* As `new` gives memory to object only.
* Arrays are referenced variables.

## Do's and Dont's with arrays


---

If you print an `char` array its actual content is printed, whereas arrays of any other type prints array's RefID. Reason behind this is there is a there is overloaded `PrintStream.printf(char[] charArr)` method.

  ```java
  char charArr = {'c', 'a', 't'};
  int[] intArr = {1, 2, 3, 4, 5};
  byte[] byteArr = {10, 12, 15, 18};
  String[] stringArr = {"Hello", "World"};

  Sysout(charArr) // O/P: cat
  Sysout(intArr) // O/P: {RefID}
  Sysout(byteArr); // O/P: {RefID}
  Sysout(stringArr) // O/P: {RefID}
  ```
