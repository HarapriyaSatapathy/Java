package src.ExceptionHandling;

public class Lab001 {
    public static void main(String[] args) {
        try {
            String s = null;
            s.trim();//NullPointer excpetion--here during complilation JVM does not have idea whether this program
            // will give exception, so its unchecked exception. But we can handle it
            //by try catch finally blocks
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I will be 100% executed");
        }

    }
}
