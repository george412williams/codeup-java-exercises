import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //      EX 4

    String resp = "";
    do {
        System.out.println("Enter Numeric grade 1 - 100:");
        long userGrade = sc.nextInt();
        //A
        if (userGrade <= 100 && userGrade >= 98) {
            System.out.println("A+");
        }
        if (userGrade <= 97 && userGrade >= 93) {
            System.out.println("A");
        }
        if (userGrade <= 92 && userGrade >= 88) {
            System.out.println("A-");
        }

        //B
        if (userGrade <= 87 && userGrade >= 86) {
            System.out.println("B+");
        }
        if (userGrade <= 85 && userGrade >= 80) {
            System.out.println("B");
        }        if (userGrade <= 84 && userGrade >= 80) {
            System.out.println("B-");
        }

        //C
        if (userGrade <= 79 && userGrade >= 77) {
            System.out.println("C+");
        }
        if (userGrade <= 76 && userGrade >= 71) {
            System.out.println("C");
        }
        if (userGrade <= 70 && userGrade >= 67) {
            System.out.println("C-");
        }

        //D
        if (userGrade <= 66 && userGrade >= 65) {
            System.out.println("D+");
        }
        if (userGrade <= 64 && userGrade >= 62) {
            System.out.println("D");
        }
        if (userGrade <= 61 && userGrade >= 60) {
            System.out.println("D-");
        }

        //F
        if (userGrade <= 59 && userGrade >= 55) {
            System.out.println("F+");
        }
        if (userGrade <= 54 && userGrade >= 40) {
            System.out.println("F");
        }
        if (userGrade <= 39 && userGrade >= 0) {
            System.out.println("F-");
        }
        System.out.println("continue? y/n");
        resp = sc.next();
    }while(resp.equals("y"));

    //      EX 3

//    String resp = "";
//    do {
//        System.out.println("Starting from 1, identify max range:");
//        long userInput = sc.nextInt();
//        System.out.println("Number Table:");
//        long numSqr = userInput * userInput;
//        long numCub = userInput * userInput * userInput;
//        System.out.println("number\t| squared\t| cubed");
//        System.out.println("------\t| -------\t| -----");
//        long i;
//
//        for (i = 1; i <= userInput; i++) {
//            System.out.println(i + "\t\t" + "| " + (i * i) + " \t\t" + "| " + (i * i * i)); //instru used %d to populate the table w %n", y, y*y, y*y*y);
//            if (i == 1) {
//                System.out.println("Would you like to continue? y/n:");
//            resp = sc.next();
//                if (resp.equals("n")) {
//                    break;
//                }
//            }
//        }}while(resp.equals("y"));


    //      EX 2

//    for (int num = 1; num <= 100; num++) {
//
//        if (num%15==0) {
//            System.out.print("FizzBuzz" + " ");
//        }else if (num%3==0){
//            System.out.print("Fizz" + " ");
//        }else if (num%5==0){
//            System.out.print("Buzz" + " ");
//        }else{
//            System.out.print(num + " ");
//        }
//    }

    //      EX 1

//    long i = 5;
//
//    while (i <= 15) {
//        System.out.print(" " + i++);
//    }

//    int q = 0;
//    do {
//        System.out.println(q);
//        q += 2;
//    } while (q <= 100);

//    int p = 100;
//    do {
//        System.out.println(p);
//        p -= 5;
//    } while (q >= -10);

//    long f = 2L;//L is for long and is good practice to add for safety
//    do{
//        System.out.println(f);
//        f *= f;
//    }while(f < 1000000);

// ex 1c/a/1

//    for (int i = 5; i <= 15; i++) {
//        System.out.println(i + " ");
//    }
//
//// ex 1c/a/2
//
//// ex 1c/a/3
//
//// ex 1c/b/1
//
//// ex 1c/b/2
//
//// ex 1c/b/3
//
//    for (int q = 0; q <= 100; q += 2) {
//        System.out.println(q);
//    }


//===========NOTES==========

        // ==================== Slide 3

        // no >== ,or <==, or === because only value comparisons are available
        // truthy and falsy values don't exist in Java

        //comparison
//        if (2 > 1 && true || false) {
//            System.out.println("this runs");
//        }
        //if (2) {
        //System.out.println("this does not run"); throws exception bc:
    //}

                // ==================== Slide 5

                // && will only check second value if first is true
                // & will check both
                // this can be used to check what would otherwise result in a syntax error
                // same comparison process for || and |

                // x will only increment in second condition if first condition is true using &&
//                int x = 2;
//                int y = 3;
//
//                if (false && ++x == y) {
//                    System.out.println("Equal");
//                } else {
//                    System.out.println("Not equal");;
//                }
//                System.out.println(x);

                            //with ++x == y), checked to see if will eval
                                //shows x is still 2 bc && will not check second half
                                //if the first half is false
                                //& will eval both sides, come out same here tho
                                //real world, &&, bc 2nd half cut out if already not true
                                //could be preventative

                // ==================== Slide 7

                // DO NOT COMPARE STRINGS WITH == !!!!

//                Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine();
//                String cat2 = "cat";
//                System.out.println(cat1);
//                System.out.println(cat2);
//                System.out.println(cat1 == cat2);
                            //see notes for this type of string comparison, use .equals method

        //System.out.ignoreCaseEquals(cat1.equals(cat2));
                    //gives true

                // do use equals(),
            //can compare string literals such as:
//    boolean stringValuesAreEqual = "Test".equals("Tes");
//    System.out.printf("The result is: %s", stringValuesAreEqual);
        //false

        //use bang ! also:
        //String tech = "tech";
        //System.out.println(!tech.equalsIgnoreCase("tool"));
            //true, they are not equal


                // or use equalsIgnoreCase()

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

                // does not equal

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));


                // ==================== Slides 8 - 16

                // basically the same as JS :)


//            String caseSwitch = "Fred";
//            switch (caseSwitch) {
//                case "bob":
//                    System.out.println("Case 1");
//                    break;
//                case "fred":
//                    System.out.println("Case 2");
//                    break;
//                default :
//                    System.out.println("Default case");
//                    break;
//            }


            }
        }


