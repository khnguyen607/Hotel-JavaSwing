package Model;

import java.sql.*;
import java.util.*;

import Core.ConnectDB;

public class HotelModel extends BaseModel {

    private static final String TABLE_NAME = "hotels";

    public static List<Map<String, Object>> mGetAll() {
        return bmGetAll(TABLE_NAME);
    }

    public static void mDelete(int id) {
        bmDelete(TABLE_NAME, id);
    }

    public static void mDeleteWhere(String condition) {
        bmDeleteWhere(TABLE_NAME, condition);
    }

    public static void mInsert(Map<String, Object> data) {
        if (TABLE_NAME == null || TABLE_NAME.isEmpty() || data == null || data.isEmpty()) {
            return; // Dừng phương thức nếu các tham số không hợp lệ
        }
        bmInsert(TABLE_NAME, data);
    }

    public static void mUpdate(int id, Map<String, Object> data) {
        if (TABLE_NAME == null || TABLE_NAME.isEmpty() || data == null || data.isEmpty()) {
            return; // Dừng phương thức nếu các tham số không hợp lệ
        }
        bmUpdate(TABLE_NAME, id, data);
    }

    public static int mgetID(String Name) {
        int ID = -1; // Giá trị mặc định trả về nếu không tìm thấy khách sạn

        String sql = "SELECT ID FROM hotels WHERE Name = ?";
        try (Connection conn = ConnectDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Name); // Thêm tham số chuẩn hóa

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ID = rs.getInt("ID");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ID;
    }

    public static String mgetName(int ID) {
        String Name = null; // Giá trị mặc định trả về nếu không tìm thấy tên khách sạn

        String sql = "SELECT Name FROM hotels WHERE ID = ?";
        try (Connection conn = ConnectDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ID); // Thêm tham số chuẩn hóa

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Name = rs.getString("Name");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Name;
    }

}
