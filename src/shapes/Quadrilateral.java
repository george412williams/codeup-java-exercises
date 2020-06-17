package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
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
