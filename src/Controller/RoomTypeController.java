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
        List<Map<String, Object>> rooms = RoomController.getAll();
        for(Map<String, Object> room : rooms){
            if((int) room.get("RoomTypeID") == id){
                RoomController.delete((int) room.get("ID"));
            }
        }
        RoomTypeModel.mDelete(id);
    }

    public static void deleteWhere(String condition) {
        RoomTypeModel.mDeleteWhere(condition);
    }

    public static void insert(Map<String, Object> data) {
        RoomTypeModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        RoomTypeModel.mUpdate(id, data);
    }

    public static int getID(String Name) {
        return RoomTypeModel.mgetID(Name);
    }

    public static String getName(int ID) {
        return RoomTypeModel.mgetName(ID);
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
        List<Map<String, Object>> data = getAll();
        System.out.println(data);

    }
}
