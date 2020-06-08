public class RecursionLecture {
    public static void count(int n) {
        //note if
        if (n <= 0) {
            System.out.println("All done!");
            //note return(def: exits the meth/fx
            return;
        }
        System.out.println(n);
        count(n - 1);
    }
// getPower using for loop

//    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }

// recursion, easier to understand here...if is designating the exceptions

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }
        //recursion good for sets of fxality, recurring meths, might get too messy to just do a loop
        //recursion speeds up apps bc it calls itself saving space and bandwidth, efficient
            //example, family tree, can find what a loop needs through noting the exeptions, or
                //noting the special considerations, exceptions

    public static void main(String[] args) {
        System.out.println(getPower(3,5));
        //3 * getPower(3,4); //first return, then goes around again
        //3 * 3 * getPower(3,3); //second return, still does not meet exceptions so
        //3 * 3 * 3 * getPower(3,2); //recursive is checking for ______
        //which is actually: 3*3*3*3
            //again
            //
        count(5);
        //first thing it does is print 5, then calls count(5-1)
        //so prints 4, calls count(4-1)...
        //prints 3, 2, 1 finally then calls count(1-1), 0, taken back to beginning
        //since n is zero, prints "All done!" then exits program
        //so we've created an exception statement and a stoppling condition with if
        getPower(2,0);

    }
    //shelby to see how it plays out visually using some souts
    //public static long getPower(int base, int exponent) { 
    // if (exponent == 0) { 
    // return 1; 
    // } else if (exponent == 1) { 
    // return base; 
    // } else if (exponent == 2) { 
    // return base * base; 
    // } 
    // System.out.println("base: " + base); 
    // System.out.println("exponent: " + exponent); 
    // long count = base * getPower(base, exponent - 1); 
    // System.out.println("current count: " + count); 
    // return count; 
    // } 
    // ^ visual for me…helped me understand 
}
