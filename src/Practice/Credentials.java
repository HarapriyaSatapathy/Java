package src.Practice;

public class Credentials {

    public String getUsername() {
        return username;
    }

//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }

    private String username;
    private String password;

    Credentials(String uname, String pass) {
        this.username = uname;
        this.password = pass;
    }

    boolean isLoggedin(String uname,String pass) {
        if (this.username.toLowerCase().equals(uname) && this.password.toLowerCase().equals(pass)) {
            System.out.println("Logged in");
            return true;
        } else {
            System.out.println("Bad credentials");
         return false;
        }

    }

}
