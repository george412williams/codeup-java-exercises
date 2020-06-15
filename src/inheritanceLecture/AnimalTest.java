package inheritanceLecture;

public class AnimalTest {


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
        //a.makeGenericAnimalNoise();
    }

}
