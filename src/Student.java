//package oopLecture;

class Student {

    // ======================== slide 8 (constructors)

        public String name;
        public String cohort;

        //default empty constructor:
        //public Student() {}

    public Student(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }


    //or could get rid of default and pass in some values: (String name, String cohort) { this.name = name; this.cohort = cohort;}
//        public Student(String studentName) {
//            name = studentName;
//            cohort = "Unassigned";
//        }
//
//        public Student(String studentName, String assignedCohort) {
//            name = studentName;
//            cohort = assignedCohort;
//        }


    //intelij helps create:
        //generate -> constructor using commN or rt click generate, handy

    // ======================== slide 9 (this keyword)

//        public String name;
//        public String cohort;
//
//        public Student(String name) {
//            this(name, "Unassigned");
//        }
//
//        public Student(String name, String cohort) {
//            this.name = name;
//            this.cohort = cohort;
//        }

    //can call other constructors using this
    public Student(String name){
        this.name = name;
        this.cohort = cohort;
    }

//
//        public String sayHello() {
//            return "Hello from " + this.name + "!";
//        }


    // ======================== slide 10 (visibility)

//        public String name;
//        private double grade;
//
//        public Student(String name, double grade) {
//            this.name = name;
//            this.grade = grade;
//        }
//
//        public double shareGrade() {
//            return grade;
//        }
//

//make a getter method, to return data type of that property, private:
//
//    public String getTitle(){
//        return this.title;
//    }
    //can also make a setter in same way

    //where main is:
    //post.setTitle("A Walk in the Park");
    //setTitle is a public method and accessible
    //to see value:
    //sout(post.getTitle()); //consoles the title
    //can use other keywords than public, best private, if private needs getter and setter
}