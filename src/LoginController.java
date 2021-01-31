public class LoginController {
    private DataBase db;
    public LoginController() {
        db = new DataBase();
    }
    public void signInCustomer(int username, String password){
        int usernameFlag = 0;
        int passwordFlag = 0;
        for(Customer customer : db.getCustomers()){
            if(customer.getPassword().equals(password)){
                passwordFlag = 1;
                break;
            }
            if(username == customer.getUsername()){
                usernameFlag = 1;
                break;
            }
        }
        if(passwordFlag == 1 && usernameFlag == 1){
            System.out.println("Successful");
        }else if(passwordFlag == 0 && usernameFlag == 1){
            System.out.println("Password is not valid");
        }else{
            System.out.println("You did not sign up");
        }
    }
    public void signInPublisher(int username, String password){
        int usernameFlag = 0;
        int passwordFlag = 0;
        for(Publisher publisher : db.getPublishers()){
            if(publisher.getPassword().equals(password) && username == publisher.getUsername()){
                passwordFlag = 1;
                break;
            }
            if(username == publisher.getUsername()){
                usernameFlag = 1;
                break;
            }
        }
        if(passwordFlag == 1 && usernameFlag == 1){
            System.out.println("Successful");
        }else if(passwordFlag == 0 && usernameFlag == 1){
            System.out.println("Password is not valid");
        }else{
            System.out.println("You did not sign up");
        }
    }
    public void signInAdmin(int username, String password){
        int usernameFlag = 0;
        int passwordFlag = 0;
        for(Admin admin : db.getAdmins()){
            if(admin.getPassword().equals(password) && username == admin.getUsername()){
                passwordFlag = 1;
                break;
            }
            if(username == admin.getUsername()){
                usernameFlag = 1;
                break;
            }
        }
        if(passwordFlag == 1 && usernameFlag == 1){
            System.out.println("Successful");
        }else if(passwordFlag == 0 && usernameFlag == 1){
            System.out.println("Password is not valid");
        }else{
            System.out.println("You did not sign up");
        }
    }
}
