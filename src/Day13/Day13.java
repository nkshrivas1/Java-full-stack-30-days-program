package Day13;

import java.io.IOException;

public class Day13 {
    public static void readFile() throws IOException{

    }
    static void main()  {
        //Exception- is an unexpected event that occurs during program execution and interupts normal
        // flow of our program
        // to manage these we use exception handling
//        object
//                throwable
        // error  exception
        // error - syntax error ,stackoverflowerror,outofmemoryerror
        // exceptions-arithmeticexception,indexoutofbound,nullpointerexception,ioexception
        // throw keyword - throw exception
        // throws keyword - declare exception
        // Custom exception
        int a = 10;
        int b = 02;
        try {
            readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            int[] arr = {10000,13000,4000};
            for(int amount : arr) {
                if (amount > 10000) {
                    //self thrown exception
                    throw new ArithmeticException("Limit Exceeded");
                }else{
                    System.out.println("Collect your amount "+amount);
                }
            }
//            arr[5] = 8;
//            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index is greater than length of array");
        }finally {
            // it will executes whether exception occurs or not
            System.out.println("divide ended");

        }
        System.out.println("divided");
        int age =17;
        try {
            if (age < 18) {
                throw new AgeException("Not Eligible");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
// custom exception-
class AgeException extends Exception{
    public  AgeException(String msg){
        super(msg);
    }
}
//login authentication
// password length,some condition,invalid cred,password required