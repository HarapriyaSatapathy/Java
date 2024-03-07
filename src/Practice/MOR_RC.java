package src.Practice;

public class MOR_RC {
    public static void main(String[] args) {

        MOR m=new MOR();
        System.out.println(m.Sum(3,4));
        MOR1 m2=new MOR1();
        System.out.println(m.Sum(3,4));


    }

}//This concept is called Method overriding, where same method,same argument,same data type
//but JVM knows which method to call during runtime by follwing the object creation
