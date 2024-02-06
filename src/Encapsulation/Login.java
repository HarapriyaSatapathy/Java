package src.Encapsulation;

public class Login {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    private String password;


    Login(String Username, String Password) {
        this.username = Username;
        this.password = Password;


    }

    void LoggedIn() {
        if (username.toLowerCase().equals(username) && password.toLowerCase().equals(password)) {
            System.out.println("Loggedin");
        } else {
            System.out.println("Log in failed");
        }
    }
}


