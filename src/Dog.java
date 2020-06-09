//package OopLecture;

public class Dog {

    // relating to slide 3

    public String name;
    public String breed;
    public final String animalType = "Canine";
    public boolean canBreed;
    public int age;

    // relating to slide 4
    public void callForDog(String name) {
        //can pass in a name to call the dog like "Sparky"
        //void return type so only souts
        if (name.equalsIgnoreCase(this.name)) {
            //here "name" with 'this' keyword, specific, white name refers to param, what's passed in meth
            //to distinguish btwn the two use the 'this' keyword
            System.out.println(this.name + " is now walking toward you!");
        } else {
            System.out.println(this.name + " ignores you.");
        }
    }

}