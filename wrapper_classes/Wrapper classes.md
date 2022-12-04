# Wrapper class

The objects of all the wrapper classes that can be instantiated are immutable.

**Note:** All wrapper classes are final i.e. can't be inherited.

## Constructors

The 'Character' class has only one public constructor taking a char value as parameter.
All other wrapper classes has 2 public constructor, one takes primitive value & other takes a string.

```java
Character ch = new Character('a')

Integer i = new Integer(10)
or
Integer i = new Integer("10")
```

**IMP:** Constructors has been deprecated and marked for removal, use 'valueOf()' instead.

## Converting String to wrapper objects: use static method 'valueOf(String str)'

Eg:-

```java
Boolean b = Boolean.valueOf("true")
Integer z = Integer.valueOf("10")
```

## Converting wrapper objects to String

Eg:-

```java
Integer z = new INteger(10);
String s = z.toString();
```

## Converting primitive values to String: 'toString()'

Eg:-

```java
String s = Integer.toString(10)
String s1 = Boolean.toString(true)
```

## Converting wrapper objects to primitive-value

int x= 10;
Integer i = x (boxing)
in z = i(unboxing)

Each wrapper class defines the method which returns the primitive value in wrapper objects :-
type typeValue()
Eg.
int intValue()
byte byteValue()
float floatValue()

## Wrapper class comparison & Equality

### Each wrapper class implements comparable interface

```java
Integer i = new Integer(10)
Integer z = new Integer(20)
int x = i.compareTo(z)
```

### Each wrapper class overrides the equals() method

```java
Integer i = 10;
Integer z = 20;
boolean b = i.equals(z)
```

## Int to Binary

```java
String s1 = Integer.toBinaryString(10)
String s2 = Integer.toHexString(10)
String s3 = Integer.toOctalString(10)
```

## String to Primitive type

```java
int i = Integer.parseInt("10");
long i2 = Integer.parseLong("10")
double d1 = Double.parseDouble("3.123")
```

## Wrapper Constants

```java
byte b1 = Byte.MIN_VALUE
byte b2 = Byte.MAX.VALUE
int i1 = Integer.MIN_VALUE
int i2 = Integer.MAX_VALUE
```
