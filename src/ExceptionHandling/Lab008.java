package src.ExceptionHandling;

public class Lab008 {
    public static void main(String[] args) {
        System.out.println("Hello");

        String s = "noname";
        if (s.equals("noname")) {
            try {
                throw new Exception("My own custom exception");
            } catch (Exception e) {
                e.getMessage();


            }
            System.out.println("xyz");

        }


    }
}
