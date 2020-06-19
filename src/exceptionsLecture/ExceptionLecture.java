package exceptionsLecture;

public class ExceptionLecture {

    public static void main(String[] args) {

        // ================================ SLIDE 3

//        throw new RuntimeException("Something went wrong");

//        String[] names = {"cathy", "bob"};
        //trying to access an non-exist index: Index 10 out of bounds for length 2
//        System.out.println(names[10]);

//        int x = 3;
//        int y = 0;
//
//        System.out.println(x / y);
//
        throw new ArithmeticException("Cannot divide by zero");

        // Exceptions may be thrown

        //checked exception
        //throw new Exception("Uh oh");
            //not allowing a run
        //needs try catch
//        try {
//            throw new Exception ("Uh Oh");
//        } catch(Exception e) {
//            e.printStackTrace();
//            //could do anything else here to keep prog running
//        }

        //here's another: throw new SQLException("Something went wrong");
            //could to try catch
//            ...}catch(SQL..e) {
//                throw new RuntimeException("Error occured when adding a record");
//        }
        //can stop prog alltogether w runtimeexception and immediately if dev on an app:
        //be able to see the problem is happening for sure on "adding a record" if stopping prog there to know for sure, good
        //imp to remember checked exception must handle then (trycatch it)

//        try {
//            throw new Exception("Something went wrong");
//        } catch(NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch(RuntimeException e) {
//            System.out.println("Runtime exception happened");
//        } catch(Exception e) {
//            System.out.println("Something went wrong generally");
//        }
//
//        System.out.println("What will happen?");
//
//        System.out.println("Will this run?????");

        // You have to handle most exceptions that extend from Exception

//            try {
//                // risky things
//                boolean badThingHappened = true;
//                if (badThingHappened) {
//                    throw new Exception("EXCEPTION: you did the bad thing!!!");
//                }
//                System.out.println("This only runs if condition is false");
//            } catch(Exception e) {
//                System.out.println("You did x and it broke");
//                System.out.println(e.getMessage());
//                e.printStackTrace(System.out);
//            }

        // Curriculum Example


//            try {
//                System.out.println("Let's see...");
//                int result = 1 / 0;
//                System.out.println("I can divide by zero!");
//            } catch (ArithmeticException e) {
//                System.out.println("Math still works!");
//                System.out.println(e.toString());
//                System.out.println();
//                e.printStackTrace(System.out);
//            }

//            System.out.println("This will still run");




        // ================================ SLIDE 4

//        int[] numbers = {1, 2, 3};
//        int x = 5;
//        try {
//            x = numbers[1];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception caught!");
//            x = 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("This will always run.");
//            // normally used for "clean up" like closing file streams or DB connections
//        }
//        System.out.println(x);
//        System.out.println("This always runs");



        // we can catch multiple exceptions, including exceptions we defined

//            try {
//                double result;
//                String[] strings = {"Bob", "Fred", "Sally"}; // will not be caught by specific Exception
//                System.out.println(strings[3]);
//            } catch(ArrayIndexOutOfBoundsException e) {
//                System.out.println(e.toString());
//            } catch(Exception e) {
//                System.out.println("This won't run");
//                System.out.println(e.toString());
//            }


        // ================================ SLIDE 5 and 6

//        try {
//            throw new Exception("Bummer. The risky stuff failed. You'll handle it.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        // ================================ SLIDE 7

        // catching a custom exception


//        try {
//            soutName("Bob"); // cannot call soutName without exception handling
//        } catch (NameIsBobException e) {
//            e.printStackTrace();
//        }


        // ================================ SLIDE 8


        // calling a method that handles an exception

//            thisHandlesAnException();

        // using throws in a method, we can kick the responsibility of handling the exception up the chain

//            try {
//                thisMakesAnException();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }

    }

    public static void thisHandlesAnException() {
        try {
            throw new Exception("Yep, an exception again :(");
        } catch (Exception e) {
            System.out.println("EXCEPTION!!!");
            System.out.println(e.getMessage());
        }
    }

    public static void thisMakesAnException() throws Exception {
        throw new Exception("Exception!");
    }

    public static void soutName(String name) throws NameIsBobException {
        if (name.equalsIgnoreCase("bob")) {
            throw new NameIsBobException("NOOOOOOO!!!!");
        } else {
            System.out.println(name);
        }
    }

}