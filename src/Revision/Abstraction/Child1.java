package src.Revision.Abstraction;

public class Child1 extends Father {

    public void  bhk1(){
        System.out.println("Child 1bhk");

    }
    @Override
    public void loan() {
        System.out.println("I will pay the loan");

    }

    @Override
    public void car() {
        System.out.println("Ohh great! I can use my fathers car");

    }
}
