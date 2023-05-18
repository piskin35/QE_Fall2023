package day45_exceptions1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_TryCatch3_CheckedExceptions {

    /*
    When Jav can find possible problem before executing code, it is called "checked exception"

    most of the time it happens when we try to write/read a file

    When use throws key word or  try-catch block, red line will disappear

    throws key word does not fix the problem, just we inform Jav we know it can throw an exception.
    instead of throws key words we should use try-catch to prevent unwanted problem

      To handle an exception

        1) try- catch blocks : when we use it we can tell java what to do when the problem occurs
        2) Throw keyword : it only removes red line, that's all. we write it just after the method parameters

     */



    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "src/day45_exceptions1/text1";

        //1.way surround with try-catch
        try {
            FileInputStream fis = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //2. Way indicate exception in the method signature "throws FileNotFoundException"

        FileInputStream fis2 = new FileInputStream(filePath);

        FileInputStream fis3 = new FileInputStream(filePath);

        System.out.println("codes are ended here");

    }
}
