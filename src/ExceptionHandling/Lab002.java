package src.ExceptionHandling;

public class Lab002 {
    public static void main(String[] args) {
        try {
            String a = args[0];
            int x = Integer.parseInt(args[0]);
            int y = 10 / x;
            System.out.println(x);
            System.out.println(y);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException |NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter the valid details");
        }
    }
}

//Currently this code will only work of we pass commmand line args
//if we wont pass argument then its arrayoutof index exception
//if we pass any string args, then its NumberformatException
//so lets handle all exceptions that jvm already knows(checked exceptions)
//its always good if you know the type of exception then put it in the catch block
//instaed of putting Exception