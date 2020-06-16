package abstractLecture;

abstract class Employee extends Person{
    int salary;
    int id;
    String workPlace;

    public abstract void doWork();
    public abstract void lunchBreak();
}
