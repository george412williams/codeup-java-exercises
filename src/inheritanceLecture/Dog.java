package inheritanceLecture;

public class Dog extends Animal{

//create default empty contructor class in parent in order to

private String breed;

//if empty/default constructor is not in parent class to instantiate, can use
    public Dog(String species, int age, String breed){
        super(species, age);
        //super(species, age * 7);//you can use some math here if desired
        this.breed = breed;
        //dog specific parameters can be made here just like breed in above
    }


    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    //METHOD OVERRIDE, cpy/pst and change its output, same params and return type but diff outp
    public void makeNoise() {
        System.out.println("bark ruff and a yip");
        //added this to identify ea obj, will use overrides in order to get the animals
        //to make their specific noises
    }
    //use of overloading to define an attrib
//    public void makeNoise(String noise) {
//        System.out.println(noise);
//    }
    //using a diff return type appears to work, but may not, look at it
        //sophie said that this is a new meth as opposed to override/overload
    //public int makeNoise(int x) {
    //  return 2;
    //}

    public void makeGenericAnimalNoise() {
        super.makeNoise();
        //calls on parent with super keyword and invokes parent meth
        //super can be done anywhere in child class meths
    }

    public static void main(String[] args) {
        //commented below because of being able to instantiate above
            //bc don't have empty constructor in Dog class
        //Dog d = new Dog();
        //check the link:
        //d.setSpecies("Canine");

            //public things are inherited, so getSpecies is inheritable....
        //switched to protected in Animal, accessed but null until set
        //usu dealing with private properties
            //not much restrictive bc of gtrs/strs
    }

    @Override
    public String toString() {
        return "Dog{" + "species='" + this.getSpecies() + "' age= " + this.getAge() +
                " breed='" + breed + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "breed='" + breed + '\'' +
//                '}';
//    }


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
