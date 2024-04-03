package Model;

import java.sql.*;
import java.util.*;

import Core.ConnectDB;

public class BookingModel extends BaseModel {

    private static final String TABLE_NAME = "booking";

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

}
