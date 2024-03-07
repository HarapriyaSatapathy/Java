package src.Practice;

public class Newjoiner{

    public static void main(String[] args) {

        Credentials c=new Credentials("admin","admin123");
        boolean logincheck=c.isLoggedin("admin","admin123");
        System.out.println(logincheck);



//        c.username="Admin";
//        c.password="Password123";
       //to hide these data and make it secure, we need encapsulation








    }

}
