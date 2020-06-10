//package OopLecture;

public class Person {

        private String name;

        public String getName(){
//TODOne: return the person's name
                return name;
        }

        public void setName(String name){
//TODOne: change the name property to the passed value
                this.name = name;
        }
        public void sayHello(){
//TODOne: print a message to the console using the person's name
                System.out.println("Hello, " + name + "!");
        }
//The class should have a constructor that accepts a `String` value and sets
//the person's name to the passed string.
//
//Create a `main` method on the class that creates a new `Person` object and
//tests the above methods.

        public Person (String name) {
                this.name = name;
        }

        public static void main(String[] args) {
                Person individual1 = new Person("Don");
                Person person1 = new Person("John");
                Person person2 = person1;
                System.out.println(person1.getName());
                System.out.println(person2.getName());
                person2.setName("Jane");
                System.out.println(person1.getName());
                System.out.println(person2.getName());
                person1.sayHello();
        }


//LECTURE NOTES:

//        // SLIDE 3
//        public String firstName;
//        public String lastName;
//        public Integer age;
//how do we create a person object thing?

        // SLIDE 4

//        // instance variables
//        public String firstName;
//        public String lastName;
//
//        // instance method
//        public String sayHello() {
//                return lastName + ", " + firstName + " says hi!";
//        }

        // SLIDE 7
//        public static long worldPopulation = 7_500_000_000L; // class property, underscores translate as commas in numbers
//
//        public static void main(String[] args) {
//
//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
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