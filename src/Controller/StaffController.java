package Controller;

import Model.*;
import java.util.*;

public class StaffController {

    public StaffController() {
        System.out.println("Run StaffController..");
    }

    public static List<Map<String, Object>> getAll() {
        return StaffModel.mGetAll();
    }

    public static void delete(int id) {
        StaffModel.mDelete(id);
    }

    public static void insert(Map<String, Object> data) {
        StaffModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        StaffModel.mUpdate(id, data);
    }

    public static List<Map<String, Object>> getAllFK() {
        return StaffModel.mGetAllFK();
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
        List<Map<String, Object>> data = getAllFK();
        System.out.println(data);

    }
}
