import java.util.Scanner;

public class OopLecture {
    //NOTE: cannot def a class as static: bonus: why?

    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)
        Scanner sc = new Scanner(System.in);

//not a string, an int or byte, is a person (object)

//            Person rick = new Person();//allowed after creating Person class: Person.java
//            // new Person(); syntax resolves into an obj, 'rick created from person class'
//            // currently no values, now using dot syntax:
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            rick.age = 23;
//            System.out.println(rick.firstName);
//            System.out.println(rick.lastName);
//            System.out.println(rick.age);
//
//        //making another custom object
//            //User user = new User();//won't let happen, just need new user class
//
//        //cpy/pst and add the data for a whole other person object
//            Person fred = new Person();
//            fred.firstName = "Fred";
//            fred.lastName = "Smith";
//            System.out.println(fred.firstName);
//            System.out.println(fred.lastName);
            //can attch a user obj to a person class
            //public class status;

            //these are two diff objects
            //could refer to them as p1 and p2 if desired, must match their corresponding refs

            //with a ref type that is initialized with no value yet default status is 'null'
            //for all data types will default to 0 if nothing explicit
            //default for char is the empty box character and boolean is false
                //he experimented to find out in the run console

            //can assign a default value in the associated class
            //so making age default -1, bc you can have a newborn at zero which has a connotation
                //as opposed to no connotation of an absolute zero, ex a zero with a meaning should not be a default
                //redefining in the main is what ultimately goes
            //a q on dupe obs; its ok, to sep would need a uniqe identifyer, the lang creates own spec id when all matches
                //ex he created two rick smith, rick1 and rick2 otherwise identical
                //compare obs using == sim to string compare
//        System.out.println(rick1 == rick2); false bc obs made in java have unique id's given
        //sout rick1 and sout rick2:  gives package and name of class followed by hexavalue that is specific to that obj
            //just both rick will give compile error, already declared, can't dupe names
            // if you have same obs back to back, will just reassign to most recent,
                //can always add another property to more specifically id

                    //me experiement:  same name, same properties, diff values, what happens?


        // -- Dog Example --


//            Dog d1 = new Dog();
//                //creating a new dog obj
//                //term: instance: same thing as obj, saying an instance of a class,
//                    //from this blueprint you make others with their specific values
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



        // ======================== slide 4 (object fields)

            Person rick = new Person();
            rick.firstName = "Rick";
            rick.lastName = "Sanchez";
            System.out.println(rick.sayHello());
                //this sout invokes the method, instead of name property its a method with ()
                //return type is string

        // -- Dog Method Example --

            Dog d1 = new Dog();
            d1.age = 3;
            d1.breed = "corgi";
            d1.canBreed = false;
            d1.name = "Tater";

            d1.callForDog("Tater");


        // ======================== slide 5 (class fields)


//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --




        // ======================== slide 7 (class vs. object fields)

//            Person theBestDrummerAlive = new Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



        // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.printx(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead

    }





    }

