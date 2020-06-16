package shapes;

public class ShapesTest {



    public static void main(String[] args) {
        Rectangle box1 = new Rectangle();
        box1.setLength(5);
        box1.setWidth(4);
        System.out.println(box1);
        //getp and geta for box1
        Rectangle box2 = new Square(5);
        System.out.println(box2);
        //same

    }

}
