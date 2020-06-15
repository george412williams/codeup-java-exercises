package inheritanceLecture;

public class Dog extends Animal{

//create default emptly contructor class in orig:


    public static void main(String[] args) {
        Dog d = new Dog();
        //check the link:
        d.setSpecies("Canine");
        System.out.println(d.getSpecies());
            //public things are inherited, so getSpecies is inheritable....
        //switched to protected in Animal, accessed but null until set
        //usu dealing with private properties
            //not much restrictive bc of gtrs/strgs
    }



//    private String species;
//    private int age;
//    private String breed;
//
////    duped code: right now, no inheritance occurring
////
//
//    public Dog(String species, int age, String breed) {
//        this.species = species;
//        this.age = age;
//        this.breed = breed;
//    }
//
//    public String getSpecies() {
//        return species;
//    }
//
//    public void setSpecies(String species) {
//        this.species = species;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getBreed() {
//        return breed;
//    }
//
//    public void setBreed(String breed) {
//        this.breed = breed;
//    }
//
}
