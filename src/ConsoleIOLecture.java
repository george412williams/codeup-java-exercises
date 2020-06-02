import java.util.Arrays;
import java.util.Scanner;

public class ConsoleIOLecture {

    public static void main(String[] args) {

        //System.out.println("Hello Ganymede!");

//METHODS:

        // ================================== print() and println()

        // this:
//            System.out.println("here");
//            System.out.println("there");

        // is equivalent to this:
//            System.out.print("here\n");
//            System.out.print("there\n");

        // without the newline characters, print outputs this:
//            System.out.print("here");
//            System.out.print("there");

        // to concatenate, just like JS:
//            System.out.println("Hello" + " " + "World");


        // ================================== printf()

        // Print a formatted string using the following... printf(formatString, data)
        //a lot like __ syntax, a lot like print with a single string passing
        //good for adding diff vars together wo concat

        // same output as print():
//            System.out.printf("Hello");
//            System.out.printf("World!");




        // creating a string variable:
            String bigBall = "World";
        System.out.printf("Hello %s", bigBall); //chars after % determine datatype, if string %s, display Hello World, similar to $ w ES6 template strings
//            System.out.printf("Hello %S", bigBall); // all caps, can format here also, add new line character w %n, next line
                                            // %d for decimal integers

        // multiple variables:
//            int three = 3;
//            String typeOfPetGroup = "cats";
//            System.out.printf("I have %d %s.", three, typeOfPetGroup);
                        //3.5 for int obv won't work, neither is double three = 3.5 bc of , three,...
                        //instead of %d use %f   ...look at defs for both

        //Curric further reading: format numeric output; encourage their reading; points to documentation, so many
        //more things we can do, additional tools
        //want two decimal places?   %.2f for example

        // currency:
//            int currencyPennies = 1000;
//            System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);
        //  ... for $10.00 and acre...

        //printf good for: concating with no pluses and lots of vars included

        //write a program that will print your name with a greeting
        //Welcome, YOUR_NAME_HERE!

        String name = "George Williams";
        System.out.printf("Welcome, %s!", name);

        //will be using souts a lot to console log check, referring to 'java console'; generally println for debugging: Justin


        // ================================== USER INPUT

        //syntax sense later when creating obj's from classes, this code creates a new scanner tool for use
        //points to files, input stream to console, can analyze all user input to console
        //to do that define System.in to read things typed into console
        //IJ says code won't work as is, referencing something not in the lang folder
            //is in a package called java.util
                //a tool to analyze input, import by import statement at top of class file, similar to es6(see top)
                //changes code below from red(compile time error or java cannot find symbol) to good bc of import up top
                //to make having so many imports faster, IJ short: optEnter to auto include the import
                //will give option on where to import from, here want util package(parent dir)

        Scanner sc = new Scanner(System.in);

            //souting shows the mechanics of the tool
            //if only have access to IJ, comB, for methods
                //says token, basically meaning captures what the user inputs

//        String userInput = sc.next();
        //.next means up until the white space; .nextLine adds what is after the space
//        System.out.println(userInput);
        //so you see Hello

        //String userInput = sc.next();
        //add a prompt for a number input:
        System.out.println("Input a number:");
        int userInput = sc.nextInt();   //for numbers
        System.out.println("Your input is: " + userInput); // userInput * 2); needs .nextInt()...

        //only need to create the drill once to use all its methods

        // .next() captures each input separated by whitespace:
            System.out.print("Please enter your first, middle, and last name: ");
            String firstName = sc.next();
            String lastName = sc.next();
            String what = sc.next();

            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(what);

            //in console you type names, first name enter, enter gives a new line character and awaits next input of the three expected
            //on last enter the program spits out all 3 from the souts below it

                //

        // .nextInt() captures the first valid int value:

            System.out.print("Please enter your age: ");
            int age = sc.nextInt();
            System.out.println(age);


        // .nextLine():

            //will take the token to the next line

//            System.out.print("Favorite quote: ");
//            String quote = sc.nextLine();
//            System.out.println(quote);


        // unexpected behaviour

            //the frustrating part of .next
        System.out.println("enter a word:");
            String word1 = sc.next();

            sc.nextLine(); // needed to clear out hitting enter
        System.out.println("enter a word:");
            String line1 = sc.nextLine();
            String word2 = sc.next();
            sc.nextLine(); // needed to clear out hitting enter
            String line2 = sc.nextLine();

        System.out.printf("The word is: %s%nThe sentence is: ", word1, line1);
            //does not work...bc:
                //from enter giving a new line character, reads to next line the new line character and prevents input, so added line 142

//            System.out.printf("%s%n%s%n%s%n%s%n", word1, line1, word2, line2);

        // check for presence of various data types
            //using conditional logic from next lesson

//            int userInt = 0;
//            if (sc.hasNextInt()) {
//                userInt = sc.nextInt();
//                System.out.printf("The user entered %d. This number times two is %d.", userInt, userInt * 2);
//            } else {
//                System.out.println("The user did not enter an integer");
//            }

        //you can capture things as strings and parse them to numbers down the line
        //or you can parseInt up front

    }

}