public class Refrigerator extends Appliance {

    public Refrigerator(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public Refrigerator(){

    }

    @Override
    public void makeSound() {
        System.out.println("hummmm");
    }

    @Override
    public void doWork() {
        System.out.println("Cold Fridgeration");
    }
}
