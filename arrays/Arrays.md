# Array

* If you print an `char` array its actual content is printed, whereas arrays of any other type prints array's RefID. Reason behind this is there is a there is overloaded `PrintStream.printf(char[] charArr)` method.

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
