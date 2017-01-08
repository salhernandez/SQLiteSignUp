package test.sqliteloginsignup;

/**
 * Created by chava on 1/8/2017.
 */

public class User {
    private String username;
    private String password;

    public User(String aUser, String aPass){
        this.username = aUser;
        this.password = aPass;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
