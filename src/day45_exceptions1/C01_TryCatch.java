package day45_exceptions1;

public class C01_TryCatch {



    public static void main(String[] args) {

        int number1 = 20;
        int number2 = 0;

        /*
        When we write codes. if we can foresee a problem before it happens
        We can try-catch to offer a solution for that problem.
        As a result java can continue to run

         */


        try {
            System.out.println(number1/number2); // ArithmeticException
        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
            //System.out.println(arithmeticException.getMessage());

            System.out.println("an ArithmeticException is handled.....");
        }


        System.out.println("*****************code ended here***************");

    }

         /*

        When an exception occurs in try catch blocks the rest of the code will be ignored

        Java will directly jump to the catch block

        If no exceptions occurs, codes will be executed without any problem and we won't be able to see
        " you can not use zero for the second number" message

         */




}
