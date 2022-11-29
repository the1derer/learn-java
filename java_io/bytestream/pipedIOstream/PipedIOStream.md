# PipedIOStream

Earlier, at one-time either we are reading or writing data into one stream. But to do both simultaneously we use `PipedIOStream`.

* Used for simultaneously reading and writing data.
* We achieve this by using threads. One thread for reading and one thread for writing.

```
                  read data
[Output Stream] -----X------> Thread2 => this thread fails as we can't read data from OutputStream.
^
|   writes data
|---------------- Thread1 
```

Now,

```
`PipedOutputStream`           -> -> ->  ->           `PipedInputStream`
[Data available here] ---connected via "pipe"------[Data not present here]--> Thread2 => Here Thread2 can read data successfully.
^
|   writes data
|---------------- Thread1 
```

(i) First we make PipedIPStream object, then we make PipedOPStream object. 
(ii) Connect both these objects via 'connect()' method.
