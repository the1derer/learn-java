# CharStream

## Classes of CharStream (in form of `Reader` | `Writer`)

### `Reader` | `Writer`

1. `FileReader` | `FileWriter`
2. `CharArrayReader` | `CharArrayWriter`
3. `BufferedReader` | `BufferedWriter`
4. `InputStreamReader` | `InputStreamWriter`
5. `PipedReader` | `PipedWriter`
6. `Scanner` | `PrintWriter`
7. `Console`

## Some other Character Classes

1. `File`
2. `File` ]-> `java.nio` package
3. `Path`
4. `Paths`

## How to convert ByteStream to CharacterStream?

We have two classes for this:

### For converting InputStream to Reader Stream

```java
InputStreamReader(InputStream i)
```

### For converting OutputStream to Writer

```java
OutputStreamWRiter(OutputStream o)
```

### For connecting to keyboard

```java
InputStream inputStream = new InputStreamReader(System.in);
BufferedReader bufferedReader = new BufferedReader(inputStream);
```