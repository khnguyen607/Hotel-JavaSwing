package Controller;

import Model.*;
import java.util.*;

public class RoomController {

    public RoomController() {
        System.out.println("Run RoomController..");
    }

    public static List<Map<String, Object>> getAll() {
        return RoomModel.mGetAll();
    }

    public static void delete(int id) {
        RoomModel.mDelete(id);
    }

    public static void insert(Map<String, Object> data) {
        RoomModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        RoomModel.mUpdate(id, data);
    }

    public static int getID(String Name) {
        return RoomModel.mgetID(Name);
    }

    public static List<Map<String, Object>> getAllFK() {
        return RoomModel.mGetAllFK();
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
        List<Map<String, Object>> data = getAll();
        System.out.println(data);

    }
}
