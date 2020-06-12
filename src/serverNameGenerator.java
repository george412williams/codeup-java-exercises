import java.util.Random;

public class serverNameGenerator {

    private static String[] nouns = {
      "terminator",
      "tool",
      "tower",
      "power",
      "eye",
      "powder",
      "chowder",
      "cream",
      "soda",
      "tin"
    };

    private static String[] adjectives = {
      "neat",
      "tops",
      "flipped",
      "rounded",
      "red",
      "sad",
      "hot",
      "slippery",
      "wet",
      "rocky"
    };

    static Random randomizer= new Random();

    //take in array and get random index
    public static String randomItem(String[] words) {
        return words[randomizer.nextInt(words.length)];//find a way to generate the random int
        //will gen a rand int 1 to 10, the length of the arrays
        //next req she decided to make a method to print and hyphenate for her
    }

    public static String serverName(String a, String b){
        return "Your new server name is: " + a + "-" + b;
    }

    //stated that organizing into methods is more her style, one among many

    public static void main(String[] args) {
        System.out.println(serverName(randomItem(adjectives),randomItem(nouns)));//pass in the randomElem
        System.out.println(serverName(randomItem(adjectives),randomItem(nouns)));
        System.out.println(serverName(randomItem(adjectives),randomItem(nouns)));


    }
}
