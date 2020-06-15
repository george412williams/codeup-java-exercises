package inheritanceLecture;

public class AnimalTest {

    //POLYMORPHISM
    public static void makeAnimalsNoisy(Animal[] animals) {
        for (Animal a : animals) {
            a.makeNoise();
        }
    }
    //TO CONTINUE THIS EXAMPLE:
    //added an override to cat @Override public void makeNoise(){sout"Meow Meow";}
    //created cat in Cat
    //Cat c = new Cat("Feline", 7, 9)  //age and number of lives
    //d.makeNoise();
    //c.makeNoise();
    //returns their noises
    //could we put these into an array and pass them into makeNoise method so that it will make them make noise

    //ARRAYS
//    Animal[] animals = new Animal[2];
//    animals[0] = d;
//    animals[1] = c;
//    makeAnimalsNoisy(animals);
//    creates array that holds any obj that extendds from animal and makes both noises
    //we have a makeNoise we want to use across various subtypes...


    public static void main(String[] args) {
        Animal a = new Animal();
//        Dog d = new Dog();
        Cat c = new Cat();
//        a.setAge(3);
//        a.setSpecies("Primate");
//        d.setAge(7);
//        d.setSpecies("Canine");
//        d.setBreed("Pug");
//        c.setAge(2);
//        c.setSpecies("Feline");
        //in animal class a meth that...
//        a.makeNoise();
//        d.makeNoise();
//        c.makeNoise();
//        System.out.println(a.printSummary());
//        System.out.println(d.toString());
//        d.makeNoise();
        //d.makeNoise("Bork Bork!");
        Animal ab = new Animal();
        ab.setSpecies("Primate");
        ab.setAge(100);
        //this will default to the parent meth that had an override
        ab.makeNoise();

//        d.makeGenericAnimalNoise();
        //NOTE: i changed main makeNoise meth to reflect which is being output

        //how do we make this happen since meth is in dog, not with ab
        //ab.makeGenericAnimalNoise();

        //at polymorphism
        //say you have a group of animals that make a noise
        //being able to make the outp the type of the parent makes polymorphism possible
    }

}
