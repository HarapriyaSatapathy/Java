package src.InheritnaceHierarchical;

public class RunnerClass {
    public static void main(String[] args) {
        Truck t=new Truck();
        Car c=new Car();
        Vehicle v=new Vehicle();

        Vehicle v1=new Car();//because car extends Vehicle, so vehicle ref can create Car object
        Vehicle v2=new Truck();//because Truck extends Vehicle, so vehicle ref can create Truck object
       // Car c1=new Vehicle();//---This is not possible as child ref can not create parent object



    }


}
