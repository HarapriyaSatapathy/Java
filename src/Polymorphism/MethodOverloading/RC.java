package src.Polymorphism.MethodOverloading;

public class RC {
    public static void main(String[] args) {
        Gift g=new Gift();
        g.Gift(10);
        g.Gift("Yes");
        g.Gift('Y');
        g.Gift(15);
    }

//Method overloading means same method name but different
    //parameter and return type does not matter

}

