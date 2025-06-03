package src.Revision.Encapsulation;

public class Runner {
    public static void main(String[] args) {
        Credentials cr=new Credentials("admin", "password");

       boolean check=cr.IsLoggedin("admin","admin123");
        System.out.println(check);
        // cr.password="admin123";
        System.out.println(cr.getUsername());
        System.out.println(cr.getPassword());
        cr.setUsername("Test");
        System.out.println(cr.getUsername());
        System.out.println(cr.getPassword());



        }



    }



