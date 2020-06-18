package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    //ctrl enter implement...
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    //ARGUMENTS
        //changed from int to allow decimals for later use
    protected double length;
    protected double width;

    //CONSTRUCTORS
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        //super(length, width);
    }

    public Rectangle(){
    }

    //METHODS
    //they don't take any args bc rely on the obj properties
    //if static methods then yes use params, here just getting info
    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
        //return this.length...this one!
    }

    public double getArea(){
        return this.length * this.width;
    }

    //GETSET
    public double getLength(){
        return length;
    }
    public double getWidth() {
        return width;
    }
    //commented to reflect flow of exersice shown during wt
//    public void setLength(double length) {
//        this.length = length;
//    }
//    public void setWidth(double width) {
//        this.width = width;
//    }


}
