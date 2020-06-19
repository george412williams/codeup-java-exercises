package annotationsLecture;

public class Parent {

    public void theMethodToSaysWhatItIs() {
        System.out.println("I am the parent");
    }

    @Deprecated
    public static void oldMethod() {
        System.out.println("Old way");
    }

    public static void newMethod() {
        System.out.println("New way");
    }
}
