public class VehicleTest {


    public static void turnOnVehicles(Vehicle[] vehicles){
        for (Vehicle v : vehicles) {
            v.turnOn();
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car car = new Car();
        Jet j = new Jet ();
        v.setOperable(true);
        v.setPassengerCapacity(4);
        v.setPowerSource("solar");
        car.setOperable(false);
        car.setPassengerCapacity(2);
        car.setPowerSource("electric");
        j.setOperable(true);
        j.setPassengerCapacity(16);
        j.setPowerSource("gas-combustion");
//        System.out.println(v.toString());
//        System.out.println(car.toString());
//        System.out.println(j.toString());
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = j;
        vehicles[1] = car;
        turnOnVehicles(vehicles);
    }

}
