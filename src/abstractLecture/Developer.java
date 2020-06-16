package abstractLecture;

public class Developer extends Employee {
    //inherits both, all up the family tree
    public Developer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //override:

    @Override
    public void doWork() {

    }

    @Override
    public void lunchBreak() {

    }


}
