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
}
