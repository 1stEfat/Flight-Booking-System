package flightbooking;
public class Admin {
    private String adminId;
    private String username;
    private String password;
    public Admin() {
    }
    public Admin(String adminId, String username, String password) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
    }
    public String getAdminId() {
        return adminId;
    }
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    public void logout() {
    this.username = null;
    this.password = null;
    System.out.println("Logged out successfully.");
    }
}

    

