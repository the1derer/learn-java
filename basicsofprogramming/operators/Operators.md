# Operators

Operator: That which operates on something.

* Every operator, operates on operands and returns a value.

## Arithmetic operators

`x + y` : `+` is an operator, `x`, `y` are operands
Similarly,
x - y, x * y, x/y

**NOTE:** : Whenever performing `/`(division operation) or `%`(modulo operation), we have to be careful that the denominator is not zero. As compiler will not generate any error, but we will get `RuntimeException`(`ArithmeticExceptions`).

```java
int m = 89, n = 0;
Sysout(m / n); // ==> RuntimeException(ArithmeticException)
Sysout(m % n); // ==> RuntimeException(ArithmeticException)
```

## [Operator Precedence Table](./OperatorPrecedenceTable.pdf)
