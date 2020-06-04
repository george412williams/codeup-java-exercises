import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respBob = sc.next();
        System.out.println("This is Bob.");
        if (respBob.endsWith("?")) {
            System.out.println("Sure.");
        }else

        if (respBob.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        }else

        if (respBob.startsWith(" ")) {
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever.");

        }

    }
}
