import util.Input;

import javax.imageio.IIOException;
import java.io.IOException;

public class AnyKey {


    public static void main(String[] args) {doWorkHomer(); }


        public static String pressAnyKey () {
            Input userInput = new Input();
            //System.out.println("Press any key");
            //yesNo();
            anyKey();

            return pressAnyKey();

        }

    public static boolean yesNo() {
        //System.out.println("Would you like to select another option?");

        Input userInput = new Input();
        return userInput.yesNo();
    }

    public static String anyKey(){
        System.out.println("Press any key");
        Input userInput = new Input();
        try{        System.in.read();}catch(Exception e){	e.printStackTrace();}
        return checkCoreTemperature();
    }

    public static void doWorkHomer() {
        String userInput;
        do {
            userInput = anyKey();
        } while (yesNo());
    }

    public static String checkCoreTemperature() {
        System.out.println("Check core temperature? \nyes/no");
        return anyKey();
    }

    public static void ventReactor(){
        System.out.println("Venting prevents...");

    }


//I've also found it good practice to empty the input stream prior to issuing the prompt. Something like:
//
//public void prompt(String s) throws IOException {
//    while ((int count = System.in.available()) > 0) {
//        System.in.skip(count);
//    }
//    if (s != null) {
//        System.out.print(s);
//    }
//
//    System.in.read();

//}
//
//Of course, this code, and the examples that precede it in this thread,
// don't return on _any_ character. Technically, they only return when a line termination sequence is encountered on the input stream.
// This is because the default 'console mode' for Java is what POSIX calls line-mode.
// To make 'press any key' work, you would have to be able to set the stream to character-mode so that
// each character received would cause an interrupt of the read. Perhaps the JDK 1.4 nio capabilities make this possible,
// but AFAIK there is no way to set System.in so that it receives each character as it is typed.
//
//Best regards,
//Jim Cakalic
    }

