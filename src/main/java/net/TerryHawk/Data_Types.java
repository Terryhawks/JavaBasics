package net.TerryHawk;

public class Data_Types {
    //Numerical Data Types.

    // Mainly used.
    int IntegerX = 75;              //Integers, also known as Whole Numbers, Works with numbers in [-2^31 to (2^31-1)]. stores with a Value of 4 Bytes.
    float FloatX = 1.337f;       //Floats, Works with up to 7 Decimal Point Precision. Do NOT Use for things that need to be very accurate.
    double DoubleX = 4.20000005d;   //Doubles, Works with up to 15 Decimal Point Precision. Also Don't Use for things that need to be very accurate.

    // Sometimes Used.
    byte oneByte = 127;             //Value is at 1 Byte. Works with numbers from [-2^7(-128) to (2^7-1(127))]
    short twoShortByte = 32767;          //Value is at 2 Byte. Works with numbers from [-2^15 to (2^15-1)]
    long eightLongByte = 2^63-1;        //Value is at 8 Byte. Works with numbers from [-2^63 to (2^63-1)]

    //Booleans, also known as Logic.
    boolean explaining = true;      //Explains boolean variables. this boolean tells you that the variable "explaining" is equal to true.
    boolean headache = false;       //Explains boolean variables. this boolean tells you that the variable "headache" is equal to false.
    //stores either true(1) or false(0)

    //Characters, & Strings.
    char oneCharacter = 'L';        //Characters, contains one singular character. This line tells you that the variable "oneCharacter" is equal to L.
    // Can also include Special Characters, like comma(,), dashes(-), dots(.), etc.
    String message = "Hello World"; //Strings, contains a string of characters. This line tells you that the variable "message" is equal to "Hello World".
    String strung = null;           // null, isn't 0 but literally, no value, not even 0. Completely empty, no bit assigned.
}