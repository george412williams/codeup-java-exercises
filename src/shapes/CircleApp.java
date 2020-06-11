package shapes;
import util.Input;//for Input class in utils

public class CircleApp {

    public static void main(String[] args) {
        //get the value of the radius using input class
        Input in = new Input();
        System.out.println("Enter a radius. Recieve Area and Circumference ");
            //need to import, several diff choices, important when working with a framework
            //with lg techs could have sim names in other packages so imports need to keep straight
        double radius = in.getDouble();
        Circle c = new Circle(radius);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
