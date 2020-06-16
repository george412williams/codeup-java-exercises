package shapes;

public class Square extends Rectangle {
    //NOTE: added empty/default constructor to Rectangle to enable

    private int side;

    public Square(int side){
        this.side = side;
        super.length = side;
        super.width = side;
    }

}
