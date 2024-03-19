package Model;

import java.sql.*;
import java.util.*;

import Core.ConnectDB;

public class BaseModel {

    // Hàm bmGetAll trả về danh sách dữ liệu từ bảng được chỉ định
    public static List<Map<String, Object>> bmGetAll(String tableName) {
        List<Map<String, Object>> dataList = new ArrayList<>();
        try (Connection conn = ConnectDB.getConnection()) {
            String sql = "SELECT * FROM " + tableName;
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        // Lấy các cột dữ liệu từ ResultSet
                        ResultSetMetaData metaData = rs.getMetaData();
                        int columnCount = metaData.getColumnCount();
                        Map<String, Object> rowData = new HashMap<>();
                        for (int i = 1; i <= columnCount; i++) {
                            String columnName = metaData.getColumnName(i);
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

    // Hàm xóa dữ liệu từ bảng được chỉ định dựa trên ID
    public static void bmDelete(String tableName, int id) {
        try (Connection conn = ConnectDB.getConnection()) {
            String sql = "DELETE FROM " + tableName + " WHERE ID = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                System.out.println("Đã xóa thành công dữ liệu với ID = " + id + " từ bảng " + tableName);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void bmInsert(String tableName, Map<String, Object> data) {
        try (Connection conn = ConnectDB.getConnection()) {
            StringBuilder columns = new StringBuilder();
            StringBuilder values = new StringBuilder();

            for (Map.Entry<String, Object> entry : data.entrySet()) {
                columns.append(entry.getKey()).append(",");
                values.append("?,");
            }
            columns.deleteCharAt(columns.length() - 1); // Xóa dấu phẩy cuối cùng
            values.deleteCharAt(values.length() - 1); // Xóa dấu phẩy cuối cùng

            String sql = "INSERT INTO " + tableName + " (" + columns + ") VALUES (" + values + ")";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                int index = 1;
                for (Object value : data.values()) {
                    if (value instanceof Integer) {
                        stmt.setInt(index, (Integer) value);
                    } else if (value instanceof String) {
                        stmt.setString(index, (String) value);
                    } // Thêm các kiểu dữ liệu khác nếu cần

                    index++;
                }
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void bmUpdate(String tableName, int id, Map<String, Object> data) {
        try (Connection conn = ConnectDB.getConnection()) {
            StringBuilder setClause = new StringBuilder();

            for (Map.Entry<String, Object> entry : data.entrySet()) {
                setClause.append(entry.getKey()).append("=?,");
            }
            setClause.deleteCharAt(setClause.length() - 1); // Xóa dấu phẩy cuối cùng

            String sql = "UPDATE " + tableName + " SET " + setClause + " WHERE ID=?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                int index = 1;
                for (Object value : data.values()) {
                    if (value instanceof Integer) {
                        stmt.setInt(index, (Integer) value);
                    } else if (value instanceof String) {
                        stmt.setString(index, (String) value);
                    } // Thêm các kiểu dữ liệu khác nếu cần

                    index++;
                }
                stmt.setInt(index, id); // Thiết lập ID cho điều kiện WHERE
                stmt.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
 
}
