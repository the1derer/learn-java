package string_handling.stringbuffer;


// NOTE: Never create a object of StringBuffer via literal


// Making object of StringBuffer
/* 
 * 1. Default constructor
 * StringBuffer sb = new StringBuffer();
 * sb.capacity() // by default size 16, but as we add more elements it grown dynamically to new array whose NewCapacity = (oldcapacity + 1)*2
 * sb.length() // OP: 0
 * sb.append("hello")
 * sb.append("Hey")
 * 
 * 
 * 2. StringBuffer(int capacity)
 * 
 * 3. StringBuffer sb = new StringBuffer("Hello") --> InitialLenght = 16 + lenght of our given String
 */

// Modification Methods in String buffer
/*
 * StringBuffer stringBuffer = new StringBuffer("I Java");
 * 
 * 1. stringBuffer.insert(2, "like") ==> inserts string at the given index
 * 
 * 2. stringBuffer.replace(2, 6, "love") ==> replace the character from 2 to 6 with "love"
 * 
 * 3. stringBuffer.delete(2, 6)
 * 
 * 4. stringBuffer.reverse() * 
 */
