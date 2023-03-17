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
        Scanner scanner = new Scanner(System.in);
        System.out.println("ps: Enter: Main.java");
        System.out.println("Alright, Moving on to:");
        System.out.println("System.out.println(\"Inputs & Outputs.\");");
        System.out.println("System.out.println(\"\");");
        System.out.println("System.out.println(\"Outputs\");");
        System.out.println("System.out.println(\"Hello World\");");
        System.out.println("System.out.println(\"That's an Output.\");");
        System.out.println("System.out.println();");
        System.out.println("System.out.println(\"Inputs\");");
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

        // Separating Maths Section and Reassigning Values Section
        System.out.println();
        System.out.println(counting.linebreak);
        System.out.println();

        //Assigning Values.
        System.out.println("ps: Re-Enter: Main.java");
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
        x++; System.out.println("x++ -> " + x);
        x--; System.out.println("x-- -> " + x);

        // Separating Reassigning Values Section and Boolean Section
        System.out.println();
        System.out.println(counting.linebreak);
        System.out.println();

        //Booleans, & Comparison
        System.out.println("Now, moving on, to Booleans.");
        System.out.println("Did you like the Video?");
        boolean likedTheVideo = scanner.nextBoolean();
        System.out.println("Did you comment?");
        boolean commented = scanner.nextBoolean();
        System.out.println("Liked the Video: " + likedTheVideo);
        System.out.println("Commented: " + commented);
        System.out.println("Now, Give me a number. 1-100. Maybe, your latest test's Score?");
        int yourScore = scanner.nextInt();
        boolean passedClass = yourScore >= 72;
        System.out.println("\"boolean passedClass = yourScore >= 72;\"");
        System.out.println("This code, returns a boolean which is " + passedClass);
        System.out.println("It only does if your score passes the minimum score.");
        boolean hasPerfectScore = yourScore == 100;
        System.out.println("\"boolean hasPerfectScore = yourScore == 100;\"");
        System.out.println("This code, instead returns a boolean which is " + hasPerfectScore);
        System.out.println("It only does if your score is exactly 100.");
        System.out.println(counting.linebreak);
        System.out.println("\"boolean failedClass = passedClass == false;\"");
        System.out.println("\"boolean failedClass = !passedClass;\"");
        boolean failedClass = !passedClass; // ! = Negating.
        System.out.println("This Code, is basically the same. ! in boolean terms, means negating.");
        System.out.println("Negating, means taking whatever the input is, and reversing it.");
        System.out.println("oh, also, failedClass = " + failedClass);

        // Separating Boolean Section and Logical Operations Section
        System.out.println();
        System.out.println(counting.linebreak);
        System.out.println();

        //Logical Operations
        System.out.println("Alright, now, we're moving on to Logical Operations");
        System.out.println("Returning to the boolean");
        System.out.println("We're adding another boolean for this Section.");
        System.out.println("Did you dislike the Video?");
        boolean dislikedTheVideo = scanner.hasNextBoolean();
        System.out.println("And previously, we had these booleans.");
        System.out.println("Liked the Video = " + likedTheVideo);
        System.out.println("Commented = " + commented);
        System.out.println("There are 3 Logical operators we can apply to Booleans.");
        System.out.println("&& (And)");
        System.out.println("|| (Or)");
        System.out.println("! (Not)");
        boolean superFan = likedTheVideo && commented;
        System.out.println("boolean superFan = likedTheVideo && commented; //" + superFan);
        System.out.println("This boolean, is True only if you Liked (Boolean A == True) and Commented (Boolean B == True).");
        boolean fan = likedTheVideo || commented;
        System.out.println("boolean fan = likedTheVideo || commented; //" + fan);
        System.out.println("This boolean, is True if you Liked (Boolean A == True) and/or Commented (Boolean B == True).");
        boolean hater = !fan;
        System.out.println("boolean hater = !fan; //" + hater);
        System.out.println("Meanwhile, This boolean, is True only if the boolean fan is false.");
        boolean superHater = hater && dislikedTheVideo;
        System.out.println("boolean superHater = hater && dislikedTheVideo; //" + superHater);
        System.out.println("Lastly, This boolean, is True only if the boolean hater is true, and you disliked (Boolean C == false).");

        // Separating Logical Operations Section and If Statements Section
        System.out.println();
        System.out.println(counting.linebreak);
        System.out.println();

        //If Statements
        System.out.println("We're getting into If Statements.");
    }
}