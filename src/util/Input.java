package util;
import java.util.Scanner;
//creating a package of general purpose tools
//an input class could be first of several things created along the way

public class Input {
//seeing how its used can help understand, see favWord test in main
    private Scanner scanner;
    //wi this class will use this scanner, made private bc other things will not need user input here

    public Scanner getScanner(){
        return scanner;
    };

    public Input () {
        this.scanner = new Scanner(System.in);
        //in instructions, 'when a new instance is set use scanner...'
        //this creates a new one every time its used, aka called
    }

    public String getString(){//changed from void
        //System.out.println("Please type in a string.");//prompts go to the main, not the method
        return scanner.nextLine();

    }

    //bonus overload getString(String prompt)...adds the prompt directly, and can remove the sout prompt

    public boolean yesNo() {
        //if string y or yes regardless of case needs true, else false
        String input = getString();//scanner.next(); this is the key!!!
        //this condition may be failing in the bonus requirement//consiter scanner.next();
        System.out.println(input);
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        //if user input !num prompt to corret, loop or recursion? recursion easier to read
        if (scanner.hasNextInt()){
            //System.out.println("Is int");
            return scanner.nextInt();
        } else {
            //System.out.println("Not an int");
            //can call meth over again
            System.out.println("Invalid input enter valid integer: ");
            scanner.next();//i've needed this several time, it moves scanner obj forward
                            //allowing to go backk up and ask for antoher nubmer input
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        //use previous work here
        int userInt = getInt();
        //could ask the question:
        if (userInt >= min && userInt <= max) {
            return userInt;
        }else{
            System.out.println("Please enter integer within range: " + min + " and " + max);
            //recursion
            return getInt(min, max);
            //which will return ask range get, input of string will invoke getInt, sad path int input invokes range getInt
        }
    }

    public double getDouble() {
        if (scanner.hasNextDouble()){
            return scanner.nextDouble();
        }else{
            System.out.println("Not");
            scanner.next();
            return getDouble();
        }
    }

    public double getDouble(int min, int max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }else{
            System.out.println("Please enter integer within range: " + min + " and " + max);
            return getDouble(min, max);
        }
    }

    //public void ... need to validate users input back atem:
    public static void main(String[] args) {
        Input in = new Input();
//        say want user to enter in fav word to test
//        System.out.println("Please enter fav word: ");
//        String favWord = in.getString();
//        System.out.println(favWord);
        //a way to use wo the scanner wo actual scanner,
        //getString is to verify an input, can change to getSentence to desscribe

        //bc we are doing more things than string input
//        System.out.print("Will you continue? ");
//        boolean yesNo = in.yesNo();
//        System.out.println(yesNo);

        //getInt is important lesson on avoiding the stack overflow error
        System.out.print("Please enter a whole number: ");
        in.getInt();
        int num = in.getInt();//will create this meth accepting only a valid integer
        System.out.println("You entered: " + num);
        //will continue to ask until integer
        //explain the stack overflow error again:
            //he got it
            //we only move the ... forward inthe happy path
            //if there is anything else in the scanner already will not move forward
            //call getint in the negagive, so scanner.next(); added

        //range input validator
//        System.out.print("Please enter a whole number between 1 and 10: ");
//        int numInRange = in.getInt(1, 10);//like the dice ex
//        System.out.println("You entered " + numInRange);

//        System.out.print("Please enter a number");
//        double dNum = in.getDouble();
//        System.out.println("You entered: " + dNum);

//        System.out.print("Please enter a whole number between 1 and 10: ");
//        double dNumInRange = in.getDouble(1, 10);
//        System.out.println("You entered " + dNumInRange);

//        BONUS - adding ability to input to output to user with prompt and expanding the class
        //add add't params to the methods to do this, q: is this overloading? yes
        //getString with a string

    }















}
