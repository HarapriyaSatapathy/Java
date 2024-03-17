package src.StaticKeyword;

public class Static {


    String name="Rinky";
    static String Section="B section";

    static String university="ATB";


    void Students (){
        System.out.println("I am a student");
        System.out.println("My name is-->"+ name);
        System.out.println("My Section is-->"+ Section);//We can use static varibale in a non static
        //method
    }

    static void Univ(){
        System.out.println("Unversity belongs to ATB");
       // System.out.println("My name is-->"+ name);//Instance variable can not be used in static method
        //as teh object is not yet created and static method will be present at common area before
        //object creation
        System.out.println("My Section is-->"+ Section);

    }
}
