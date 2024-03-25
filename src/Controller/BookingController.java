package Controller;

import Model.*;
import java.util.*;

public class BookingController {
    
    public BookingController() {
        System.out.println("Run BookingController..");
    }

    public static List<Map<String, Object>> getAll() {
        return BookingModel.mGetAll();
    }

    public static void delete(int id) {
        BookingModel.mDelete(id);
    }

    public static void insert(Map<String, Object> data) {
        BookingModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        BookingModel.mUpdate(id, data);
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
        List<Map<String, Object>> data = getAll();
        System.out.println(data);
        
        
    }
}
