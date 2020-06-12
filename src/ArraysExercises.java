import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people){
        Person[] newPerson = Arrays.copyOf(people, people.length + 1);
        return newPerson;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Person[] exPeople = {new Person(String), new Person("Curly"), new Person("Shep")};
        Person[] people = new Person[3];
//        //expandGroup[0] = new Person();
        people[0] = new Person("Mo");
        people[1] = new Person("Curly");
        people[2] = new Person("Shep");
//        for (Person expandGroup: current){
//            System.out.println(expandGroup.getName());
        //}
        for (Person current: people){
            System.out.println(current.getName());
        }
        Person[] newPerson = Arrays.copyOf(people,people.length + 1);
        //System.out.println(Arrays.toString(newPerson));
        newPerson[3] = new Person("Mike");
        //System.out.println(addPerson(Arrays.toString());
        //System.out.println(people);
        System.out.println(Arrays.toString(addPerson(people)));


        }
    }

