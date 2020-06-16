package abstractLecture;

public class Dog extends Animal implements CanWalk, CanSwim{
    //when first added extends, red bc must implement the abstract
    //methods or declare this class as abstract
    //this way we inherit parent stuff like the hello thing
        //added implements CanWalk

    //OVERRIDES:
    @Override
    public void eat() {
        System.out.println("eats!");
    }

    @Override
    public void sleep() {
        System.out.println("sleeps!");
    }

    @Override
    public void moveForward() {
        System.out.println("mvsfwd");
    }

    @Override
    public void moveBackward() {
        System.out.println("mvsbkwd");

    }

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void swimForward() {

    }

    @Override
    public void swimBackward() {

    }

    @Override
    public void fly() {

    }
}
