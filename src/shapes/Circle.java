package shapes;

public class Circle {
//buildling game with diff enemies on screen can get a method with particlur stats, method say to remove it from game
    //here able to create a bunch of different circles given a radius that can be tracked as a property value

    private double radius;

    //radius getter and setter next


//constructor:
    public Circle(double radius){

    };
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    };
    public double getCircumference(){
        return 2 * Math.PI * radius;
    };

    //BONUS    use a loop and yesNo in circleapp


    public static void main(String[] args) {

    }
}
