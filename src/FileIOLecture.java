import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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


    }


}
