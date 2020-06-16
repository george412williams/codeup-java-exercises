package abstractLecture;

public class Dog extends Animal {
    //when first added extends, red bc must implement the abstract
    //methods or declare this class as abstract
    //this way we inherit parent stuff like the hello thing

    //OVERRIDES:
    @Override
    public void eat() {
        System.out.println("eat!");
    }

    @Override
    public void sleep() {
        System.out.println("sleep!");
    }
}
