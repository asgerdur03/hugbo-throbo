package verkefni.verkefnihbvvol30000;

public class User {
    String userName;
    String userEmail;
    String userPassword;

    public User(String userName, String userEmail, String userPassword){
        this.userName=userEmail;
        this.userEmail=userEmail;
        this.userPassword=userPassword;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

}
