import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;

//        Write some Java code that uses the variable pi to output the following:
//The value of pi is approximately 3.14.
//Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        System.out.printf("The value of pi is approximately %.2f.", pi);

//Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner sc = new Scanner(System.in);
        System.out.print("");
        //Int userInput = sc.nextInt();

    };

}