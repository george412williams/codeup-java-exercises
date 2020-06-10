package util;
import java.util.Scanner;


public class Input {

    static Scanner scanner;
    public Scanner getScanner(){
        return scanner;
    };

    public Input (String thing) {
        this.scanner = new Scanner(System.in);
        //this creates a new one every time its used, aka called
    }

    public void getString(){
        System.out.println("Please type in a string.");
        String userBoolean = scanner.nextLine();

    }

    //public void ... need to validate users input back atem




}
