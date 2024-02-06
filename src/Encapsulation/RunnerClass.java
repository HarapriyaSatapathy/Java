package src.Encapsulation;

public class RunnerClass {
    public static void main(String[] args) {



        Login l=new Login("admin","admin");
        l.getUsername();
        System.out.println(l.getUsername());
        l.getPassword();
        System.out.println(l.getPassword());
        l.setUsername("testadmin");
        System.out.println(l.getUsername());
       // l.setpassword();//not possible as we have not created setter method for password






        l.LoggedIn();

        }
    }

