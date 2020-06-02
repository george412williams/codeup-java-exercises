import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;

//        Write some Java code that uses the variable pi to output the following:
//The value of pi is approximately 3.14.
//Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        System.out.printf("The value of pi is approximately %.2f.\n", pi);

//Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner sc = new Scanner(System.in);
        //comEnter or altEnter or optEnter to auto import
//        System.out.println("Enter an integer:");
//        int userInt = sc.nextInt();
//        System.out.println("the user entered: " + userInt);

//        System.out.println("Enter three words:");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.nextLine();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
        //System.out.printf("%s%n%s%n%s%n", word1, word2, word3);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println(sentence);

        System.out.println("Enter values of length and width of a classroom at Codeup in feet. \nLength:");
        String roomLength = sc.nextLine();
        System.out.print("width:");
        String roomWidth = sc.nextLine();

        int lengthInt = Integer.parseInt(roomLength);
        int widthInt = Integer.parseInt(roomWidth);
        int roomArea = lengthInt * widthInt;
        int roomPerimeter = (lengthInt + widthInt) * 2;
        System.out.printf("The area of the room is %s sqft, and the perimeter is %s ft.", roomArea, roomPerimeter);
        //could wrap scanner.next linked; just cut out a middle guy
        //Integer.parsInt(sc.nextLine());

        //parseDouble method of parse class to replace parseInt

    }

}