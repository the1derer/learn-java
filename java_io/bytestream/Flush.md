```java
dout
dout.writeLine("Hello"); // this will read string along with '\n' but transfer only "Hello" leaving "\n" in buffer.
dout.flush(); // empties the buffer
```

# Note: If you are using same String(buffer) again & again ; use flush() to empty that buffer.