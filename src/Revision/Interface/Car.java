package src.Revision.Interface;

public interface Car {

    void Start();

    void Stop();

    void refuel();

    default void behave(){
        System.out.println("I am the default method of interface");

    }
}
