package grades;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;





public class Student {

    private Scanner scanner;
    public Scanner getScanner(){
        return scanner;
    };


    //need public Student class!!!!!!!!

    this.grades = ArrayList<Integer>

    private String name;
    private int grade;

    List<Integer> grades = new ArrayList<Integer>();

    //instru used StringBuilder class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //does the student here take in both name and grade
    public Student(String name, int grade){

    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        for (int grade : grades) {
            int sum = 0;
            //(grade += grade)/(grades.size());
            sum += grade;

        }


        return getGradeAverage();
    }

    public String GradesApplication(){

    }






    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Options: ...: ");
        scanner.nextInt();
        //in.getInt();


        //options interface:
        //1. Print Student with Grade
        //2. Add a Student Grade

        //getName

    }
}
