package shapes;

public class Rectangle {

    //ARGUMENTS
    protected int length;
    protected int width;

    //CONSTRUCTORS
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
    }

    //METHODS
    public void getPerimeter(int length, int width){
        int perimeter = (2 * length) + (2 * width);
        System.out.println("Perimeter: " + perimeter);
    }

    public void getArea(int length, int width){
        int area = length * width;
        System.out.println("Area: " + area);
    }

    //GETSET
    public int getLength(){
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }


}
