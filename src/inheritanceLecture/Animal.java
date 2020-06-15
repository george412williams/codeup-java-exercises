package inheritanceLecture;

public class Animal {

//    setting up some things about Animal
    private String species;
    private int age;

    //    not to create some and def public gtrs/strs and constructors
        //    to auto these ctrl/enter

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;

    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal a = new Animal("Primate", 7);
//        depending on the type of animal could have additional info, especially for a different species
    }
}
