package src.ExceptionHandling;

public class Lab006 {
    public static void main(String[] args) {

        try {
            sum();
        }
        catch(Exception e){
            e.getMessage();
        }
        System.out.println("ABC");//exception handled by the calling method.

    }

    public static void sum(){
      div();
    }

    public static void div() throws ArithmeticException{
        int i=9/0;
    }

}
