package collections;
import java.util.HashMap;

public class HashMapsLecture {


    public static void main(String[] args) {


        //new
        HashMap<String,Integer> userIds = new HashMap<>();
        //for pw'ds althought minus the encryption
        HashMap<String,String> passwords = new HashMap<>();
        HashMap<Integer,Person> people = new HashMap<>();
        HashMap<String,String> horses = new HashMap<>();

        //now
        //.get is looking for a certain key
        userIds.put("gwillie", 1);
        userIds.put("thatperson", 2);
        userIds.put("jreinhold", 3);
        System.out.println(userIds);
        //can see the KV pairs
        //want assoc val to the key?
        System.out.println("userIds.get(\"gwillie\") results in: " + userIds.get("gwillie"));
        //add't val to .get  .getOrDefault where we try to look for a key
        System.out.print(".get's default value in this case: ");
        System.out.println(userIds.getOrDefault("tpain",202));

        System.out.println(userIds.containsKey("omy"));
            //boolean
        System.out.println(userIds.containsValue(2));
        //userIds.put("gwillie", 2);
        System.out.println(userIds);
        //predict
        //duplicate keys are not legal here, explain, self;
            //in actual app, use containsKey to check for users trying to make unique un's
        userIds.putIfAbsent("gwilli",5);
        userIds.putIfAbsent("gwillie",5);
        System.out.println(userIds.get("gwillie"));
            //in curric, shows how this assures unique keys
        System.out.println("isEmpty give boolean: " + userIds.isEmpty());
        System.out.println("isEmpty give boolean: " + horses.isEmpty());
            //userIds.clear removes all KV pairs, just bc it's empties it remains the orig type, bc of how its made
        //if want to replace what key is storing
        System.out.println(userIds.replace("thatperson",4));
            //replace that key's value to 4 but this sout shows 2 still, has not changed until:
        System.out.println(userIds);
            //this was neat!

    }

}
