package Model;

import java.sql.*;
import java.util.*;

import Core.ConnectDB;

public class BookingModel extends BaseModel {

    private static final String TABLE_NAME = "booking";

    public static List<Map<String, Object>> mGetAll() {
        return bmGetAll(TABLE_NAME);
    }

    public static Map<String, Object> mGetByID(int id) {
        return bmGetByID(TABLE_NAME, id);
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

    public static List<Map<String, Object>> mGetAllFK() {
//        List<Map<String, Object>> results = bmGetAll(TABLE_NAME);

        List<Map<String, Object>> dataList = new ArrayList<>();
        try (Connection conn = ConnectDB.getConnection()) {
            String sql = String.format(
                    "SELECT booking.*, hotels.Name AS HotelName FROM %s INNER JOIN rooms ON booking.RoomID=rooms.ID INNER JOIN hotels ON rooms.HotelID = hotels.ID",
                    TABLE_NAME
            );
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        // Lấy các cột dữ liệu từ ResultSet
                        ResultSetMetaData metaData = rs.getMetaData();
                        int columnCount = metaData.getColumnCount();
                        Map<String, Object> rowData = new HashMap<>();
                        for (int i = 1; i <= columnCount; i++) {
                            String columnName = metaData.getColumnLabel(i);
                            Object value = rs.getObject(i);
                            rowData.put(columnName, value);
                        }
                        dataList.add(rowData);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        List<Map<String, Object>> results = dataList;

        for (int i = 0; i < results.size(); i++) {
            Map<String, Object> map = results.get(i);
            map.put("NumberRoom", RoomModel.mgetName(((Integer) map.get("RoomID")).intValue()));
            map.put("GuestFullName", GuestModel.mgetName(((Integer) map.get("GuestID")).intValue()));
        }
        return results;
    }

    public static boolean isBookingConflict(int roomID, String checkIn, String checkOut) {
        String query = "SELECT COUNT(*) FROM booking "
                + "WHERE RoomID = ? "
                + "AND ((CheckIn BETWEEN ? AND ?) OR (CheckOut BETWEEN ? AND ?) OR "
                + "(CheckIn < ? AND CheckOut > ?))";

        try (Connection conn = ConnectDB.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            // Đặt các tham số cho câu truy vấn
            stmt.setInt(1, roomID);
            stmt.setString(2, checkIn);
            stmt.setString(3, checkOut);
            stmt.setString(4, checkIn);
            stmt.setString(5, checkOut);
            stmt.setString(6, checkIn);
            stmt.setString(7, checkOut);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // Trả về true nếu có xung đột, ngược lại trả về false
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Trả về false nếu có lỗi xảy ra hoặc không tìm thấy dữ liệu
    }

    public static List<Map<String, Object>> mGetBookingService(int BookingID) {
        List<Map<String, Object>> dataList = new ArrayList<>();
        try (Connection conn = ConnectDB.getConnection()) {
            String sql = "SELECT syn_booking_services.*, services.Name, services.Price FROM syn_booking_services INNER JOIN services ON syn_booking_services.ServiceID=services.ID WHERE BookingID = "+BookingID;
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        // Lấy các cột dữ liệu từ ResultSet
                        ResultSetMetaData metaData = rs.getMetaData();
                        int columnCount = metaData.getColumnCount();
                        Map<String, Object> rowData = new HashMap<>();
                        for (int i = 1; i <= columnCount; i++) {
                            String columnName = metaData.getColumnLabel(i);
                            Object value = rs.getObject(i);
                            rowData.put(columnName, value);
                        }
                        dataList.add(rowData);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dataList;
    }

}
