import java.util.Arrays;

public class ArraysExercises {

//    public static addPerson(){
//
//    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] expandGroup = new Person[3];
        expandGroup[0].setName("Mo");
        expandGroup[1].setName("Curly");
        expandGroup[2].setName("Shep");
        for (Person currentGroup: expandGroup){
            System.out.println(currentGroup);
        }
    }
}
