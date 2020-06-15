package inheritanceLecture;

public class Dog {

    private String species;
    private int age;
    private String breed;

//    duped code: right now, no inheritance occurring
//

    public Dog(String species, int age, String breed) {
        this.species = species;
        this.age = age;
        this.breed = breed;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog d = new Dog("Canine", 2, "Hound");
    }
}
