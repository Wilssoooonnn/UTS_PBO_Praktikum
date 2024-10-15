class Admin extends User {
    public Admin(int user_id, String password, String name, int age, String email_id) {
        super(user_id, password, name, age, email_id);
    }

    public void updateVehicleDetails(int vehicleID) {
        System.out.println("Vehicle details updated successfully for vehicle ID: " + vehicleID);
    }

    public void addVehicle() {
        System.out.println("Vehicle added successfully");
    }

    public void retrieveComplaint() {
        System.out.println("Complaint retrieved successfully");
    }

    public void verifyUser(Customer customer) {
        if (customer.getVerificationStatus()) {
            System.out.println("User verified successfully");
        } else {
            System.out.println("User verification failed");
        }
    }
}