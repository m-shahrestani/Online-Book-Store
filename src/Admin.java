public class Admin {
    private int username;
    private String password;

    public Admin(int username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}