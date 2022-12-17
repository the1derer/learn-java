package basicsofprogramming.datatypes.casting;

public class TypeCastingDemo {

  static void show(byte b) {
    System.out.println("this is a byte");
  }

  static void show(short s) {
    System.out.println("this is a short");
  }

  static void show(int x) {
    System.out.println("this is a int");
  }

  static void show(long l) {
    System.out.println("this is a long");
  }

  public static void main(String[] args) {

    System.out.println("-----Implicit TypeCasting: smaller to bigger-----");

    // int x = 4.79; // will give error as we are putting the `double` value in 'int'(which is of
    // smaller size than double)
    float y = 9;
    System.out.println(y);

    byte b = 10;
    show(b);
    int x = b;
    show(x);


    System.out.println("-----Explicit casting: using 'cast' operator-----");
    int i = 10;
    show(i);
    byte byteCastedInt = (byte) i; // using cast operator
    show(byteCastedInt);

    int intCastedFloat = (int) 4.79678;
    System.out.println(intCastedFloat);

    float intCastedFloatStoredInFloat = (int)9.72;
    System.out.println(intCastedFloatStoredInFloat);

    int longCastedInt = (int) 1000000000000L;
    System.out.println(longCastedInt);

    byte byteCastedIntOverflow = (byte) 1000000;
    System.out.println(byteCastedIntOverflow);

    char c = 'c';
    byte asciiConvertedChar = (byte) c;
    System.out.println(asciiConvertedChar);

    // char unicodeChar = '😂'; // not allowed
    //TODO: Not able to save '😂' emoji in `char`
    char unicodeChar = '\u00AB';
    System.out.println(unicodeChar);
    byte byteCastedUnicodeChar = (byte) unicodeChar;
    System.out.println(byteCastedUnicodeChar);
    char backConvertedToChar = (char) byteCastedUnicodeChar;
    System.out.println(backConvertedToChar); // different value than 'unicodeChar' hence proving there was an overflow while casting to `byte`

    System.out.println("------Using int-------");
    int intCastedUnicodeChar = (int)unicodeChar;
    System.out.println(intCastedUnicodeChar);
    char backConvertedFromIntChar = (char) intCastedUnicodeChar;
    System.out.println(backConvertedFromIntChar); // converts back correctly

    // String unicodeString = "😂😂😂"; // allowed
    // System.out.println(unicodeString);
    // char[] unicodeCharArr = unicodeString.toCharArray(); // proves `char` can store emojis
    // System.out.println(unicodeCharArr);
  }
}
