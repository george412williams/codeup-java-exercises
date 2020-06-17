package shapes;

public class Square extends Quadrilateral {
    //NOTE: added empty/default constructor to Rectangle to enable

    private double side;

    public Square(double side){
        super(side, side);

    }

    //don't need bc of initial made constructor
//    public Square(){
//
//    }

    //Needed to refactor to get correct bc i was using side
    @Override
    public double getArea() {
        System.out.println("test: in square");
        return Math.pow(width, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.println("test: in square");
        return 4 * width;
    }
}
