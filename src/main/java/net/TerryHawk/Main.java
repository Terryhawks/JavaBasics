package net.TerryHawk;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("SuspiciousNameCombination")
    public static void main(String[] args) {
        //Importing from other Classes
        Data_Types types = new Data_Types();
        Arithmetics counting = new Arithmetics();

        //Data Types
        System.out.println("ps: To understand this, please use the java code alongside the Terminal where you'll see things.");
        System.out.println("ps: Enter: Data_Types.java");
        System.out.println("First. Lets understand values, and how they're stored.");
        System.out.println(counting.linebreak);
        System.out.println("Integer/Numbers");
        System.out.println("Integer Example: " + types.IntegerX);
        System.out.println("Float Example: " + types.FloatX);
        System.out.println("Double Example: " + types.DoubleX);
        System.out.println("Byte Example: " + types.oneByte);
        System.out.println("Short Example: " + types.twoShortByte);
        System.out.println("Long Example: " + types.eightLongByte);
        System.out.println(counting.linebreak);
        System.out.println("Boolean/Logics");
        System.out.println("Boolean Example: " + types.explaining);
        System.out.println("Boolean Example: " + types.headache);
        System.out.println(counting.linebreak);
        System.out.println("Character/Strings");
        System.out.println("Char Example: " + types.oneCharacter);
        System.out.println("String Example: " + types.message);
        System.out.println("Special Value Example: " + types.strung + ". null is literally, no value at all, not even 0.");

        // Separating Values Section and I/O Section
        System.out.println();
        System.out.println(counting.linebreak);
        System.out.println();

        //I/O
        System.out.println("System.out.println(\"Inputs & Outputs.\");");
        System.out.println("System.out.println(\"\");");
        System.out.println("System.out.println(\"Outputs\");");
        System.out.println("System.out.println(\"Hello World\");");
        System.out.println("System.out.println(\"That's an Output.\");");
        System.out.println("System.out.println();");
        System.out.println("System.out.println(\"Inputs\");");
        Scanner scanner = new Scanner(System.in);
        System.out.println("System.out.println(\"Scanner scanner = new Scanner(System.in);\");");
        System.out.println("System.out.println(\"With this Code, you can get an input.\");");
        System.out.println("System.out.println(\"Input your Name?\");");
        System.out.println("System.out.println(\"String name = scanner.nextLine();\");");
        String name = scanner.nextLine();
        System.out.println("System.out.println(\"Then, the next line's code will output user's input:\");");
        System.out.println("System.out.println(\" + name + \");");
        System.out.println("System.out.println(" + name + ");");

        // Separating I/O Section and Maths Section
        System.out.println();
        System.out.println(counting.linebreak);
        System.out.println();

        //Arithmetics
        System.out.println("ps: Enter: Arithmetics.java");
        System.out.println("Moving on to Mathematics.");
        System.out.println();
        System.out.println("First Variable: " + counting.x);
        System.out.println("Second Variable:" + counting.y);
        System.out.println("x+y: " + counting.addition);
        System.out.println("x-y: " + counting.subtraction);
        System.out.println("x*y: " + counting.multiplication);
        System.out.println("x/y: " + counting.division);
        System.out.println("x%(y-x/y): " + counting.remainder);
        System.out.println(counting.linebreak);
        System.out.println("The highest value between x&y: " + counting.Math_max);
        System.out.println("Absolute Value of y-x: " + counting.Math_abs);

        //Separating Maths Section and Reassigning Values Section
        System.out.println();
        System.out.println(counting.linebreak);
        System.out.println();

        //Assigning Values.
        System.out.println("ps: Enter: Main.java");
        System.out.println("Assigning Values.");
        System.out.println("Please Input the X Value.");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("int x = " + x);
        System.out.println("Please Input the Y Value.");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("int y = " + y);
        System.out.println();
        System.out.println("Let's redo the Mathematics section with Reassignment.");
        x += y; System.out.println("x += y -> " + x);
        x -= y; System.out.println("x -= y -> " + x);
        x *= y; System.out.println("x *= y -> " + x);
        x /= y; System.out.println("x /= y -> " + x);
        x %= y; System.out.println("x %= y -> " + x);
    }
}