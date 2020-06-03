import java.util.Arrays;

public class ControlFlowExercises {
    public static void main(String[] args) {

    long i = 2;

//    while (i <= 15) {
//        System.out.print(" " + i++);
//    }

    for (long i = 5; i <= 15; " " + i++) {
        System.out.println(i);
    }

//    do {
//        System.out.println(i);
//        i *= i;
//    } while (i < 1000000);

    for (i; i < 1000000; i *= i) {
        System.out.println(i);
    }













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


