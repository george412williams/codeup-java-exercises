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


}
