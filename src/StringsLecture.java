import java.util.Scanner;

public class StringsLecture {
        public static void main(String[] args) {

//        Uncomment the Scanner and String variables.

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter your name:");

        String input = sc.nextLine();

        String name = "Jane Doe";

        /*
         *  TO DO: Write the control statements below to check the input
         *  String using Java methods.
         */

        //  If the input is an exact match to String name...
        //  Print message: "Welcome Jane Doe!"
            if (input.equals(name)){
                System.out.println("Welcome Jane Doe!");
            }

        //  If the input is not capitalized correctly...
        //  Print message: "Names are proper nouns."
            if(input.equalsIgnoreCase(name)){
                System.out.println("Names are proper nouns.");
            }

        //  If the input starts with "Jane"...
        //  Print message: "Hi Jane!"  Manip method .startsWith
            if (input.startsWith(name)){
                System.out.println("Hi Jane!");
            }

        //  If the input ends with "Doe"...
        //  Print message: "Doe, a deer..."
            if (input.endsWith("Doe")){
                System.out.println("Doe, a deer...");
            }

        /*
         *  TO DO TOGETHER: Uncomment each line and view the results of each
         *  String manipulation method.
         */

//String name = "Jane Doe"
//        System.out.println(name.charAt(3));//index starts at 0 remember
//        System.out.println(name.indexOf("Doe"));//index where it starts, here 5
//        System.out.println(name.lastIndexOf("e"));//7 bc its last index
//        System.out.println(name.length());//8 all characters including space, not 0 indexed, measuring
//        System.out.println(name.replace("Doe", "Smith"));//neat, is a macro, returns string, takes in string pattern, the sting you want to replace, and what to replace with
//        System.out.println(name.substring(3));//tricky, parse string of this string(to these string coordinates), takes one or two params, only one takes substring to end of string, second param is for the stopping point
//        System.out.println(name.substring(0,3));//Jan, bc puts a wall where it ends, cutting point// substring(3).toUpperCase().indexOf(); chaining here//watch types!//loops lesson: final example she used ignoreCase could have changed to all upper or lower and checked for all one case of a string to find camelcases
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());

        // trim is really useful for catching user errors on input. for clean comparisons from user error spacing.
//        String trimThis = "    too many spaces   ";
//
//        System.out.println(trimThis);
//        System.out.println(trimThis.trim());//store trimThis.trim() into another variable to preserve, have a clean copy of the original to compare say to ctrol structures

        // How would we fix this?  // need a \ for each character!
//        System.out.println("Here is a backslash \\");

    }
}
