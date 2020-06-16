package shapes;

public class Square extends Rectangle {
    //NOTE: added empty/default constructor to Rectangle to enable

    private int side;

    public Square(int side){
        this.side = side;
        super.length = side;
        super.width = side;
    }

    public Square(){

    }

    @Override
    public void getArea(int length, int width) {
        super.getArea(length, width);
    }

    @Override
    public void getPerimeter(int length, int width) {
        super.getPerimeter(length, width);
    }
}
