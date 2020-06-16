package abstractLecture;

public class DeveloperTest {


    public static void main(String[] args) {
        Employee firstDev = new Developer("Jane","Doe");
        //actuall impl depends on obj and not the implementation...
        firstDev.doWork();
        firstDev.lunchBreak();

    }
}
