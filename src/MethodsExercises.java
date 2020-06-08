import java.util.Scanner;

public class MethodsExercises {

    //1

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    public static int mult(int num1, int num2){
        return num1 * num2;
    }
    public static int div(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    //1 - recursion

    //2

    Scanner sc = new Scanner(System.in);

    int userInput = sc.nextInt();

//    public static int getInteger(int min, int max){
////        if ( >= min && <= max) {
////
////        }
////    }

    //3



    //4



    //5



    //bonus


    public static void main(String[] args) {
        //1
        System.out.println(add(2, 3));
        System.out.println(subtract(5, 2));
        System.out.println(mult(2, 6));
        System.out.println(div(10, 2));
        System.out.println(modulus(50, 5));
    }
}
