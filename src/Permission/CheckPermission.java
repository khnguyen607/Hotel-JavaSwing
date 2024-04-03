package Permission;

import Core.ConnectDB;
import java.sql.*;

public class CheckPermission {

    private String permission;
    private String fullName;

    public String getPermission() {
        return permission;
    }

    public String getFullName() {
        return fullName;
    }

    // Hàm kiểm tra tài khoản và mật khẩu
    public boolean checkPermission(String username, String password) {
        String query = "SELECT Permission, FullName FROM users WHERE username = ? AND password = ?";
        try (Connection conn = ConnectDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                permission = rs.getString("Permission");
                fullName = rs.getString("FullName");
                return true; // Trả về true nếu tài khoản và mật khẩu đúng
            }
            return false; // Trả về false nếu không tìm thấy tài khoản và mật khẩu
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        // Tạo một đối tượng CheckPermission
        CheckPermission checker = new CheckPermission();

        // Kiểm tra tài khoản và mật khẩu
        String username = "employee";
        String password = "employee";
        if (checker.checkPermission(username, password)) {
            // Nếu tài khoản và mật khẩu đúng, in ra thông tin quyền và tên đầy đủ
            System.out.println("Permission: " + checker.getPermission());
            System.out.println("Full Name: " + checker.getFullName());
        } else {
            // Nếu tài khoản và mật khẩu không đúng, thông báo lỗi
            System.out.println("Invalid username or password.");
        }
    }

}
