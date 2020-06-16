package shapes;

public class ShapesTest {



    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        box1.setLength(5);
        box1.setWidth(4);
        //System.out.println(box1);
        box1.getArea(5,4);
        box1.getPerimeter(5,4);
        Rectangle box2 = new Square();
        box2.getPerimeter(5, 5);
        box2.getArea(5, 5);



    }

}
