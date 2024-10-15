import java.util.ArrayList;
import java.util.List;

/**
 * UserProfile
 */
public class UserProfile {
    private int user_id, age;
    private String password, name, email_id;
    private List<String> docs;

    public UserProfile(int user_id, int age, String password, String name, String email_id) {
        this.user_id = user_id;
        this.age = age;
        this.password = password;
        this.name = name;
        this.email_id = email_id;
        this.docs = new ArrayList<>();
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail_id() {
        return email_id;
    }

    public List<String> getDocs() {
        return docs;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void editProfile(int newUser_id, int newAge, String newPassword, String newName, String newEmail_id) {
        this.user_id = newUser_id;
        this.age = newAge;
        this.password = newPassword;
        this.name = newName;
        this.email_id = newEmail_id;
    }

    public void showDocs() {
        System.out.println("Documents: " + docs);
    }
}
