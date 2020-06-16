package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){

    }

    public void getPerimeter(int length, int width){

    }

    public void getArea(int length, int width){

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
