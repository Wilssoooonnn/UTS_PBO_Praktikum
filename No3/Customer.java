import java.util.List;

/**
 * Customer
 */
public class Customer extends User {
    private boolean verificationStatus;

    public Customer(int user_id, String password, String name, int age, String email_id) {
        super(user_id, password, name, age, email_id);
        this.verificationStatus = false;
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(List<String> docs) {
        if (!docs.isEmpty()) {
            this.verificationStatus = true;
            System.out.println("Verification successful");
        } else {
            System.out.println("Verification failed");
        }
    }
}
