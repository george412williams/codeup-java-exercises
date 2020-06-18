package shapes;

public class Square extends Quadrilateral {
    //NOTE: added empty/default constructor to Rectangle to enable

    private double side;

    public Square(double side){
        super(side, side);

    }

    //ctrl enter implement

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


    //don't need bc of initial made constructor
//    public Square(){
//
//    }

    //Needed to refactor to get correct bc i was using side
    @Override
    public double getArea() {
        System.out.println("test: in square");
        return Math.pow(this.width, 2);
        //this.length * this.length //this in order to be more specific
    }

    @Override
    public double getPerimeter() {
        System.out.println("test: in square");
        return 4 * this.width;
    }
}
