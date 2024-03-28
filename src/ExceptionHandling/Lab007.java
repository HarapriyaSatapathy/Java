package src.ExceptionHandling;

public class Lab007 {
    public static void main(String[] args) {

        try {
            sum();
        }
        catch(Throwable e){
            e.getMessage();
        }
        System.out.println("ABC");//Throwable is the super class of all the erors and exceptions
        //when we are not sure whether we will get error or exception,insted of exception we can use Throwable

    }

    public static void sum(){
      div();
    }

    public static void div() throws ArithmeticException{
        int i=9/0;
    }

}
