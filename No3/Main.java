import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Membuat Daftar Dokumen
        List<String> userDocs = new ArrayList<>();
        userDocs.add("KTP.jpg");
        userDocs.add("KK.pdf");

        // Membuat objek Customer
        Customer customer = new Customer(1, "password123", "Alice", 25, "alice@example.com");

        // Edit customer
        customer.editProfile(100, 26, "123", "Adam", "Adamn@example.com");
        System.out.println("----------------------------");

        // Login Customer
        // Gagal login karena data customer diedit
        customer.recoverPassword("1323");
        // Login akan berhasil kali ini karena password telah direcover
        if (customer.login(100, "1323")) {
            System.out.println("----------------------------");
            System.out.println("Welcome, " + customer.getName());
            customer.getDocs().addAll(userDocs); // Menambahkan dokumen ke customer
            customer.applyVerification(customer.getDocs()); // Mengajukan verifikasi
            customer.showDocs(); // Menampilkan dokumen pengguna
            System.out.println("----------------------------");
        } else {
            System.out.println("Login failed.");
            System.out.println("----------------------------");
        }

        // Membuat objek Admin
        Admin admin = new Admin(2, "pass", "Admin", 30, "admin@example.com");

        // Login sebagai Admin
        if (admin.login(2, "pass")) {
            System.out.println("----------------------------");
            System.out.println("Admin logged in. Welcome, " + admin.getName());
            admin.verifyUser(customer); // Verifikasi user Customer
            admin.updateVehicleDetails(101); // Update detail kendaraan
            admin.addVehicle(); // Menambahkan kendaraan
            System.out.println("----------------------------");

        } else {
            System.out.println("Admin login failed.");
            System.out.println("----------------------------");
        }
    }
}