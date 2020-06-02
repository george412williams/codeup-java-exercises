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
        //int userInput = sc.nextInt();

//        System.out.println("Enter three words:");
//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        String word3 = sc.nextLine();
//
//        System.out.println("Enter a sentence:");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.println("Enter values of length and width of a classroom at Codeup in feet. Length:");
        String roomLength = sc.nextLine();
        System.out.println("width:");
        String roomWidth = sc.nextLine();


        int lengthInt = Integer.parseInt(roomLength);
        int widthInt = Integer.parseInt(roomWidth);
        int roomArea = lengthInt * widthInt;
        int roomPerimeter = (lengthInt + widthInt) * 2;
        System.out.printf("The area of the room is %s sqft, and the perimeter is %s ft.", roomArea, roomPerimeter);
    }

}