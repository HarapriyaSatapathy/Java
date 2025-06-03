package src.Revision.Exceptionhandling;

public class Lab001 {
    public static void main(String[] args) {
        Lab001 t = new Lab001();
        t.print();

    }

    public void print() {
        try {
            int a = 0;
            int b = 10 / a;
            System.out.println(b);


        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Not divisable by 0");
        }


    }
}
