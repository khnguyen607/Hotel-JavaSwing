package Controller;

import Model.*;
import java.util.*;

public class HotelController {
    
    public HotelController() {
        System.out.println("Run HotelController..");
    }

    public static List<Map<String, Object>> getAll() {
        return HotelModel.mGetAll();
    }

    public static void delete(int id) {
        HotelModel.mDelete(id);
    }

    public static void insert(Map<String, Object> data) {
        HotelModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        HotelModel.mUpdate(id, data);
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
        List<Map<String, Object>> data = getAll();
        System.out.println(data);
        
        
    }
}
