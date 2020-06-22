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
            //now write to file
            try{
            Files.write(helloFile, instructors);
            //(helloFile, students): //is an overwrite that makes it an empty file
        }catch(IOException e){
                e.printStackTrace();
            }

    }


}
