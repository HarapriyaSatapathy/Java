package src.Revision.UpCastDowncasting;

public class RC {

    public static void main(String[] args) {
        Child c=new Child();
        Parent p= new Child();//Downcasting/Dynamic polymorphism/ Dynamic dispatch

      Child c2= (Child) new Parent();//Upcasting
    }
}
