package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;

    }

    public Quadrilateral(){

    }

    public double getLength() {
        return length;
    }

//    abstract void setLength(int length);

    public double getWidth() {
        return width;
    }

//    abstract void setWidth(int width);
}
