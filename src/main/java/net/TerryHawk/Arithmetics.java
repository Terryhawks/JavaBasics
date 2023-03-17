package net.TerryHawk;

public class Arithmetics {
    String linebreak = "----------";
    //Integers, Math, and Arithmetic Operations

    //Values to Test
    int x = 100;
    int y = 20;

    //Addition
    int addition = x+y;               //adds y into x

    //Subtraction
    int subtraction = x-y;            //subtracts y from x

    //Multiplication
    int multiplication = x*y;         //multiplies x by y

    //Division
    int division = x/y;               //divides x by y.

    //Remainder, also known as mod
    int remainder = x%(y-x/y);        //divides x by y, then subtracts that from y. then it divides x by the previous
    //number, and outputs the remainder.

    //Math Methods
    int Math_max = Math.max(x, y);    //outputs the higher valued number between the two.
    int Math_abs = Math.abs(y-x);     //outputs the absolute value of y-x
}
