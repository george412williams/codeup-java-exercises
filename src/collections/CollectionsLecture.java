package collections;
import java.util.ArrayList;
import java.util.Arrays;


public class CollectionsLecture {


    public static void main(String[] args) {
        //creating array lists, basic one here
        ArrayList<String> instructors = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();


        //make a new java class
        ArrayList<Person> people = new ArrayList<>();
            //empty but instantiates
        //so in the arrow brackets is the type, a list of this type perse

        //meths in curric, similar to: ....
            //.indexOf returns first instance of that index
            //.size return type always int bc will always have a whole number of things in an array

                //mult at time:
                    //List<Integer threeNumbers = Arrays.asList(10,2,6);
                        //why use List, the more general list type? give it more capability, moving only means a change in implementation, less work to be more flexible
                    //List<Integer> numbers = new ArrayList<(Arrays.asList(threeNumbers));
                            //always strive to be more 'general'

        //adding elements to array list, to curric
        instructors.add("Justin");
        instructors.add("Sophie");
        instructors.add("Casey");
        instructors.add("Vivian");
        //indexed in order added
            //experiment, change their order here later and see if change in output
        //cannot sout array only give id's
        //arraylist has built in toString method
        System.out.println(instructors);

        //now lets add some numbers
        numbers.add(10);
        numbers.add(2);
        numbers.add(7);
        //watch out for failure due to type, example decimal making it a double when we need int here

        people.add(new Person("bob", "ross"));
        people.add(new Person("jane", "goodall"));
        //if sout will look like? get hash code id's

        System.out.println("no. of obs in this list: " + instructors.size());
        System.out.println("numbers.get at 1: " + numbers.get(1));
            //should get 2
        numbers.add(10);
            //bc allows for dupe
        System.out.println("numbers.indexOf(10): " + numbers.indexOf(10));
            //should be 0... asking for nonexistant things returns -1
        System.out.println("numbers.indexOf(20): " + numbers.indexOf(20));
        //sout below fails...learn
        //System.out.println("numbers.get at 5: " + numbers.get(5));
        people.add(0, new Person("john","smith"));
        System.out.println("previous output 4,2,0,-1");
        //printing string vs int, one gets hash id's
        System.out.println(instructors);
        System.out.println(people);
        //for ()
        System.out.println("numbers.lastIndexOf(10): " + numbers.lastIndexOf(10));
        System.out.println(instructors.isEmpty());
            //false
            //instr also made an empty one to show a true;

        //removing obs
        //.remove two variants; can remove by ref by name or index
        instructors.remove("sophie");
        System.out.println(instructors);
        instructors.remove("Sophie");
        System.out.println(instructors);



    }
}
