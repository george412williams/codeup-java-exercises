package abstractLecture;


//note: cannot instantiate an abstract class
    //y:...you can make a concrete animal, rabbit,
    //
abstract class Animal {
    int age;
    String habitat;
    String species;
    //what are some beh's animals have?
    //an abstract method HAS to be implemented...

    public void sayHello(){
        System.out.println("You greet the animal");
    }

    //can create an abstract method, implementation happens once it's extended
    public abstract void eat();
    public abstract void sleep();
    //if you put in {} that indicate an implementation it faults, see above
    //now lets extend them, create new class, a dog
    public abstract void walk();
    public abstract void swim();
    public abstract void fly();
    //can dogs fly? walk?
    //interfaces come in handy here w more specific implementation
    //don't have to worry about how obs are created
    //public abstract void adopt();
        //instead take this one to an interface


}
