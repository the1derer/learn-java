# BufferedReader | BufferedWriter

* High Level Stream. Same as BufferedIOStream

`BufferedReader br = new BufferedReader(System.in);` ==> will give DataType Mismatch error as BufferedReader only takes Reader class object.
CharacterStream don't have any stream which is connected to keyboard, so to convert ByteStream to CharacterStream we do as follows:

[See CharStream.md](../CharStream.md#how-to-convert-bytestream-to-characterstream)
