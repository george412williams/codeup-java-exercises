package shapes;
import util.Input;//for Input class in utils

public class CircleApp {

    public static void main(String[] args) {
        //get the value of the radius using input class
        Input in = new Input();
        //BONUS do while

        boolean willContinue = false;//by default
        do {
        System.out.println("Enter a radius. Recieve Area and Circumference ");
            //need to import, several diff choices, important when working with a framework
            //with lg techs could have sim names in other packages so imports need to keep straight
        double radius = in.getDouble();
        Circle c = new Circle(radius);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
            System.out.println("Do you want to go again?");
            willContinue = in.yesNo();//look up in. some more, but allows yesNo's use

        }while(willContinue);
        System.out.println("Adios.");
        //good one to look at how this one is failing to allow the loop back, remember .next() helped earlier

    }
}
