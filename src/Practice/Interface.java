package src.Practice;

public interface Interface {

        int a=10;



    default void print(){
        System.out.println("I am a simple default");
    }

    static void print2(){
        System.out.println("I am a static method");
    }


}

