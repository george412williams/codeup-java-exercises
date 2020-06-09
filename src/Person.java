//package OopLecture;

public class Person {


//        // SLIDE 3
//        public String firstName;
//        public String lastName;
//        public Integer age;
//how do we create a person object thing?

        // SLIDE 4

//        // instance variables
        public String firstName;
        public String lastName;
//
//        // instance method
        public String sayHello() {
                return lastName + ", " + firstName + " says hi!";
        }


        // SLIDE 7
//        public static long worldPopulation = 7_500_000_000L; // class property, underscores translate as commas in numbers
        public String name;                                  // instance property
//
//        public static void main(String[] args) {
//
//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
//
//
//                Person theBestDrummerAlive = new Person(); //est an obj
//                theBestDrummerAlive.name = "Neil Peart"; //specific to an instance of the class, thousand people w diff names...
//                Person.worldPopulation += 1; // accessing a static property, adding add'l person
//                // this also works, but is usually not a good idea: refering to a static ina nonstatic way, can be confusing bc you will not see a capital letter indication
                        //will not work the othe way around, must create an instance of a Person
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//                // DONT DO THIS, it will not compile
////                 System.out.println(Person.name);
//        }

}