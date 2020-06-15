public class Jet extends Vehicle {

    private int maximumAltitude;

    public void takeOff(){
        System.out.println("Taking off...");
    }

    public Jet(){

    }

    @Override
    public void turnOn(){
        System.out.println("Igniting jet engines...");
    }

    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = maximumAltitude;
    }

    public Jet(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    //gtrs/strs

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    @Override
    public String toString() {
        return "Jet{" +
                "maximumAltitude=" + maximumAltitude +
                '}';
    }
}
