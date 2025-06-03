package src.Revision.Encapsulation;

public class Credentials {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }


    private String username;
    private String password;


    public Credentials (String Username, String Password){
        this.username=Username;
        this.password=Password;

    }

    boolean IsLoggedin(String uname, String pass){
        if(this.username.equalsIgnoreCase(uname)&& this.password.equalsIgnoreCase(pass)){
            System.out.println("Correct credentials");
            return true;
        }

        else{
            System.out.println("Incorrect Credentials");
        }
        return false;
    }
}
