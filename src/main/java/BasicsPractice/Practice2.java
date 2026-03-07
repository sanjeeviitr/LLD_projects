package BasicsPractice;

import com.sun.security.jgss.GSSUtil;

import java.util.List;

public class Practice2 {

//    public static int count = 0;
//    public String name = "two";
//
//
//    public void sum() {
//        int t = 100;
//        int l = 0;
//        try {
//            int res = t / l;
//            System.out.println(res);
//        } catch (ArithmeticException e) {
//            System.out.println("Can't divide by 0");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            System.out.println("Sum method ran");
//        }
//    }
//
//    public static int findElement(int[] num){
//        return num[10];
//    }
//
//    public static void main(String[] args) {
//        int[] num= {1, 2, 3};
//        try {

    /// /            System.out.println(findElement(num));
//            System.out.println(divide(2,0));
//        }
//        catch (ArrayIndexOutOfBoundsException | InValidDivisionException ex){
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public static int divide(Integer num1, Integer num2) throws InValidDivisionException {
//        try {
//            return num1/num2;
//        } catch (ArithmeticException ex) {
//            throw new InValidDivisionException("Can't be divided by zero");
//        } catch (NullPointerException ex) {
//            System.out.println("Numbers can't be null");
//            return -1;
//        } finally {
//            System.out.println("Divide method executed");
//        }
//    }
//
//    public static class InValidDivisionException extends Exception{
//        public InValidDivisionException(String message){
//            super(message);
//        }
//    }

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age can't be less than 18");
        }

        System.out.println("user registered successfully");
    }

    public static void main(String[] args) {
        try {
            registerUser(17);
        }
        catch (InvalidAgeException ex){
            System.out.println("handled");
        }

    }


}
