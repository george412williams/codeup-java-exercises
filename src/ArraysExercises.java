import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);//4th spot made
        newPeople[newPeople.length - 1] = newPerson;//newPeople.length is now 4 that does not exist so -1
        //System.out.println(Arrays.toString(newPeople[newPeople.length]);
        return newPeople;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Mo");
        people[1] = new Person("Curly");
        people[2] = new Person("Shep");
        people = addPerson(people, new Person("Larry"));
        for (Person name: people){
            System.out.println(name.getName());
        }
    }
}
