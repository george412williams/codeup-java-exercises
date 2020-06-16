package shapes;

public class Rectangle {

    //ARGUMENTS
        //changed from int to allow decimals for later use
    protected double length;
    protected double width;

    //CONSTRUCTORS
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
    }

    //METHODS
    //they don't take any args bc rely on the obj properties
    //if static methods then yes use params, here just getting info
    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public double getArea(){
        return length * width;
    }

    //GETSET
    public double getLength(){
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }


}
