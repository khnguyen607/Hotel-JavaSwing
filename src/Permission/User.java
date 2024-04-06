package Permission;

public class User {

    private static User instance;
    private String fullName;
    private String permission;
    private int ID;

    // Private constructor để ngăn chặn việc tạo đối tượng User từ bên ngoài
    private User() {
    }

    // Phương thức getInstance để truy cập đến đối tượng duy nhất của User
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
