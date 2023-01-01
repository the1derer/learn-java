# `break` keyword

## Need of `break` keyword

If we look at the code of LCM we wrote while studying `while` loop, we will
note the the code it doesn't have good performance(time and memory used) as we kept iterating the loop even after we found our LCM.

[Snipped taken from LCM(while loop)](../whileloop/problems/LCMofTwoNums.java)
```java
while (max <= a * b) {
    if ((max % a == 0) && (max % b == 0) && (lcm == -1)) { // we could have avoided `lcm == -1` and stopped loop from further iterating check if we use `break` keyword
      lcm = max;
    }
    max++;
}
```

above can we converted to:

```java
while (max <= a * b) {
    if ((max % a == 0) && (max % b == 0)) {
      lcm = max;
      break;
    }
    max++;
}
```
