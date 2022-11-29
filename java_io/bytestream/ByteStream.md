# `ByteStream`

## Child classes of `ByteStream`

### Child classes of --> {`InputStream` | `OutputStream`}

1. `FileInputStream` | `FileOutputStream`
2. `ByteArrayInputStream` | `ByteArrayOutputStream`
3. `BufferedInputStream` | `BufferedOutputSteam`
4. `DataInputStream` | `DataOutputStream`
5. `PipedInputStream` | `PipedOutputStream`
6. `SequenceInputStream` |`SequenceOutputStream`
7. `ObjectInputStream` | `ObjectOutputStream`

### Other child classes of `ByteStream`

* These are not child of InputStream or OutputStream

1. `PrintStream`
2. `StreamTokenizer`
3. `StringTokenizer`
4. `StringFile`
5. `ZipOutputStream`
6. `ZipFile`
7. `ZipEntry`

### [FileIOStream]('./fileIOstream/FileIOStream notes.pdf')

### ByteArrayIOStream

```
Java Program -> fout            __
                    |--> Printer  |
                    |--> File     |--> Data has to be sent to all these devices separately.
                    |--> Network__|
```

* Use to send same data to multiple destinations, which is not possible using simple 'FileOPStream'.
* Here we create a buffer but don't connect it to any device.
* Then insert data in in buffer using write() method.
* And snd copy of this buffer to the desired devices.
* This buffer exists till we don't close this buffer.

```java
ByteArrayOPStream bout = new ByteArrayOPStream();

String outStr = "India is a good country";
byte[] outByteArr = outStr.getBytes();

bout.write(outByteArr);

bout.writeTo(OutputStream outStream); // this command sends data of `bout` buffer to desired device
bout.writeTO(new FileOPStream("abc.txt"));
bout.writeTo(new FileOPStream("xyz.txt"));
```
