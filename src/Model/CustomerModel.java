package Model;

import java.sql.*;
import java.util.*;

import Core.ConnectDB;

public class CustomerModel extends BaseModel {

    public static List<Map<String, Object>> mGetAll() {
        return bmGetAll("customers");
    }

    public static void mDelete(String tableName, int id) {
        bmDelete(tableName, id);
    }

    public static void mInsert(String tableName, Map<String, Object> data) {
        if (tableName == null || tableName.isEmpty() || data == null || data.isEmpty()) {
            return; // Dừng phương thức nếu các tham số không hợp lệ
        }
        bmInsert(tableName, data);
    }

    public static void mUpdate(String tableName, int id, Map<String, Object> data) {
        if (tableName == null || tableName.isEmpty() || data == null || data.isEmpty()) {
            return; // Dừng phương thức nếu các tham số không hợp lệ
        }
        bmUpdate(tableName, id, data);
    }
}
