//package OopLecture;

public class Person {


//The class should have a constructor that accepts a `String` value and sets
//the person's name to the passed string.
//
//Create a `main` method on the class that creates a new `Person` object and
//tests the above methods.

        public Person (String name) {
                this.name = name;
                //q; could this be used to compress data? a; can add a serializable option to class
                // in web dev you'll see java beans that helps with data compression/transmission,
                //don't know where that actually happens
                //note on constructor, allows in one line set up starting values for properties of the object
        }
        private String name;//instance property of name
//        // SLIDE 3
        private String firstName;
        private String lastName;
//        public Integer age;
//how do we create a person object thing?

        //PERSON GETTERS

        public String getFirstName(){
                return firstName;
        }

        public String getLastName(){
                return lastName;
        }

        public String getName(){
//TODOne: return the person's name
                return name;
                //use this.name; if other things are being defined here, works ok here
        }

        public void setName(String name){
//TODOne: change the name property to the passed value
                //hashing pw algorithm occurs in the setter
                this.name = name;
                //can call this meth in another class, can pass a string value in meth, will take the value and assign
                        //this.name to it, controls how that var is going to change
                //to demonstrate wanted to add some action here with name.toUpperCase();
                        //this will cause in the constuctro to setName(name); bc it has >1 fxality
                                //but constructors will tpyicall just have that one thing : this.name = name;
                                //
        }


        public void sayHello(){//is an instance method
                        //adding String name here does not make sense for an instance meth bc
                        //is relying on acutal objs name, makes it more like a static bc not
                        //depending on info from an obj
//TODOne: print a message to the console using the person's name
                System.out.println("Hello, " + name + "!");
                //also did a simple msg referring name
                //some used (this.getName() + " says hi!");

                //if using a piece of data, getr makes sense;
                // to peek in the data and not display the regular date, fine to use property directly whatever it is
                //this.getName() is more of a peek into the data


        }

        //justin moved his contructor to the top

        public static void main(String[] args) {
                Person individual1 = new Person("Don");
                individual1.sayHello();
                //previous cpy/pst outcomes
                // with == illustrates that although strings are the same, they are diff objs or "Person"s by compairing the hexadecimal id's, see below how to look at them
                //will work with this much with db's coming up here soon
                //where Person person2 = person1; illustrates making a copy, not a whole new object
                Person person1 = new Person("John");
                Person person2 = person1;
                System.out.println(person1.getName());
                System.out.println(person2.getName());
                person2.setName("Jane");
                System.out.println(person1.getName());
                System.out.println(person2.getName());
                person1.sayHello();
                System.out.println(individual1);
                //remember this prints out the class and memory location Person@2938v9 or whatever
                //remember if i need to use private data from another class you call the getter
                //  and if want to manip/mutate pravite data use the setter
        }


//LECTURE NOTES:


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