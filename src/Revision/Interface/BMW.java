package src.Revision.Interface;

public class BMW implements Car{
    @Override
    public void Start() {
        System.out.println("BMW---Started");
    }

    @Override
    public void Stop() {
        System.out.println("BMW--Stopped");

    }

    @Override
    public void refuel() {
        System.out.println("BMW--Refueled");

    }

    public void Myown(){
        System.out.println("BMW---Own method");
    }

    @Override
    public void behave() {
        Car.super.behave();
    }
}
