public class Admin {
    private int username;
    private String password;
    private DataBase db;

    public Admin(int username, String password) {
        this.username = username;
        this.password = password;
        this.db = new DataBase();
    }

    public int getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
