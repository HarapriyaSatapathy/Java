package src.Polymorphism.MethodOverloading;

public class Gift {

    void Gift(int a){
        System.out.println("Got from my sister");
    }

    void Gift(String b){
        System.out.println("Got from my bro");
    }

    void Gift(char c){
        System.out.println("Should i return");
    }
}
//Method overloading means same method name but different
//attribute and return type does not matter