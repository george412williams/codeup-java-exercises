package arraysLecture;

public class Car {
    public Car(){
        System.out.println("Here's a car");
    }
    private String make;
    private String model;
    private int year;

    //getter
    public int getYear(){
        return year;
    }
    public String getModel(){
        return model;
    }


    //setters
    public void setYear(int year){
        this.year = year;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }

    public void drive(){
        System.out.println("Thump thump..?");
    }

}
