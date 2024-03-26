package src.ExceptionHandling;

public class Lab003 {
    public static void main(String[] args) {

        try {
            String s = null;
            s.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error");
            System.exit(0);//if we write system.exit then finally block will never be excuted.
        }

        finally{
            System.out.println("I will be executed");

        }

    }
}

