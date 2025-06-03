package src.Revision.Polymorphism.MethodOverriding;

public class RC {
    public static void main(String[] args) {
        Flower f=new Flower();
        f.smell();
        Flower f2=new Rose();
        f2.smell();

    }
}
