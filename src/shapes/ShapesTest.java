package shapes;

public class ShapesTest {



    public static void main(String[] args) {

        Measurable myShape = new Square(6);
        Measurable r1 = new Rectangle(5,4);

        //outputs
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        //last q
        //System.out.println(myShape.getLength);
            //type is Measurable and will fail here
            //bc





//        Rectangle box1 = new Rectangle(5,4);
////        box1.setLength(5);
////        box1.setWidth(4);
//        //System.out.println(box1);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        //sets us up for polymorphism, can instantiate and store in a new object in one place
//        //important so you can deal with it in more general way, flexible
//        //remember: here a square is a kind of rect, not other way around
//            //rev of parent/child rel
//        Rectangle box2 = new Square(5);
//        System.out.println(box2);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }

}
