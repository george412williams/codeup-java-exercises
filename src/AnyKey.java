import util.Input;

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



    }

