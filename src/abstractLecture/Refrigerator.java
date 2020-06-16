package abstractLecture;

public class Refrigerator extends Appliance {

    public Refrigerator(String brand, String color){
        super(brand, color);
            //default to parent
    }
//
//    public Refrigerator(){
//
//    }

    @Override
    public void makeSound() {
        System.out.println("hummmm");
    }

    @Override
    public void doWork() {
        System.out.println("Cold Fridgeration");
    }
}
