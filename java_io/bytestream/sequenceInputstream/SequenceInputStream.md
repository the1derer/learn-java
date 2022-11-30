# SequenceInputStream

**This helps when we have many InputStreams. So, instead of reading from them one by one we can pass them in SequenceInputStream and read them in one loop.**

**Problem:** But the problem arises that how to make a constructor that take variable number of args or Input Stream?</br>
Soln:- Create an `Enumeration`(interface) of the InputStream

But we can't create object of an interface. So, we have to make a class that implements `Enumeration` interface.
And then:
i. Create a array of InputStream and put ll InputStream objects in this array.
ii. Then override the method and return these Streams one-by-one until all objects re retunred..

Note: 
i. An extra `hasMoreElement()` is ran.
