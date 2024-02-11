package src.Interface;

public class Car implements Break,Engine{

    void Strat(){
        System.out.println("Car started!");
        StartEngine();
        Break();
    }


    @Override
    public void StartEngine() {
        System.out.println("Enginee started");

    }

    @Override
    public void Break() {
        System.out.println("Break is working fine");

    }


}

