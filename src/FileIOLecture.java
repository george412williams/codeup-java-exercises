import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {


    public static void main(String[] args) {

    //grab a dir and see if it exists
    Path myDirectory = Paths.get("src");
    Path myFile = Paths.get("data","info.txt");
        //looking for file in data folder/directory
    //cross platform work pass ea directory name as sep string arg
        //find examples

    //TESTS(boolean)

        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myFile));

        //NOTES #3 exercise
        Path myGitIgnore = Paths.get(".gitignore");
        System.out.println(Files.exists(myGitIgnore));
        //can also use notExists

    //Creating files

        String directory = "test";
        Path myTest = Paths.get(directory);

        //using if to see if exist and if not create it

        if (Files.notExists(myTest)){
            try {
                Files.createDirectory(myTest);
            } catch (IOException e){
                e.printStackTrace();
                //
            }}
            //going to throw a squiggly saying exception not handled
            //throws aor try catch
                //try catch is good bc is something that we can handle in the code, try catch comes with giving conditional logic

        Path helloFile = Paths.get(directory, "hello.txt");

            if (Files.notExists(helloFile)){
                try{
                    Files.createFile(helloFile);
                    //throws exception, wrap createFile with try catch
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            //writing to hello.txt

            String[] names = {"justin", "sophie", "viv"};
            List<String> instructors = Arrays.asList(names);
                List<String> students = new ArrayList<>();
                    //can add to ArrayList here; remember connot to just List
//                students.add("bill");
//                students.add("sookie");
//                students.add("eric");
            //now write to file
            try{
                Files.write(helloFile, students);
                //(helloFile, students): //is an overwrite that makes it an empty file, until students is written to
            }catch(IOException e){
                e.printStackTrace();
            }

            //read from file (assign to a List, takes in path and )

            //List<String> studentRoster = Files.readAllLines()

        try {
            List<String> studentRoster = Files.readAllLines(helloFile);
            System.out.println(studentRoster);
            //emptied/commented out analog student list and used this to create the list content
        } catch (IOException e) {
            e.printStackTrace();
            //readalllines is assuming we don't have a copy of the list, or know what is inside that list
                //can think of it as start w original list, its updated, readalllines to get updated

            //enhanced for loop:
            //for(String student : myStudents){
            //System.out.println(student); }
        }


    }
}
