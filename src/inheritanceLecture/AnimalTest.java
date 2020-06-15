package inheritanceLecture;

public class AnimalTest {


    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        a.setAge(3);
        a.setSpecies("Primate");
        d.setAge(7);
        d.setSpecies("Canine");
        c.setAge(2);
        c.setSpecies("Feline");
        //in animal class a meth that...
//        a.makeNoise();
//        d.makeNoise();
//        c.makeNoise();
        System.out.println(a.printSummary());

    }

}
