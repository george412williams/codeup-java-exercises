package arraysLecture;
//notes below

public class ArraysLecture {








    public static void main(String[] args) {
        //can pass this in:
        int numberOfPlanets = 8;
        //anything eval'ing as an int can be passed as an index
        String[] planets = new String[numberOfPlanets];//an int goes here either way to indicate length
        //array of strings of 8 items
        //can initiate like: String[] planets; and new Strin....
        //syntax for array position as in JS
        System.out.println(planets[0]);//first element return
        //read null bc no value set yet there
        planets[0] = "Mercury";
        System.out.println(planets[0]);
        //watch index 0 change
        //using initializer and put in an array literal, similar to JS object literal
            //creating array with values already inside, in JS arrays are objs and beh the same

    }



//    ==== NOTES ====

//    * DATA TYPES REVIEW
//    *   Arrays are reference type; in java !mix data types
//            null is default empty value/object/string
//            * can contain any type
//    *
//    * Fixed Length  (remember push pop un/shift)
//    *   JS arrays do not have a fixed length
//    *   Java arrays are declared with a fixed length
//    *   going beyond it give compile time error
//    *
//    * See live coding examples
//    *
//    *
//    *
//    *
//    * */

}
