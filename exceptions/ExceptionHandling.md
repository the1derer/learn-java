# Exception Handling

int x = 10/0; ---> Error in 'C'
    |
    |--> Exception in Java

* When any abnormal condition is not handled it become Error.
* When this abnormal condition is handled it becomes Exception Handling.

## Types of Error:-

1. Syntax Error --> Not dangerous
2. Logical Error --> Not dangerous
3. Runtime Error --> Dangerous, hence needs to be 'Handled'.

* In Java these Runtime errors are need to be Handled under Exception Handling.

---

* In Java, Exceptions are also represented via object. And since there are objects hence there are classes for 'Exception'.
* So, Java has made specific 'Exception' class for each specific Exception.
* So whenever, any Exception is encountered, JVM searches for 'Exception class' of the particular Exception and creates object of that Exception class.
  * And throws that object to our program.
  * And we catch that object by using using handlers in our program.
* If we don't used our own handler, JVM uses its own handler, known as 'Default Handler' and instantly terminates the program as soon as it encounters the Exception.
* Java maintains a hierarchy of 'Exception' classes.
* In Java, every class that 'throws' object has to be child of 'Throwable' class. In other words, every exception class has to be the child of 'Throwable' class.

```java
        ______________java.lang.Throwable_____________
        |                                             |
        |                                             |
    Exception                 __                      Error
    |-> SQLException            |                       |-> VirtualMachineError
    |-> IOException             |-> Checked             |-> Thread Death
    |-> ClassNotFoundException__|                       |-> OutOfStack Error
    |-> RuntimeException
          |-> ArrayIndexOutOfBoundsException 
          |-> ArithmeticException
          |-> NullPointerException

NOTE: Anything not mentioned as 'Checked' is 'unchecked'.
```

* Java Hash Categorised Exception into 2 categories:

---

(a) Errors:- These are also Exception but even after handling they make program to exit.
(b) Exception:- They prevent program from exiting when handled.

---

(a) Checked Exception:- These Exceptions are known to compiler.
(b) Unchecked Exception:- These Exceptions are not known to compiler.

// TODO: Convert scanned notes to Typed notes