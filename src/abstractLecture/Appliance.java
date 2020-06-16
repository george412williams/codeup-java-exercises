package abstractLecture;

//add blender and another to complete
abstract class Appliance {

    String brand;
    String color;

    public Appliance(){

    }
//instru used myBrand etc, i assume to better track
    public Appliance(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public abstract void makeSound();
    public abstract void doWork();


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
