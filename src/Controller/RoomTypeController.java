package Controller;

import Model.*;
import java.util.*;

public class RoomTypeController {
    
    public RoomTypeController() {
        System.out.println("Run RoomTypeController..");
    }

    public static List<Map<String, Object>> getAll() {
        return RoomTypeModel.mGetAll();
    }

    public static void delete(int id) {
        RoomTypeModel.mDelete(id);
    }

    public static void insert(Map<String, Object> data) {
        RoomTypeModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        RoomTypeModel.mUpdate(id, data);
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
        List<Map<String, Object>> data = getAll();
        System.out.println(data);
        
        
    }
}
