package Model;

import java.sql.*;
import java.util.*;

import Core.ConnectDB;

public class ServiceModel extends BaseModel {

    private static final String TABLE_NAME = "services";

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


}
