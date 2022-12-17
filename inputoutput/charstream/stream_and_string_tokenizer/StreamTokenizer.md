# StreamTokenizer

> So, far we use to read only char-by-char or line-by-line from file or buffer. But here we will read according to our choice

* High Level Stream.
* Can take both CharacterStream or ByteStream.
* Just Pass the ref of our stream into constructor of `StreamTokenizer`.
* This `StreamTokenizer` divides stream into many small parts.
* These small parts are called Tokens.
* We have to give the 'delimiter' according to which it will separate the stream into small parts.
* We can give >=1 delimiters.

## Consturctors:-
StreamTokenizer has 2 constructors, one take InputStream(**deprecated**) and other Reader.
