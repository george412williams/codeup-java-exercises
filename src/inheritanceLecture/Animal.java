package inheritanceLecture;

public class Animal {

//    setting up some things about Animal
    private String species;
//    protected String species;
    private int age;

    //    not to create some and def public gtrs/strs and constructors
        //    to auto these ctrl/enter

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;

    }

    public Animal() {
        //made for Dog class
    }

    public void makeNoise() {
        System.out.println("This animal, " + this + ", is making some noise...");
        //added this to identify ea obj, will use overrides in order to get the animals
        //to make their specific noises
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

    //in prev ex saw print summaries:
    public String printSummary() {
        return "Species: " + this.species + "\nAge: " + this.age;
        //inheritable...animaltest it
    }
    //instead, use toString()

//    public String toString() {
//        //overriding this fxality
//        return "Species: " + this.species + "\nAge: " + this.age;
//    }
    //can auto create this ctrl/enter  option to generate string method, choose which properties
    //intellij creates it


    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }
}
