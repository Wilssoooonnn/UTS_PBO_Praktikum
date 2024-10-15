/**
 * User
 */
public class User extends UserProfile {

    public User(int user_id, String password, String name, int age, String email_id) {
        super(user_id, age, password, name, email_id);
    }

    public boolean login(int user_id, String password) {
        if (getUser_id() == user_id) {
            if (getPassword().equals(password)) {
                System.out.println("Login successful");
                return true;
            } else {
                System.out.println("Invalid password");
                return false;
            }
        } else {
            System.out.println("Invalid user id");
            return false;
        }
    }

    public void recoverPassword(String newPassword) {
        super.setPassword(newPassword);
        System.out.println("Password recovery successful");
    }

    public void logout() {
        System.out.println("Logout successful");
    }
}
