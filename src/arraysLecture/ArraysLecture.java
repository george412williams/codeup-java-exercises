package arraysLecture;

import java.util.Arrays;

//notes below

public class ArraysLecture {


//outside of main, array meths inside class, out main, w copy +1...look to loop and do while and compare...
    public static String[] colorsCopy(String[] array){
        String[] newCopy = Arrays.copyOf(array, array.length + 1);//can make array with extra element at end
        return newCopy;
    }





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
        planets[7] = "Neptune";
        //gave a [8] assignement what would happen and gives compile error
            //so we'll see a work around for having to change an array
            //but arrays are used differently here in java
        System.out.println(planets[0]);
        //watch index 0 change
        //using initializer and put in an array literal, similar to JS object literal
            //creating array with values already inside, in JS arrays are objs and beh the same
        int[] myNumbers = {1,2,3,4,5,6,7,8,9,10};
        String[] otherNumbers = {"1","2","3","4","5"};
        //my experiment
        int[] growNumbers = {1,2,3,4,5};
        //q; couldn't work w arrays outside of methods, y? did you make it static?
        // no, if outside main needs static to apply to all class and not just the instance of the object
        //in curric ex, casting as int bc you want whole number of bugs and the  *100); is producing a double with possibility of decimals

        //next portion
        //create an array containing Person objects
        //look at person class to see what contains:(just needs Person class with init'zd vars
            //import peron...
        //to est an array, type and length:
        //Person[] instructors = {new Person(), new Person(), new Person()};
        //System.out.println(instructors[1]);
        //todo sync up Person class to get this working
//        instructors[0] = justin;
//        instructors[1] = new Person("Sophie","K");
//        instructors[2] = new Person("David","Stephens");
//        System.out.println(instructors[2].getLastName());

        //cars; creating array of car obs
        //how does var look like, don't really know how many cars we're going to have so
        Car[] myCars = new Car[5];//like a garage that can hold 5 cars
        myCars[0] = new Car();//now instantiated here
        //now can assign properties directly
        myCars[0].setMake("Nissan");
        myCars[0].setModel("Rogue");
        myCars[0].setYear(2017);

        //at this point had not instantiated the new obj before this sout get exception to where the obj is set setMake"Nissan"
        System.out.println(myCars[0]);
        System.out.println(myCars[0].getModel());

        Car marksCar = new Car();

        //makes new array of same name:
        //Car marksCar = myCars[1];
        myCars[1] = marksCar;
        marksCar.setYear(2017);
        //ford expl...

        //using null to declare array literal, remember opposite of array literal is defining array array length on instantiation
        //Car[] myCars = new Car{new Car(); null; null; null;}
            //sophie indicated that null can place hold for change later and assigned later

    //ITERATING OVER ARRAYS

        //have enhanced for loop, see curric

        String[] theBeatles = {"John", "Ringo", "George", "Paul"};

        //think of beatle element name as a placeholder so that we can do something later in the for loop
        for (String beatle: theBeatles){
            System.out.println(beatle);
        }

        //lets iterate over numbers:
        for (int x: myNumbers){
            ++x;
            System.out.println(x);
            //prints 2-11,
        }

    //MANIP ARRAYS

        //java.util.Arrays
            //int type to work
            //curric for Arrays class meths: fill(whole array with that value); Arrays.equals(to compare arrays types and their elements);
                        //Arrays.copyOf(array, length) copy of array with extra element at end, extending array, a copy one longer; sort is ascending default

        String[] colors = new String[7];
        //use fill to est default value
        Arrays.fill(colors, "blue");
        //assign other default values other than null; like starting w default usernames, maybe just for visitors or whatever
        System.out.println(colors);
        //returns array memory reference
        System.out.println(Arrays.toString(colors));
        //will see what most likely is expected .toString...
        System.out.println(Arrays.equals(myCars, theBeatles));
        //will obv be false bc need to equal type and content
        System.out.println((Arrays.equals(theBeatles,otherNumbers)));

        //just had an idea where you loop through a loop, add a default thing compare to a longer list of the same thing and kill the loop once they are equal, like filling a container until equal...
        //use growNumbers and maybe copyOf +1

//        for (int x: myNumbers){
//            ++x;
//            System.out.println(x);
//            //prints 2-11,
//        }

        //sort

        for (String beatle: theBeatles){
            Arrays.sort(theBeatles);
            System.out.println(theBeatles);
        }

        //using instructors for adding array elements
        //instantiating a new obj that is out of bounds, higher index than max,
        //to include make copy
//        Person[] oneMoreInstructor = Arrays.copyOf(instructors,4);//new length goes here
        //instructors.length + 1 if length unknown(instead of 4 here)
//        System.out.println(Arrays.toString(oneMoreInstructor));
        //reference id's are same
//        oneMoreInstructor[3] = new Person("Mike","Toomany");
//        System.out.println(oneMoreInstructor);
        //toString can be very important when coming to printing out vs display of the id

        //if want copy of string array, what is return type String[]"String array"

        //to call from outside main
        System.out.println(Arrays.toString(colorsCopy(colors)));

        //in curric ex of a matrix, 2d arrays, arrays of arrays in JS, java it is a grid w rowscolumns break down ex, iterate thru ea element first...
        //realworld matric, 2d matrix arrays mainly used for game dev in pixel manip or animation
            //an img is set of pix on a grid, think of chess board ref to row column, in game dev ref positions on a plain
            //so the arrays cross to make a field with coords?

        //arrays and arrays lists are diff and used differently

            //in collections learn array list type, more sim to js arrays

                //arraylist methods in curric familiar to JS
                //so list is diff for a way for dev to make a more manipulation
                //tic tac toe gets an array
                //chess board array, no change
                //dozen eggs, has limit of 12, array
                //never changing vars, array
                //grocery list, array list, always changing
                //sophie game dev
                    //backpack or owned chess
                    //when aquired storage items with slot limit, array for that obj
                    //a water container, my ex, array list for ex





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
//    * See live coding examples in psvm
//    *
//    *
//    *
//    *
//    * */

}
