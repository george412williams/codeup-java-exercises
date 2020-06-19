package annotationsLecture;
import java.util.ArrayList;
import java.util.List;


public class AnnotationsLecture {



    public static void main(String[] args) {

        //from a Parent class
        //Parent.Method();
        Parent.oldMethod(); //crosses out oldMeth indicating deprecated
        //why not just get rid of it

        List l = new ArrayList();
        l.add("test");
        l.add(1);

        System.out.println(l);

        for (int i = 0; i < l.size(); i += 1) {
            System.out.println((int) l.get(i) / 2);
        }
    }
}
