import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {


    public static void main(String[] args) throws IOException{
                                            //this throws first needed instance is the enhanced for loops example
                                            //try catch is better at least to show that you id'd a specific exception
                                            //and are directly targeting it, so as to allow the ability to id other
                                            //exceptions that will arise elsewhere that may require a different approach

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

        try {
            List<String> studentRoster = Files.readAllLines(helloFile);
            System.out.println(studentRoster);
            //emptied/commented out analog student list and used this to create the list content
        } catch (IOException e) {
            e.printStackTrace();
            //readalllines is assuming we don't have a copy of the list, or know what is inside that list
                //can think of it as start w original list, its updated, readalllines to get updated

        }
            //enhanced for loop:
            List<String> myStudents = Files.readAllLines(helloFile);
            for(String student : myStudents){
            System.out.println(student); }

            //Add line to exist file
//            Files.write(
//                    helloFile, Arrays.asList("Ramon"), StandardOpenOption.APPEND);
            //or
            String newStudent = "Ramon";
            List<String> newStudents = Arrays.asList("Dan","Justin","Julia");
            Files.write(helloFile, newStudents, StandardOpenOption.APPEND);

            //curric example; how replace certain line in text file instead of append/overwriting
                //not list modify, code makes new list that we write to file, a mod'd cpy, overwritten
                //iterating thru lines list

            //at this point myStudents is a full list
                //empty the arraylist with

            List<String> newClass = new ArrayList<>();

            for(String student : myStudents){
                //replace name
                if (student.equals("Dan")){
                    newClass.add("Phil");
                    continue;
                }
                newClass.add(student);
                //don't add dan, add phil
                //before it changes need write to file
                Files.write(helloFile,newClass);
                System.out.println(newClass);
            }


    }
}
