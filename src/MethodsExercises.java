import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    //1

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    public static int mult(int num1, int num2){
        return num1 * num2;
    }
    public static int div(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    public static double loopMultiply(double a, double b) {
        double result = 0;
        for (double i = 0; i < a; i++) {
            result += b;
        }
        return result;
    }

    //inst made a testArith method to test as a main, then called testArith in main

    //1 - recursion: instructor solutions

    public static double recursiveMultiply (double a, double b){
        if(a == 0 || b == 0) {
            return 0;
        }
        return a + recursiveMultiply(a, b-1);
    }

    //2

    //mine:
//    public static int getInteger(int min, int max) {
//        Static Scanner sc = new Scanner(System.in);
//        //int userInput = sc.nextInt();
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        if (min <= userInput && max >= userInput) {
//            System.out.println("Input accepted.");
//
//        } else {
//            System.out.println("Please try again.");
//        }
//            return userInput;
//    }
    //instru:
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.printf("Enter a number between %d and %d: ", min, max);
        //int userInput = getInteger(1, 10);
        if (userInput < min || userInput > max) {
            System.out.println("Please try again.");
            //call it again to ask again
            return getInteger(min, max);
        } else {
            System.out.println("Input accepted.");
        }
        return userInput;
    }
    //3

    public static long numberFactorial (long n) {
        System.out.printf("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();//getInteger(min, max);
        //answer.sc.....
        long fact = 1;
        for (int i = 1; i <= userNumber; i++) {
            fact *= i;
            //if else to add if number is less than user pring i + x else i + = + factorialrecussion(number);
        System.out.println(i + "! = " + fact);
        }
        return userNumber;
    }

//

//        do {
//
//        } while (n <= userNumber);
//        return userNumber;
//    }

        //getInteger(1, 10);

    //4

    public static int pairDiceRoll (int s) {
        //pairDiceRoll(getInteger(1, 20));  //previous prompt
        System.out.print("Enter number of sides for dice pair (20 max): ");
        Scanner sc = new Scanner(System.in);
        int sidesNumber = sc.nextInt();
        System.out.print("Enter 1 to roll: ");
        int rollEm = sc.nextInt();
        int min = 1;
        int max = sidesNumber;
        if (rollEm == 1){
            Random rand = new Random();
            int randRoll1 = rand.nextInt(sidesNumber);//(int)(Math.random() * sides) + 1;
            int randRoll2 = rand.nextInt(sidesNumber);
            System.out.println("Dice total = " + ((sidesNumber * randRoll1) + (sidesNumber * randRoll2)));
        } //else loop back ask for sidesNumber

        return sidesNumber;
    }

    //instr put 4 in the main method w a dowhile loop


    //5



    //bonus



    //main

    public static void main(String[] args) {
        //1
        System.out.println(add(2, 3));
        System.out.println(subtract(5, 2));
        System.out.println(mult(2, 6));
        System.out.println(div(10, 2));
        System.out.println(modulus(50, 5));
        //2
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        numberFactorial(userInput);
        pairDiceRoll(userInput);


    }
}
