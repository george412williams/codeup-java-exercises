public class Car extends Vehicle {
    //instead of strs, use super method like Jay for practice

    private int milesPerGallon;

    public void depoyAirBag(){
        System.out.println("Deploying airbag...");
    }

    public Car(){

    }

    @Override
    public void turnOn() {
        System.out.println("Cranking engine...");
    }

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon) {
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    public Car(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    //gtrs/strs


    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon=" + milesPerGallon +
                '}';
    }

}
