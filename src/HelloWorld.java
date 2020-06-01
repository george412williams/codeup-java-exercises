public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello, World!");
        //System.out.print("Hello,");
        //System.out.print(" World!");

        int myFavoriteNumber = 8;
        //String myString = 3.14159;
        //char myStringVal = (char) myString;
//        long myNumber = 123;
//        System.out.println(myNumber);
        //long vars are integers and do not have floating decimals
//        float myNumber = 3.14f;
        //can cast float myNumber = (float) 3.14; or 3.14f;
//        double myNumberAllow = (double) myNumber;
        double myNumber = 3.14;
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //String class;
        //is a reserved keyword
        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
        //error 1: string cannot cast to int(numeric)
        //int three = (int) "three";
        //string
        //error 2: here a string literal, class exception
        //int three = (int) o; //produces class exception
//        int x = 4;
//        x += 5;
//        int x = 3;
//        int y = 4;
//        y *= x;
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        //14:lost data
        //sophie example:
        byte randomNumber = 127;
        System.out.println(++randomNumber);
        //-128   sent to the beginning of the range, looped back
        //++randomNumber will then produce -127
        //randomNumber + 10    produced 137  incremintation takes into
        //incremintation takes into account the data type, which has a range to deal with
        //not so with addition of integers, no need to consider data type at that point
    }
}
//ctrl r
